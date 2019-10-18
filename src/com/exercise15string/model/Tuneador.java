package com.exercise15string.model;

public class Tuneador {

	public static String tunea(String[]cads)
	{
		for(int i=0;i<cads.length;i++)
		{
			cads[i]=cads[i].trim();
			cads[i]=cads[i].toLowerCase();
			cads[i]=cads[i].replace('a','o');
			

			
		}
		return cads;
	}
}
