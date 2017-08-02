package net.znamy.designpatterns.state.vendingmachine;

public class VMConfirmationState extends VMState {

	private static VMConfirmationState instance;

	private VMConfirmationState() {
	}

	static VMConfirmationState getInstance() {
		if (instance == null) {
			instance = new VMConfirmationState();
		}
		return instance;
	}

	@Override
	protected void confirmChoice(VendingMachine context) {
		System.out.println("Drink is being prepared, please pick when ready.");
		context.changeState(VMDrinkReadyState.getInstance());
	}

	@Override
	protected void cancelOrdering(VendingMachine context) {
		System.out.println("Retuning coins and doing other important tasks.");
		context.changeState(VMWaitingState.getInstance());
	}

	@Override
	protected String getName() {
		return "CONFIRMATION";
	}
}
