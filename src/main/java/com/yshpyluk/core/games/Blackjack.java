package com.yshpyluk.core.games;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class Blackjack implements Game {
	@Override
	public String initialize() {
		return "Shuffling deck of cards";
	}

	@Override
	public String start() {
		return "Passing cards to players";
	}

	@Override
	public String play() {
		return "Making regular blackjack activity";
	}

	@Override
	public String finish() {
		return "We have a winner";
	}
}
