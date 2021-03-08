package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// il programma di test creerà un libretto e ci metterà 10 voti
		Libretto libretto =new Libretto();
		System.out.println("Stampo i voti del libretto");
		Voto voto1= new Voto("Analisi 1",30,LocalDate.of(2019, 2, 15));
		
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica",24,LocalDate.of(2019, 9, 15)));
		System.out.println(libretto); // mi serve però un metodo di stampa all'interno del libretto ma mi serve anche un metodo to string del voto
	}

}
