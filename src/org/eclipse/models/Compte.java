package org.eclipse.models;

import javax.swing.table.AbstractTableModel;

import org.eclipse.operation.OperationSimple;

public abstract class Compte  implements OperationSimple{
	protected int identifiant;
	protected float solde;
	

	public Compte() {
		super();
	}

	public Compte(int identifiant, float solde) {
		super();
		this.identifiant = identifiant;
		this.solde = solde;
		
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [identifiant=" + identifiant + ", solde=" + solde + "]";
	}

	public final void crediter(int somme) {
	
		solde = somme + solde;
		
	}
	
	public abstract void imprimer();
	
	
}
