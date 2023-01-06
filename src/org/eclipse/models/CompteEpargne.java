package org.eclipse.models;

public class CompteEpargne extends Compte {
	private float tauxIntret;

	public CompteEpargne() {
		super();
	}


	/**
	 * @param identifiant
	 * @param solde
	 * @param tauxIntret
	 */
	public CompteEpargne(int identifiant, float solde, float tauxIntret) {
		super(identifiant, solde);
		this.tauxIntret = tauxIntret;
	}

	public float getTauxIntret() {
		return tauxIntret;
	}

	public void setTauxIntret(float tauxIntret) {
		this.tauxIntret = tauxIntret;
	}


	@Override
	public String toString() {
		return "CompteEpargne [tauxIntret=" + tauxIntret + ", toString()=" + super.toString() + "]";
	}

	public boolean debiter(int somme) {
			
		solde = solde - somme;
			if (solde - somme < 0) {		
				return false;
			} 
			else {
				
			}
			return true;
	}

	@Override
	public void imprimer() {

		System.out.println("Taux interet = " + tauxIntret);
		System.out.println("Solde = " + solde);
		System.out.println("Type de Compte = Compte epargne " );
	}

}
