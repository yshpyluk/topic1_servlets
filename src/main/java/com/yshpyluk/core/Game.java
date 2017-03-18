package com.yshpyluk.core;

/**
 * Created by yshpyluk on 3/15/17.
 */
public interface Game {
	String initialize();
	String start();
	String play();
	String finish();

	default String triggerGame(){
		String gameProgress = initialize() + "\n" +
						start() + "\n" +
						play() + "\n" +
						finish();
		return gameProgress;
	}
}
