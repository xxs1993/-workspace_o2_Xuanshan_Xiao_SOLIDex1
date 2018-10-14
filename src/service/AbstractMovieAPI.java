package service;

import entity.Movie;

public interface AbstractMovieAPI {
	/**
	 * Single Responsibility Principle
	 * Dependency Inversion Principle
	 * 
	 */
	public void play(Movie m);
	public void pause(Movie m);
}
