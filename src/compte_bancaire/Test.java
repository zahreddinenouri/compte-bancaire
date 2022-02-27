package compte_bancaire;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		/*try {
			Compte c2=new Compte_courant(5, 500, 400);
			List<Compte>listeCompte=new ArrayList<>();
			listeCompte.add(new Compte_courant(1, 1000, 400));
			listeCompte.add(new Compte_courant(2, 500, 400));
			listeCompte.add(new Compe_epargne(3, 200, 5));
			for (Compte c: listeCompte) {
				c.retrait(250);
				 c.virement(100, c2);
				
				
           System.out.println(c.solde);
           System.out.println(c2.solde);
		
			for (Operation o:c.listeOperation) {
				System.out.println(o.numero+"-"+o.montant+ "-"+"-"+o.dateOperation+o.getClass().getSimpleName());
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
*/
		// break continue labell
	/*abc: for (int i=0;i<10;i++) {
		for (int j=0;j<10;j++) {
			if (j==5) break abc  ;
			
			System.out.println("i= "+i+" j= "+j);
			
		}
		
		
	}
	*/
	// for each
		//String name[]= {"ali","asl","jkl"};
		/*for (int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}*/
		/*for(String x:name) {
			System.out.println(x);
		}*/
	// switch
		int niveau=11;
		switch (niveau) {
		case 5 : System.out.println("niveau fatigué");
		break;
		case 10:System.out.println("niveau moyen");
		break;
		case 18 : System.out.println("niveau excellent");
		default : System.out.println("don,t found");
		}
		
	}
}
