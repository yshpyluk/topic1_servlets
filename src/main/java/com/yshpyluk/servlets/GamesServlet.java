package com.yshpyluk.servlets;

import com.yshpyluk.core.Game;
import com.yshpyluk.core.GameFactory;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class GamesServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String gameType = request.getParameter("type");

		if (gameType == null) {
			response.getWriter().println(
					new StringBuilder()
							.append("Sorry :( \n")
							.append("You didn't provide any game type. \n")
							.append("Please use following URL parameter: type \n")
							.append("With following possible values: \n")
							.append("BLACKJACK\n")
							.append("BILLIARD\n")
							.append("WARCRAFT\n")
							.append("FOOTBALL"));
		}

		try {
			Game game = GameFactory.getGame(gameType);
			String result = game.triggerGame().replace("\n", "<br>");
			request.setAttribute("triggerGame", result);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("GameView.jsp");
			requestDispatcher.forward(request, response);
		} catch (NotImplementedException e) {
			response.getWriter().println(
					String.format("Sorry but %1$s game is not supported", gameType));
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}
