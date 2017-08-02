package net.znamy.designpatterns.state.vendingmachine;

public class VMWaitingState extends VMState {

	private static VMWaitingState instance;

	private VMWaitingState() {
	}

	static VMWaitingState getInstance() {
		if (instance == null) {
			instance = new VMWaitingState();
		}
		return instance;
	}

	@Override
	protected void insertCoin(VendingMachine context) {
		System.out.println("Coin inserted, choose your drink.");
		context.changeState(VMDrinkChoiceState.getInstance());
	}

	@Override
	protected String getName() {
		return "WAITING";
	}
}
