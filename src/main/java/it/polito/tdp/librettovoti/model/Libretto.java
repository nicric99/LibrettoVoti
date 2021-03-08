package it.polito.tdp.librettovoti.model;

import java.util.*;
import java.util.ArrayList;

public class Libretto {
	// cerchiamo il più possibile definirla con il tipo generico anzichè specificare
	// array list o linked list
	private List<Voto> voti;// non avrà getter and setter poihè non voglio che dall'esterno me lo modifica
// questa dichiarazione non punta a nulla e non è inizializzata

	public Libretto() {
		this.voti = new ArrayList<>(); // qui sto inizializzando il mio oggetto lista, this lo metto perchè la dichiaro
										// a lvl di istanza
	}

public void add(Voto v) {
	this.voti.add(v);// delega alla lista l'aggiunta
	
	
}

public String toString() {
	// posso direttamente chiamare il metodo to string della lista che è già implementata
	String s="";
	for (Voto v:this.voti) {
		s=s+v.toString()+"\n";
	}
	return s;
		

}
}
