package net.znamy.designpatterns.state;

import net.znamy.designpatterns.state.vendingmachine.VendingMachine;

public class VendingMachineDemo {

    public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();

		orderCorrectPath(vendingMachine);
		orderCancellationPath1(vendingMachine);
		orderCancellationPath2(vendingMachine);
		orderCancellationPath3(vendingMachine);
		orderCancellationPath4(vendingMachine);
		orderFreak(vendingMachine);

    }

    private static void orderCorrectPath(VendingMachine vendingMachine) {
		printSeparator("CorrectPath");
		vendingMachine.insertCoin();
		vendingMachine.chooseDrink();
		vendingMachine.confirmChoice();
		vendingMachine.pickDrink();
	}

    private static void orderCancellationPath1(VendingMachine vendingMachine) {
		printSeparator("CancellationPath1");
		vendingMachine.cancelOrdering();
	}

    private static void orderCancellationPath2(VendingMachine vendingMachine) {
		printSeparator("CancellationPath2");
		vendingMachine.insertCoin();
		vendingMachine.cancelOrdering();
	}

    private static void orderCancellationPath3(VendingMachine vendingMachine) {
		printSeparator("CancellationPath3");
		vendingMachine.insertCoin();
		vendingMachine.chooseDrink();
		vendingMachine.cancelOrdering();
	}

    private static void orderCancellationPath4(VendingMachine vendingMachine) {
		printSeparator("CancellationPath4");
		vendingMachine.insertCoin();
		vendingMachine.chooseDrink();
		vendingMachine.confirmChoice();
		vendingMachine.cancelOrdering();
		vendingMachine.pickDrink();
	}

    private static void orderFreak(VendingMachine vendingMachine) {
		printSeparator("Freak");
		vendingMachine.chooseDrink();
		vendingMachine.confirmChoice();
		vendingMachine.cancelOrdering();
		vendingMachine.insertCoin();
		vendingMachine.pickDrink();
		vendingMachine.confirmChoice();
		System.out.println("Well, OK return my coin.");
		vendingMachine.cancelOrdering();
	}

	private static void printSeparator(String title) {
		System.out.println("\n****************** " + title +" ******************\n");
	}
}
