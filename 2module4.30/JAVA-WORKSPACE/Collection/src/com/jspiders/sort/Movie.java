package com.jspiders.sort;

public class Movie {
	String name;
	String genre;
	Integer releaseYear;
	Integer imdbRating;
	public Movie(String name, String genre, Integer releaseYear, Integer imdbRating) {
		super();
		this.name = name;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.imdbRating = imdbRating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", releaseYear=" + releaseYear + ", imdbRating="
				+ imdbRating + "]";
	}
	
}
