package net.znamy.designpatterns.state.vendingmachine;

public class VendingMachine {
	
	private VMState state;

	private int drinksCounter = 0;

	public VendingMachine() {
		state = VMWaitingState.getInstance();
		System.out.println("\tVending mchine created with state: " + state.getName());
	}

	public void insertCoin() {
		state.insertCoin(this);
	}

	public void cancelOrdering() {
		state.cancelOrdering(this);
	}

	public void chooseDrink() {
		state.chooseDrink(this);
	}

	public void confirmChoice() {
		state.confirmChoice(this);
		++drinksCounter;
	}

	public void pickDrink() {
		state.pickDrink(this);
	}

	void changeState(VMState state) {
		this.state = state;
		System.out.println("\tState changed to: " + state.getName());
	}

	int getDrinksCount() {
		return drinksCounter;
	}
}
