enum STATUS {
	ACTIVE, INACTIVE, CLOSED
}

public class BankAcc {

	int account;
	String owner_name, address, type, created_date;
	float balanced_amount;
	STATUS status;

	public void details(int account, String name, String address, String date, String type, STATUS status,
			float amount) {

		this.account = account;
		this.owner_name = name;
		this.address = address;
		this.balanced_amount = amount;
		this.type = type;
		this.created_date = date;
		this.status = status;

	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int acc) {
		this.account = acc;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public float getBalanced_amount() {
		return balanced_amount;
	}

	public void setBalanced_amount(float balanced_amount) {
		this.balanced_amount = balanced_amount;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	void show() {
		String accountInfo;
		accountInfo = "Account NO: " + account + "\nOwner Name: " + owner_name + "\nAddress: " + address
				+ "\nCreated Date: " + created_date + "\nAccount Type: " + type + "\nStatus: " + status
				+ "\nBalance Amount: " + balanced_amount;
		System.out.println(accountInfo);

	}

	void deposit(float account) {
		balanced_amount += account;
		System.out.println("Deposit amount: " + account);
	}

	void withdraw(float account) {
		if (balanced_amount < account) {
			throw new IllegalArgumentException("CAN'T DEDUCT MONEY: Insufficient Balance");
		} else {
			balanced_amount -= account;
			System.out.println("Withdraw Amount: " + account);
		}
	}

	void checkbalance() {
		System.out.println("CLRBal: " + balanced_amount);
	}

}

class test {
	public static void main(String[] args) {

		BankAcc b = new BankAcc();
		b.details(128642, "mary", "Eluru", "05-04-2022", "SAVINGS", STATUS.ACTIVE, 100000);
		b.show();
		b.deposit(20000);
		b.checkbalance();
		b.withdraw(30000);
		b.checkbalance();
		System.out.println("\n");

		BankAcc b1 = new BankAcc();
		b1.details(537905, "priyanka", "nuzvid", "05-04-2022", "DEMAT", STATUS.ACTIVE, 50000);
		b1.show();
		b1.deposit(100000);
		b1.checkbalance();
		b1.withdraw(15000);
		b1.checkbalance();
		System.out.println("\n");

		BankAcc b2 = new BankAcc();
		b2.details(1234, "INJAMALA", "Banglore", "04-04-2022", "CURRENT", STATUS.ACTIVE, 750000);
		b2.show();
		b2.deposit(40000);
		b2.checkbalance();
		b2.withdraw(10000);
		b2.checkbalance();

	}

}
