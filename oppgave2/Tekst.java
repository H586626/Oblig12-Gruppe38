package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	@Override
	public String toString() {
		String type = "TEKST\n";
        if (this instanceof Bilde) type = "BILDE\n";

        return type + super.toString() + tekst + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		return this.toHTML()+"\n<p>"+tekst+"<p>\n<hr>\n";
	}
}