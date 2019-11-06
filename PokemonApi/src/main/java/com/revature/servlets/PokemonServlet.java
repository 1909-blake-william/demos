package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daos.PokemonDao;
import com.revature.models.Pokemon;

public class PokemonServlet extends HttpServlet {

	private PokemonDao pokeDao = PokemonDao.currentImplementation;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("To context param: " + req.getServletContext().getInitParameter("To"));
		
		resp.addHeader("Access-Control-Allow-Origin", "http://localhost:5501");
		resp.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		resp.addHeader("Access-Control-Allow-Headers",
				"Origin, Methods, Credentials, X-Requested-With, Content-Type, Accept");
		resp.addHeader("Access-Control-Allow-Credentials", "true");
		resp.setContentType("application/json");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Pokemon> pokemon;

		String trainerName = req.getParameter("trainerName");

		if (trainerName != null) { // find by trainer name
			pokemon = pokeDao.findByTrainerName(trainerName);
		} else { // find all
			pokemon = pokeDao.findAll();
		}

		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(pokemon);

		resp.addHeader("content-type", "application/json");
		resp.getWriter().write(json);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// read the pokemon from the request body
		ObjectMapper om = new ObjectMapper();
		Pokemon p = (Pokemon) om.readValue(req.getReader(), Pokemon.class);

		System.out.println(p);

		int id = pokeDao.save(p);
		p.setId(id);

		String json = om.writeValueAsString(p);
		
		resp.getWriter().write(json);
		resp.setStatus(201); // created status code

	}
}
