package com.yshpyluk.core.impls;

import com.yshpyluk.core.Game;

/**
 * Created by yshpyluk on 3/15/17.
 */
public class Billiard implements Game {
	@Override
	public String initialize() {
		return "Setting up balls on table";
	}

	@Override
	public String start() {
		return "First hit";
	}

	@Override
	public String play() {
		return "Balls are running into holes";
	}

	@Override
	public String finish() {
		return "All balls in holes";
	}
}
