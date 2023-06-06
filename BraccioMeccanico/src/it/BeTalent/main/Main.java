package it.BeTalent.main;

public class Main {

	public static void main(String[] args) {
		//Creo 2 tipi di liste con un oggetto diverso per entrambe 
		Bottiglie <Alcoliche> b1= new Bottiglie("Bottiglie alcoliche");
		Bottiglie<Analcoliche> b2= new Bottiglie("Bottiglie analcoliche");
		
		//Qui creo delle istanze che poi aggiungerò alla lista di bottiglie alcoliche
		Alcoliche al1= new Alcoliche("Rum", true, false);// Il true e falso sono gli stati della bottiglia, se sono pieni o vuoti
		System.out.println(al1);
		al1.getVuota(); //Con questo richiamo faccio in modo che la bottiglia viene svuotata, come richiesto dall'esercizio
		Alcoliche al2= new Alcoliche("Vodka", false, true);
		System.out.println(al2);
		al2.getPiena();// Qui invece la riempio
		
		// Istanze per la lista delle analcoliche 
		Analcoliche an1= new Analcoliche("Acqua", true, false);
		System.out.println(an1);
		an1.getVuota();
		Analcoliche an2= new Analcoliche("Monster", false, true);
		System.out.println(an2);
		an2.getPiena();
		
		
		b1.aggiungiBottiglia(al1);
		b1.aggiungiBottiglia(al2);
		//Problema di type-unsafety risolto
		//b1.aggiungiBottiglia(an2);
		
		b2.aggiungiBottiglia(an1);
		b2.aggiungiBottiglia(an2);
		//b2.aggiungiBottiglia(al2);
		
		
		

	}

}
