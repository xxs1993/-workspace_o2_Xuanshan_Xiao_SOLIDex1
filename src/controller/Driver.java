package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.*;
import impl.WatchMovieAtHome;
import impl.WatchMovieAtTheater;
import service.AbstractMovieAPI;

public class Driver {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList();
		
		Movie movie = new Movie("all movie");
		ActionMovie actionmovie = new ActionMovie();
		RomanticMovie romanmovie = new RomanticMovie();
		HorrorMovie horrormovie = new HorrorMovie();
		ScifiMovie scifimovie = new ScifiMovie();
		
		WatchMovieAtHome wmah = new WatchMovieAtHome();
		WatchMovieAtTheater wmat = new WatchMovieAtTheater();
		
		movies.add(movie);
		movies.add(scifimovie);
		movies.add(romanmovie);
		movies.add(horrormovie);
		movies.add(actionmovie);
		
		movies.sort(null);
		for(Movie m : movies) {
			wmah.play(m);
		}
		
	}

}
