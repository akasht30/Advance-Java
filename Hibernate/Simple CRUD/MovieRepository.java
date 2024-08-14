package com.jsp.hibernate.demo.HibernateProject_moveDB;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MovieRepository {

	Configuration cfg=new Configuration().configure().addAnnotatedClass(Movie.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Scanner sc=new Scanner(System.in);
	
	
	void addMovie() {
		System.out.print("Enter a id of movie:");
		int movieId=sc.nextInt();
		System.out.print("Enter a name of movie:");
		String movieName=sc.next();
		System.out.print("Enter a direction of movie:");
		String movieDirection=sc.next();
		System.out.print("Enter a genere of movie:");
		String genere=sc.next();
		System.out.print("Enter a language of movie:");
		String language=sc.next();
		System.out.print("Enter a box office collection of movie:");
		int collec=sc.nextInt();
		Movie m=new Movie();
		m.setMovieId(movieId);
		m.setMovieName(movieName);
		m.setMovieDirection(movieDirection);
		m.setGenere(genere);
		m.setLanguage(language);
		m.setBoxOfficeCollection(collec);
		
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		
		session.save(m);
		
		trans.commit();
		session.close();
		sf.close();
	}
	
	void findMovieById() {
		System.out.print("Enter a id:");
		int id=sc.nextInt();
		
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		
		Movie m=session.get(Movie.class, id);
		System.out.println(m);
		
		trans.commit();
		session.close();
		sf.close();
	}
	
	void updateMovieById() {
		System.out.print("Enter a id:");
		int id=sc.nextInt();
		System.out.println("Enter a box office collection to change:");
		int bxc=sc.nextInt();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		 Movie m=session.get(Movie.class, id);
		
		m.setBoxOfficeCollection(bxc);
		session.update(m);
		
		
		trans.commit();
		session.close();
		sf.close();
	}
	
	void deleteMovieById() {
		System.out.print("Enter a id:");
		int id=sc.nextInt();
		
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		
		Movie m=session.get(Movie.class, id);
		
		session.delete(m);
		

		trans.commit();
		session.close();
		sf.close();
	}
}
