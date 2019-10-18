package com.exercise15string.app;

import com.exercise15string.model.Tuneador;

public class StringsApp {

	public static void main(String[] args) {
		String cad1="Este viernes entró en vigor la llamada “Ley Bonilla”, que amplía de dos a cinco años el periodo de Gobierno en Bajan California y partidos políticos de todas las corrientes y organizaciones empresariales anunciaron que ya alistan medidas para impugnar la reforma ante la Suprema Corte de Justicia de la Nación (SCJN).";
		
		String cad2="Este viernes entró en vigor la llamada “Ley Bonilla”, que amplía de dos a cinco años el periodo de Gobierno en Bajan California y partidos políticos de todas las corrientes y organizaciones empresariales anunciaron que ya alistan medidas para impugnar la reforma ante la Suprema Corte de Justicia de la Nación (SCJN).";
		
		
		
		System.out.println(cad1.charAt(3));
		System.out.println(cad1.codePointAt(4));
		System.out.println(cad1.codePointBefore(4));
		System.out.println(cad1.codePointCount(3, 4));
		System.out.println(cad1.equals(cad2));
		//System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("nada"));// Este 
		System.out.println(cad1.trim()+cad1.trim());
		
		System.out.println(cad1.indexOf('1'));//nom gredy primer valor de la cantidad que le diste
		System.out.println(cad1.lastIndexOf('1'));// gredy ultimo valor que se le asigno
		
		System.out.println(cad1.split("."));
		
		/*String []cads=cad1.split(",");
		for(int i=0;i<cad1.length();i++)
		{
			System.out.println(cads[i]);
		}*/
		//R E  V E R S E 
		String reversedString="";
				for(int index=cad1.length()-1;index>=0;index--)
				{
					reversedString=reversedString+cad1.charAt(index);
				}
				System.out.println(reversedString);
				
				//ejemplo tuneador
				String [] misCadenas= {cad1+cad2};
				String[] misNuevasCadenas= Tuneador.tunea(misCadenas);
				for(int i=0;i<misNuevasCadenas.length;i++)
				{
					System.out.println(misNuevasCadenas[i]);
				}
				
	}

}
