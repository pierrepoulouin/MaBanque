package banque;

public interface InterfaceBank {
	public void transfertAccount(AccountPEL receveur, double montant);
	public void withdraw(int montantRetrait);
}
