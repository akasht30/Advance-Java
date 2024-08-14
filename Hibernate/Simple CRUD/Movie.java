package com.jsp.hibernate.demo.HibernateProject_moveDB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String movieDirection;
	private String genere;
	private String language;
	private int boxOfficeCollection;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirection() {
		return movieDirection;
	}
	public void setMovieDirection(String movieDirection) {
		this.movieDirection = movieDirection;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}
	public void setBoxOfficeCollection(int boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId+"\n" + ", movieName=" + movieName +"\n"+ ", movieDirection=" + movieDirection
				+"\n"+ ", genere=" + genere +"\n"+ ", language=" + language +"\n"+ ", boxOfficeCollection=" + boxOfficeCollection
				+ "]";
	}
	
	
}
