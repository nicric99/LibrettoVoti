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
	/*public String stamtpaVotiUguali(int punteggio) {
		// questo metood non serve a niente se us una interfacccia grafica
	}
	public String votiUguali(int punteggio) {
		// calcola la stringa che contiene i voti decisi e sarà il chiamante se vuole stamparli metodo più generale
		// che mi permette 
	}*/
	public List<Voto> ListaVotiUguali(int punteggio){
		// questa soluzione è ancora più generica che rimanda la lista dei voti che posso manipolare a mio piacimento
		// ma il difetto di questo metodo espone all'esterno la struttura dati interna  che ho usato
		// se io decidessi di organizzare in modo diverso sarebbe difficile da riorganizzare
		List<Voto> risultato= new ArrayList<>();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);// questo è un riferimento che è lo stesso oggetto che ha un riferimento in una nuova lista
		}
		return risultato;
	}
	public Libretto votiUguali(int punteggio) {
		// questa soluzione è la migliore poichhè poi ho tutte le operazioni che posso fare che posso filtrare i dati rispetto agli altri
		Libretto risultato=new Libretto();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
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
