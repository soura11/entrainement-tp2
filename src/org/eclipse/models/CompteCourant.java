package org.eclipse.models;

import org.eclipse.operation.OperationAvancee;
import org.eclipse.operation.OperationSimple;

public class CompteCourant extends Compte implements OperationSimple, OperationAvancee {

	private float decouvert;

	

	/**
	 * @param identifiant
	 * @param solde
	 */
	public CompteCourant(int identifiant, float solde, float decouvert) {
		super(identifiant, solde);
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}
	
	public boolean debiter(int somme) {
		

		if (solde + decouvert + somme > 0) {
			solde -= somme;
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean virement(Compte beneficiaire, int somme) {
		if(debiter(somme)) {
			beneficiaire.crediter(somme);
			return true;
		}
		return false;
	}

	@Override
	public void imprimer() {
		System.out.println("Decouvert = " + decouvert);
		System.out.println("Solde = " + solde);
		System.out.println("Type de Compte = Compte courant " );
	}
	
	
	

}
