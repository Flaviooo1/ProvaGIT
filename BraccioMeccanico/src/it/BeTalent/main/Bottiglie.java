package it.BeTalent.main;

import java.util.ArrayList;
import java.util.List;

public class Bottiglie<E> {
	private String contenuto;
	private Boolean piena;
	private Boolean vuota;
	protected ArrayList<E> lista;
	
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	public Boolean getPiena() {
		System.out.println("La bevanda verrà riempita!");
		return piena;
	}
	public void setPiena(Boolean piena) {
		
		this.piena = piena;
	}
	public Boolean getVuota() {
		System.out.println("La bevanda sarà svuotata!");
		return vuota;
	}
	public void setVuota(Boolean vuota) {
		this.vuota = vuota;
	}
	
	public void aggiungiBottiglia(E Bottiglie) {
		lista.add(Bottiglie);
	}
	public void rimuoviBottiglia(E Bottiglie) {
		lista.add(Bottiglie);
	}
	
	
	public Bottiglie(String contenuto) {
		super();
		this.contenuto = contenuto;

	}
	@Override
	public String toString() {
		return "Bottiglie [contenuto=" + contenuto + ", piena=" + piena + ", vuota=" + vuota +"]";
	}

	
}
