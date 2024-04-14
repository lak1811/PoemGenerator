package diktgenerator;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
	//Begge menyalternativene
	private static final String[] ALTERNATIVER = {"Enkelt dikt", "Vanskelig dikt", "Avslutt"};
	private static final String[] ALTERNATIVER1 = {"Skriv inn ordene", "Se diktet", "Avslutt"};
	//lager en global arraylist
	static ArrayList<String> dikt = new ArrayList<String>();
public static void main(String[] args) {
	
	//Starter den første menyen
	start();

	
}


public static int lesValg() {
	//Funksjon som returnerer et tall, som videre navigerer brukeren gjennom mitt menysystem
	int valg = JOptionPane.showOptionDialog(
			null, 
			"Velg hvilken handling du ønsker å utføre",
			null,
			JOptionPane.DEFAULT_OPTION,
			JOptionPane.PLAIN_MESSAGE,
			null,
			ALTERNATIVER,
			ALTERNATIVER[0]);
	//retur av valgalternativ
	return valg;
}

//Returnerer et tall som navigerer brukeren gjennom menysystem for enkeldikt funksjonen
public static int enkeltdiktlesvalg() {
	int enkeltdiktvalg1=JOptionPane.showOptionDialog(null, "Velg hvilken handling du ønsker å utføre", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ALTERNATIVER1, ALTERNATIVER1[0]);
	return enkeltdiktvalg1;

}





public static ArrayList<String> leseord() {
	/*
	 * Public static arraylist<string> går ut på å få en verdi ut av denne
	 * funksjonen/methoden. Formålet med denne funksjonen er å få arraylisten dikt
	 * til å bli full av ord fra brukeren.
	 */
	
	/*
	 * Grunnen til at jeg velger å lage en x variabel er for å sammenligne den med
	 * tallet 0 for å videre fortsette med funksjonen. X representerer antall
	 * elementer i arraylisten dikt, som videre sammenlignes med 0 ved hjelp av
	 * equals og en if test. Om den er tom så kjører joptionpane med sine inputsmetoder. Om den
	 * allerede er full, så vil denne funksjonen returnere den fulle listen til min
	 * skrivedikt funksjon, som videre legger opp ordene i ulike rekkefølger
	 */
	
	Integer x=dikt.size();
	
	/*
	 * under er min inputmetode. Jeg har valgt å lage seksten ulike variabler som
	 * representerer et ord. Jeg har satt det opp slikt. Ord x(linje)y(ord i
	 * linjen). Det vil si at ord32 er det andre ordet i tredje linje.
	 */
	
	if (x.equals(0)) {
	String ord11=JOptionPane.showInputDialog("Skriv inn ditt første ord");
	String ord12=JOptionPane.showInputDialog("Skriv inn ditt andre ord");
	String ord13=JOptionPane.showInputDialog("Skriv inn ditt tredje ord");
	String ord14=JOptionPane.showInputDialog("Skriv inn ditt fjerde ord");

	String ord21=JOptionPane.showInputDialog("Skriv inn ditt femte ord");
	String ord22=JOptionPane.showInputDialog("Skriv inn ditt sjette ord");
	String ord23=JOptionPane.showInputDialog("Skriv inn ditt syvende ord");
	String ord24=JOptionPane.showInputDialog("Skriv inn ditt åttende ord");
	
	String ord31=JOptionPane.showInputDialog("Skriv inn ditt niende ord");
	String ord32=JOptionPane.showInputDialog("Skriv inn ditt tiende ord");
	String ord33=JOptionPane.showInputDialog("Skriv inn ditt ellevte ord");
	String ord34=JOptionPane.showInputDialog("Skriv inn ditt tolvte ord");
	
	String ord41=JOptionPane.showInputDialog("Skriv inn ditt trettende ord");
	String ord42=JOptionPane.showInputDialog("Skriv inn ditt fjortende ord");
	String ord43=JOptionPane.showInputDialog("Skriv inn ditt femtende ord");
	String ord44=JOptionPane.showInputDialog("Skriv inn ditt sekstende og siste ord");
	
	//legger til alle ordene inn i arraylisten og videre returnerer den
	dikt.add(ord11);
	dikt.add(ord12);
	dikt.add(ord13);
	dikt.add(ord14);
	dikt.add(ord21);
	dikt.add(ord22);
	dikt.add(ord23);
	dikt.add(ord24);
	dikt.add(ord31);
	dikt.add(ord32);
	dikt.add(ord33);
	dikt.add(ord34);
	dikt.add(ord41);
	dikt.add(ord42);
	dikt.add(ord43);
	dikt.add(ord44);
	return dikt;
	
	
	}
	//dersom listen er full så vil den fremdeles returneres med else statement
	else {
		JOptionPane.showMessageDialog(null,"Ord er allerede skrevet. Om du ønsker å lage et nytt dikt, restart programmet");
		return dikt;
	}
}


