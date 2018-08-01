package banque;

public class MainAccount extends Account {
	

public void transfertAccount(AccountPEL receveur, double montant) {
	//Variable "solde" héritée de la classe "Account" ainsi que la method getSolde()
	solde = getSolde() - montant;
	receveur.solde = receveur.getSolde() + montant;
	
	
}
}