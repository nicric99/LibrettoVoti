package it.polito.tdp.librettovoti.model;
import java.util.*;
import java.time.*;
//POJO plain lold java object
//JAva bin  costruttori e getter and setter
// semplice contenitore di dati, non fa codice
// questa sintassi serve per collegare un comment quando clicchiamo sul nome della classe
/**
 * Memorizza risultato di un esame singolo
 * @author nicol
 *
 */
public class Voto {
private String nome;
private int voto;// come rappresento 30L
private LocalDate data;
/**
 * Costruttore della classe
 * @param nome Corso superato
 * @param voto Voto ottenuto 
 * @param data Data di superamento
 */
public Voto(String nome, int voto, LocalDate data) {
	this.nome = nome;
	this.voto = voto;
	this.data = data;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}
@Override
public String toString() {
	return "Esame "+ nome + " Voto " + voto + " Data dell'esame " + data;
}



}
