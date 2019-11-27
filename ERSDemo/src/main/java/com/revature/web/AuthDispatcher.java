package com.revature.web;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.model.LoginForm;
import com.revature.model.UserInfo;
import com.revature.util.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthDispatcher implements Dispatcher {
	
	private final UserDao userDao = UserDaoImpl.getInstance();
	private final Logger logger = LogManager.getLogger(getClass());

	AuthDispatcher() {}
	
	@Override
	public boolean supports(HttpServletRequest request) {
		return isForLogin(request) || isForUserInfo(request);
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			// Taking the request body (request.getInputStream())
			// Attempt to marshall that request into an Object of type com.revature.model.LoginForm
			LoginForm form = (LoginForm) Json.read(request.getInputStream(), LoginForm.class);

			// We have a reference to our LoginForm instance
			// Now, we simply defer to the dao to see if the credentials are correct
			UserInfo info = userDao.login(form.getUsername(), form.getPassword());
			// Fira Code
			if (info != null) {
				response.setContentType(Json.CONTENT_TYPE);
				Cookie cookie = new Cookie("currentUser", info.getUsername());
				cookie.setPath("/ERSDemo/api");
				response.addCookie(cookie);

				response.getOutputStream().write(Json.write(info));
				return;
			} else {
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean isForLogin(HttpServletRequest request) {
		return request.getMethod().equals("POST") && request.getRequestURI().equals("/ERSDemo/api/login");
	}

	private boolean isForUserInfo(HttpServletRequest request) {
		return request.getMethod().equals("GET") && request.getRequestURI().equals("/ERSDemo/api/info");
	}

}
