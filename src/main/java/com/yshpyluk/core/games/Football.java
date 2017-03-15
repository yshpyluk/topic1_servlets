package com.yshpyluk.core.games;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class Football implements Game {

	@Override
	public String initialize() {
		return "Waiting until both teams are on field";
	}

	@Override
	public String start() {
		return "Here comes a start sound";
	}

	@Override
	public String play() {
		return "Running on field with ball";
	}

	@Override
	public String finish() {
		return "Too many balls in one gate";
	}
}