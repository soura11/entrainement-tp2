package org.eclipse.operation;

import org.eclipse.models.Compte;

public abstract interface OperationAvancee {

	boolean virement(Compte beneficiaire, int somme);

}
