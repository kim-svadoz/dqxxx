package oop.chap07.poly;

public class Tea extends Beverage{
	static int amount;
	
	public Tea() {
		
	}
	public Tea(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void calcPrice() {
		if(getName().equals("lemontea")) {
			setPrice(1500);
		}else if(getName().equals("ginsengTea")) {
			setPrice(2000);
		}else if(getName().equals("redginsengTea")) {
			setPrice(2500);
		}
	}
}
