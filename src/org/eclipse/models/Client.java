package org.eclipse.models;

import java.util.Arrays;

public class Client  {

	private int identifiant;
	private String nom;
	private String prenom;
	private CompteCourant[] compteCourants = new CompteCourant[3];
	private int nbrCompteC = 0;
	private CompteEpargne compteEpargne;

	public Client() {
		// TODO Auto-generated constructor stub

	}

	public Client(int identifiant, String nom, String prenom) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @param identifiant
	 * @param nom
	 * @param prenom
	 * @param compteCourants
	 */
	public Client(int identifiant, String nom, String prenom, CompteCourant ... compteCourants) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.compteCourants = compteCourants;
	}

	public CompteCourant[] getCompteCourants() {
		return compteCourants;
	}

	public void setCompteCourants(CompteCourant[] compteCourants) {
		this.compteCourants = compteCourants;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	
	public boolean ajouterCompteCourant(CompteCourant c){
	
		if (nbrCompteC <= 3) {
			compteCourants[nbrCompteC ++] = c;
			return true;
		}
		return false;

	}
	
	public boolean ajouterCompteEpargne(CompteEpargne c){
		
		if (this.compteEpargne == null) {
			this.compteEpargne = c;
			return true;
		}
		return false;

	}
	
	
	
	

	@Override
	public String toString() {
		return "Client [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", compteCourants="
				+ Arrays.toString(compteCourants) + "]";
	}


	

}

