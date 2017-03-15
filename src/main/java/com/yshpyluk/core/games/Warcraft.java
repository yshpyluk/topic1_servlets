package com.yshpyluk.core.games;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class Warcraft implements Game {
	@Override
	public String initialize() {
		return "Loading map...";
	}

	@Override
	public String start() {
		return "Let's start ";
	}

	@Override
	public String play() {
		return "Gold! Gold! Gold! We need more gold!!!";
	}

	@Override
	public String finish() {
		return "Oops!!! Too much focus on gold! We have been defeated! :(";
	}
}
