package net.znamy.designpatterns.state.vendingmachine;

public class VMDrinkChoiceState extends VMState {

	private static VMDrinkChoiceState instance;

	private VMDrinkChoiceState() {
	}

	static VMDrinkChoiceState getInstance() {
		if (instance == null) {
			instance = new VMDrinkChoiceState();
		}
		return instance;
	}

	@Override
	protected void chooseDrink(VendingMachine context) {
		System.out.println("Drink chosen, please confirm.");
		context.changeState(VMConfirmationState.getInstance());
	}

	@Override
	protected void cancelOrdering(VendingMachine context) {
		System.out.println("Retuning coins.");
		context.changeState(VMWaitingState.getInstance());
	}

	@Override
	protected String getName() {
		return "DRINK_CHOICE";
	}
}
