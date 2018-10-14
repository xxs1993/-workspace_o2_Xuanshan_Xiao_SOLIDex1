package impl;

import service.chooseMovieByID;

public class chooseMovieByIDServiceImpl implements chooseMovieByID,Runnable{
	/*
	 * Author Alex
	 * Single Responsibility principle;
	 * Open and closed principle;
	 * 
	 * Interface Segeragation principel;
	 */
	@Override
	public int chooseMovie(int id) {
		if(id == 0) System.out.println("You want to watch Interstella ?");
		if(id == 1) System.out.println("You want to watch *********** ?");
		
		return id;
	}
	public void run() {
		System.out.println("Runnable");
	}
}
