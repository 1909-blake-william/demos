package com.revature.q.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionDriver {
	public static void main(String[] args) {

		System.out.println(a());

	}

	public static String a() {

		try {
			System.out.println("attempting to login");
			String result = login();
			System.out.println("after login called");
			return result;
		} catch (InvalidCredentialException e) {
			return "invalid credentials";
		} catch (Exception e) {
			e.printStackTrace();
			return "unable to login at this time";
		} finally {
			System.out.println("finally blocks are option and always run");
		}

	}

	/**
	 * Attempts to login
	 * @return
	 * @throws IOException
	 * @throws InvalidCredentialException
	 */
	public static String login() throws IOException, InvalidCredentialException {

		double rand = Math.floor(Math.random() * 3);

		if (rand == 0) {
			return "login success";
		} else if (rand == 1) {
			throw new IOException();
		} else {
			throw new InvalidCredentialException();
		}

	}
}
