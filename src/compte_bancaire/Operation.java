package compte_bancaire;

import java.util.Date;

public class Operation {
	protected int numero;
	protected Date dateOperation;
	protected double montant;
	public Operation(int numero, Date dateOperation, double montant) {
		super();
		this.numero = numero;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	

}
