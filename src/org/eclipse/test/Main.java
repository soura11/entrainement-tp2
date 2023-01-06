package org.eclipse.test;

import org.eclipse.models.Client;
import org.eclipse.models.Compte;
import org.eclipse.models.CompteCourant;
import org.eclipse.models.CompteEpargne;


public class Main {

	public static void main(String[] args) {
		
		
		Client client1 = new Client(1, "Manso", "Sou");
		CompteEpargne compt1 = new CompteEpargne(1, 2500, 5);
		
		Client client2 = new Client(2, "Manso", "Salma");
		CompteEpargne compt2 = new CompteEpargne(2, 3500, 2);
		
		CompteCourant comptC1 = new CompteCourant(1, 2500, 50);
		CompteCourant comptC2 = new CompteCourant(2, 3500, 5);
		
		//Client client3 = new Client(3, "lola", "manu", comptC1, comptC2);
	
		/* System.out.println(client1);
		System.out.println(client2);
		System.out.println(compt1);
		System.out.println(compt2);
		System.out.println(comptC1);
		System.out.println(comptC2);
		System.out.println(client3); */
		
		
		
		
		
		
		

	
	
	
	}

}
