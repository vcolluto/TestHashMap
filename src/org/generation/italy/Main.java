package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> elencoAuto = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		elencoAuto.put("DZ324AB", "Fiat Panda");
		elencoAuto.put("EP652YU", "Ford Fiesta");
		elencoAuto.put("CP432PO", "Opel Corsa");
		elencoAuto.put("EG123RE", "Ford Fiesta");
		
		
		System.out.println("Auto inserite:");
		for(String t:elencoAuto.keySet())	//scorre tutte le targhe (chiavi)
			System.out.println(t+" - " +elencoAuto.get(t));
		
		
		//ricerca per chiave
		System.out.println("Inserisci la targa: ");
		String targa=sc.nextLine();
		if (elencoAuto.containsKey(targa))
			System.out.println("Auto trovata: "+ elencoAuto.get(targa));	//nel .get metto la chiave da cercare
		else
			System.out.println("Auto non trovata!");
		
		//ricerca per valore
		System.out.println("Inserisci il modello dell'auto: ");
		String modello=sc.nextLine();
		if (elencoAuto.containsValue(modello))
			System.out.println("Auto trovata");	
		else
			System.out.println("Auto non trovata!");
		

		
		sc.close();

	}

}
