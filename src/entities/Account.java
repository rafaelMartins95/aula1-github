package entities;

public class Account {
	private int number;
	private String name;
	private double amount;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		depositAmount(initialDeposit);
	}


	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}
	
	public void depositAmount(double value) {
		amount += value;
	}
	
	public void withdrawAmount(double value) {
		amount -= value + 5;
	}
	public String toString() {
		return "Account: "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", amount);
	}
	
}
