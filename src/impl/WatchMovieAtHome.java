package impl;

import entity.Movie;
import service.AbstractMovieAPI;

/*
 * Open-Closed Principle
 * */
public class WatchMovieAtHome implements AbstractMovieAPI {
	@Override
	public void play(Movie m) {
		System.out.println("Play movie " + m.getType() + " at home");
	}

	@Override
	public void pause(Movie m) {
		System.out.println("Pause movie " + m.getType() + " at home");
	}

}
