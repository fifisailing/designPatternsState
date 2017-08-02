package net.znamy.designpatterns.state.vendingmachine;

public abstract class VMState {

	protected void insertCoin(VendingMachine context) {
		defaultAction();
	}

	protected void cancelOrdering(VendingMachine context) {
		defaultAction();
	}

	protected void chooseDrink(VendingMachine context) {
		defaultAction();
	}

	protected void confirmChoice(VendingMachine context) {
		defaultAction();
	}

	protected void pickDrink(VendingMachine context) {
		defaultAction();
	}

	protected abstract String getName();

	private void defaultAction() {
		System.out.println(getName() + ": Action unavailable");
	}

}
