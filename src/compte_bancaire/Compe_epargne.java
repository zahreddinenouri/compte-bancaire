package compte_bancaire;

import java.util.Date;
import java.util.List;

public class Compe_epargne extends Compte  {
	private double taux;
	
	public Compe_epargne(int code, double solde,double taux) {
		super(code, solde);
		this.taux=taux;
	}

	@Override
	public void retrait(double montant) {
		Retrait r=new Retrait(listeOperation.size()+1, new Date(), montant);
		if (montant>solde) throw new RuntimeException("solde insuffisant");
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
		solde=solde*taux/100;
		return solde ;
		
	}

	

}
