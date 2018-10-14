package entity;

import java.util.Comparator;

import service.AbstractMovieAPI;

public class Movie implements Comparable<Movie> {
	/**
	 * Single Responsibility Principle
	 * 
	 * 
	 */
	private String type;

	private String description;

	private String name;

	private String director;

	public Movie(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Liskov Substitution Principle
	 */
	@Override
	public String toString() {
		return "Movie [type=" + type + ", description=" + description + ", name=" + name + ", director=" + director
				+ "]";
	}

	@Override
	public int compareTo(Movie o) {
		return this.getType().compareTo(o.getType());
	}

}
