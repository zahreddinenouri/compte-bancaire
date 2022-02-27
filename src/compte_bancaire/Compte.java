package compte_bancaire;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Compte {
	protected int code;
	protected double solde;
	List<Operation> listeOperation=new ArrayList<Operation>();
	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;}
		
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public List<Operation> getListeOperation() {
		return listeOperation;
	}
	public void setListeOperation(List<Operation> listeOperation) {
		this.listeOperation = listeOperation;
	}
	public void verser (double montant) {
		Versement v=new Versement(listeOperation.size()+1, new Date(), montant);
		solde+=montant;
		listeOperation.add(v);
	}
	public abstract void retrait(double montant);
	public abstract void virement(double montant,Compte cp2);
	public abstract double updateSolde();
	public double consultMontant() {
		double somme=0;
		for (Operation o:listeOperation)
			somme=somme+o.montant;
		return somme ;
	}
	

}
