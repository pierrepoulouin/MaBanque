package banque;

public class MainAccount extends Account {
	

public double transfertAccount(double soldeA, double soldeB, double montant) {
	double transaction = (soldeA - montant) + soldeB;
	return transaction;
}
}