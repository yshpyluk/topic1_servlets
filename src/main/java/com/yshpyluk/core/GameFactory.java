package com.yshpyluk.core;

import com.yshpyluk.core.impls.Billiard;
import com.yshpyluk.core.impls.Blackjack;
import com.yshpyluk.core.impls.Football;
import com.yshpyluk.core.impls.Warcraft;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by yshpyluk on 3/17/17.
 */
public class GameFactory {

	public static Game getGame(String gameTypeString) {
		switch (gameTypeString.toUpperCase()){
			case "BLACKJACK":
				return new Blackjack();
			case "BILLIARD":
				return new Billiard();
			case "WARCRAFT":
				return new Warcraft();
			case "FOOTBALL":
				return new Football();
			default:
				throw new NotImplementedException();
		}
	}
}
