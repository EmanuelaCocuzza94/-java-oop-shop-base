package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	double prezzo;
	double iva = 1.22;
	
	void setCodice () {
		Random ran = new Random();
		
		codice = ran.nextInt(10000);
	}

	double getPrezzoConIva() {
		return prezzo * iva;
	}

	String getNomeEsteso() {
		return codice + "-" + nome;
	}

	
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto();
		p1.nome = "Monitor";
		p1.descrizione = "Monitor LG 32";
		p1.prezzo = 173.31;
		p1.setCodice();
		
		System.out.println("Il codice del prodotto è " + p1.codice);
		
		System.out.println("Il prezzo comprensivo dell'iva è " + p1.getPrezzoConIva());
		
	}
}




