package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	
	public Current() {
		System.out.println("Default constructor of current");
	}

	public Current(int accountnumber, String name, double balance, double overdraftBalance) {
		super(accountnumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded condtructor of current");
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount > 0)
		{
			if(getBalance() >= amount)
			{
				setBalance(getBalance() - amount);
				return true;
			}
			else if(getBalance() < amount || overdraftBalance >=amount)
			{
				double bal=(getBalance() - amount);
				if(bal <=0)
				{
					setBalance(0);
				}
				setOverdraftBalance(overdraftBalance  +  (bal));  
				return true;
			}
		}
			
    return false;
 }
	
	@Override
	public boolean deposite(double amount) {
		if(amount > 0)
		{
			setOverdraftBalance(overdraftBalance + amount); 
			return true;
		}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}
	
	

}
