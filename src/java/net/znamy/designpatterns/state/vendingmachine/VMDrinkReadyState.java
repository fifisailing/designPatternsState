package net.znamy.designpatterns.state.vendingmachine;

public class VMDrinkReadyState extends VMState {

	private static VMDrinkReadyState instance;

	private VMDrinkReadyState() {
	}

	static VMDrinkReadyState getInstance() {
		if (instance == null) {
			instance = new VMDrinkReadyState();
		}
		return instance;
	}

	@Override
	protected void pickDrink(VendingMachine context) {
		System.out.println("Thank you and be careful, it's hot.");
		context.changeState(VMWaitingState.getInstance());
		System.out.println("\tTotal drinks made: " + context.getDrinksCount());
	}

	@Override
	protected void cancelOrdering(VendingMachine context) {
		System.out.println("Are you nuts? It's too late! Pick your drink.");
	}

	@Override
	protected String getName() {
		return "DRINK_READY";
	}
}
