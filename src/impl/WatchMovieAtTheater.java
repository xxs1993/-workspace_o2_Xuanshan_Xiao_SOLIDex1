package impl;

import entity.Movie;
import service.AbstractMovieAPI;
import service.BuyTickets;

/*
 * Interface Segregation Principle
 * Open-Closed Principle
 * 
 * */
public class WatchMovieAtTheater implements AbstractMovieAPI, BuyTickets {
	@Override
	public void play(Movie m) {
		System.out.println("Play movie " + m.getType() + " at theater");
	}
	
	@Override
	public void pause(Movie m) {
		System.out.println("Pause movie " + m.getType() + " at theater");
	}

	@Override
	public void buy() {
		System.out.println("Tickets bought!");
		
	}

}
