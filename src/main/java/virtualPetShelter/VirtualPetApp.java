package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//Welcome and sets vars to 0
		VirtualPet myVirtualPetInstance = new VirtualPet(0, 0, 0, 0, 0);

//Sets responses/actions to user input
		String petAction;
		while (myVirtualPetInstance.notDead()) {
			do {
				System.out.println(myVirtualPetInstance.userInputChoices());
				petAction = input.nextLine();
			} while (!petAction.equals("1") && !petAction.equals("2") && !petAction.equals("3")
					&& !petAction.equals("4") && !petAction.equals("5"));
			switch (petAction) {
			case "1":
				myVirtualPetInstance.eat();
				myVirtualPetInstance.tick();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "2":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("They drank SO MUCH!");
				myVirtualPetInstance.drink();
				myVirtualPetInstance.tick();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "3":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("They look so relieved!");
				myVirtualPetInstance.bathroom();
				myVirtualPetInstance.tick();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "4":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("All work and no play makes Homer something something");
				myVirtualPetInstance.play();
				myVirtualPetInstance.tick();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "5":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("Don't let the bedbugs bite (unless you're into that sort of thing).");
				myVirtualPetInstance.sleep();
				myVirtualPetInstance.tick();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			}
		}
		// your pet died
		if (myVirtualPetInstance.notDead() == false) {
			System.out.print(
					"\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
			System.out.println("Ya blew it! " + myVirtualPetInstance.death());
			System.exit(0);
		}
		input.close();

	}
}