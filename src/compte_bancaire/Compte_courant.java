package compte_bancaire;

import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;

public class Compte_courant extends Compte {
	private double decouvert ;
public Compte_courant(int code, double solde, double decouvert) {
		super(code, solde);
		this.decouvert=decouvert;
		
	}
@Override
public void retrait(double montant) {
	Retrait r=new Retrait(listeOperation.size()+1, new Date(), montant);
	if (montant>solde+decouvert) throw new RuntimeException("solde insuffisant");
	solde=solde-montant ;
	listeOperation.add(r);
	
	
}
@Override
public void virement(double montant, Compte cp2) {
	retrait(montant);
	cp2.verser(montant);
	
}
@Override
public double updateSolde() {
	// TODO Auto-generated method stub
	return 0;
}


}
