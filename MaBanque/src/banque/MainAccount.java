package banque;

public class MainAccount extends Account {
	

public void transfertAccount(AccountPEL receveur, double montant) {
	//Variable "solde" héritée de la classe "Account" ainsi que la method getSolde()
	solde = getSolde() - montant;
	receveur.solde = receveur.getSolde() + montant;
	System.out.println("Le compte de " + receveur.getNom() + " a bien reçu un montant de "
			+ montant + "€.\nSon solde actuel est de " + receveur.getSolde() +"€" );
	
	
}
//methode pour faire un retrait
public void withdraw(int montantRetrait) {
	if (solde > montantRetrait) {
		System.out.println("Le solde actuel de " + getNom() + " est de " + solde + " €");
		solde = solde - montantRetrait;
		System.out.println("Le nouveau solde de " + getNom() + "est de " + solde + " €");
	}
	else {
		System.out.println("Votre solde est insuffisant");
	}
}

}