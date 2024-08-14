package com.jsp.hibernate.demo.HibernateProject_moveDB;

import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a choice following:\n"
				+ "1.Add Movies.\n"
				+ "2.Display mobiles by id.\n"
				+ "3.Update movie by id.\n"
				+ "4.Delete movie by id.\n");
		System.out.print("Enter a choice:");
		
		int ch=sc.nextInt();
		MovieRepository mr=new MovieRepository();

		switch(ch) {
		case 1:
			mr.addMovie();
			break;
		case 2:
			mr.findMovieById();
			break;
		case 3:
			mr.updateMovieById();
			break;
		case 4:
			mr.deleteMovieById();
		}
	}
}