public static void skrivedikt() {
	/*
	 * Jeg bruker arraylist ettersom de kan forandres både med å legge til og
	 * fjerne. I dette tilfellet bruker jeg funksjonen for å adde som heter add().
	 * Både array og arraylist har ulike datastrukturer, som er grunnen til at folk
	 * tenker nøye på hvilken de ønsker å bruke
	 */
	ArrayList<String> dikt=leseord();
	ArrayList<String> fixeddikt = new ArrayList<String>();
		for (int i = 0; i <= 4; i++) {
	int randomIndex = (int)(Math.random()*dikt.size());
	int randomIndex1 = (int)(Math.random()*dikt.size());
	int randomIndex2= (int)(Math.random()*dikt.size());
	int randomIndex3 = (int)(Math.random()*dikt.size());
	
	fixeddikt.add(dikt.get(randomIndex));
	fixeddikt.add(dikt.get(randomIndex1));
	fixeddikt.add(dikt.get(randomIndex2));
	fixeddikt.add(dikt.get(randomIndex3));
	/*
	 * Her lager jeg fire ulike variabler som representerer tilfeldige tall basert
	 * på min arrayliste som heter dikt. Jeg får tilfeldige tall som er innenfor
	 * størrelsen av min listarray, som jeg videre bruker på å få tilfeldige ord fra
	 * min diktarray til min fixeddikt array ved hjelp av index. Randomindexene
	 * forandrer seg hver gang for loopen gjentar seg, som er bra ettersom vi får
	 * forskjellige tall og forskjellige ord i vår fixed listarray. Ettersom for loopen
	 * går fire ganger, så har jeg fire ulike randomindexer, som vil si at jeg får totalt
	 * 16 ord som fordeler seg på fire strofer
	 */ 
	}
		
		
		  JOptionPane.showMessageDialog(null,fixeddikt.get(0)+" "+fixeddikt.get(1) +
		  " "+fixeddikt.get(2)+ " "+fixeddikt.get(3) +
		  "\n"+fixeddikt.get(4)+ " "+fixeddikt.get(5) +
		  " "+fixeddikt.get(6)+ " "+fixeddikt.get(7) +
		  "\n"+fixeddikt.get(8)+ " "+fixeddikt.get(9) +
		  " "+fixeddikt.get(10)+ " "+fixeddikt.get(11) +
		  "\n"+fixeddikt.get(12)+" "+fixeddikt.get(13) +
		  " "+fixeddikt.get(14)+ " "+fixeddikt.get(15));
		  
			/*
			 * bruker index for å få fram 16 tilfeldige ord som vil lage et nytt dikt hver
			 * gang det klikkes på lag dikt knappen. Med Showmessagedialog vil det skrives
			 * ut 4 variabler (ord) før en ny linje starter (\n). Dette kjøres fire ganger
			 * som vil eventuelt bli til 16 ord fordelt på fire linjer, som vil si 
			 * fire linjer per strofe
			 */
}



//simpel meny med hjelp av switch. Ved tall 1 eller to så kjører funksjoner. Ellers avsluttes det.

public static void lesord() {
	
}

public static void lesevalget() {
boolean fortsette = true;
while(fortsette) {

	int enkeltdiktvalg = enkeltdiktlesvalg();
	
	switch(enkeltdiktvalg) {
	case 0 : leseord();
	break;
	case 1 : skrivedikt();
	break;
	default : fortsette = false;
	
	}
}
}
//opprinnelig funksjon som er i main som viser den første menyen
public static void start() {

	boolean fortsett = true;

	while(fortsett) {
	
		int valg = lesValg();
	
		switch(valg) {
		case 0 : lesevalget();
		break;
		//Gjorde dessverre ikke den andre funksjonen
		//Men om jeg hadde gjort den så ville jeg ha laget 4 arrays for adjektiv
		//verb, artikkel og substantiv. Dermed settet de i riktig 
		//rekkefølge på lik måte som denne metoden og randomized ordene. 
		//Men dessverre så er denne funksjonen ute av drift
		case 1 : JOptionPane.showMessageDialog(null,"Hei og velkommen. Dessverre er denne funksjonen"+"\n"
		+"Ikke utført. Vennligst bruk noen av de andre funksjonene."+"\n"+"TAKK");
		break;
		default : fortsett = false;
		}
	}
}

}
