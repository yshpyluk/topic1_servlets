package com.yshpyluk.servlets;

import com.yshpyluk.core.GameType;
import com.yshpyluk.core.games.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class Games extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String gameType = request.getParameter("type");
		Game game = getGame(gameType);

		if (game != null) {
			PrintWriter writer = response.getWriter();
			writer.println(game.initialize());
			writer.println(game.start());
			writer.println(game.play());
			writer.println(game.finish());
		} else {
			response.getWriter().println(
					String.format("Sorry but %1$s game is not supported", gameType));
		}
	}

	private Game getGame(String gameTypeString) {
		GameType gameType;
		try {
			gameType = GameType.valueOf(gameTypeString.toUpperCase());
		} catch (IllegalArgumentException e) {
			return null;
		}

		Game game;
		switch (gameType){
			case BLACKJACK:
				game = new Blackjack();
				break;
			case BILLIARD:
				game = new Billiard();
				break;
			case WARCRAFT:
				game = new Warcraft();
				break;
			case FOOTBALL:
				game = new Football();
				break;
			default:
				throw new NotImplementedException();
		}
		return game;
	}
}
