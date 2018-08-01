package banque;

public class Application {

	public static void main(String[] args) {

		//création des instances accountMainPierre et accountPELAurelia

		MainAccount accountMainPierre = new MainAccount();
		AccountPEL accountPELAurelia = new AccountPEL();

		accountMainPierre.setSolde(200.00);
		accountMainPierre.setNom("Poulouin");
		accountMainPierre.setPrenom("Pierre");

		accountPELAurelia.setSolde(100.00);
		accountPELAurelia.setNom("Perrot");
		accountPELAurelia.setPrenom("Aurelia");

		//Declaration et initialisation de la variable montant
		double montant = 25;

		//appelle de la méthode transfertAccount de la class MainAccount
		accountMainPierre.transfertAccount(accountPELAurelia, montant);

		//Affichage du solde du compte Pierre après transfert
		System.out.println("Le compte de " + accountMainPierre.getNom() + " est de " + accountMainPierre.getSolde());


	}

}
