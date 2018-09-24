package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pets = new VirtualPet("Laura", " Wrapped in plastic.");
		VirtualPetShelter petsInShelter = new VirtualPetShelter();
		petsInShelter.addPet(pets);
		VirtualPet cooper = new VirtualPet("Cooper", " Diane says he's happy to be in this shelter.");
		petsInShelter.addPet(cooper);
		VirtualPet leland = new VirtualPet("Leland",
				" A babe in the woods, with a large hole where his conscious used to be.");
		petsInShelter.addPet(leland);
		VirtualPet bob = new VirtualPet("BOB", " Eager for fun. He wears a smile, everybody run.");
		petsInShelter.addPet(bob);
		VirtualPet windom = new VirtualPet("Denise",
				" I may be wearing a dress, but I still pull my panties on one leg at a time if you know what I mean.");
		petsInShelter.addPet(windom);
		System.out.println("Welcome to The Lodge Animal Shelter!");

		String showMenu = "\n\t	What would you like to do next?\n" + "\n\t" + "1. Feed the pets\n\t"
				+ "2. Water the pets\n\t" + "3. Play with a pet\n\t" + "4. Adopt a pet\n\t" + "5. Admit a pet\n\t"
				+ "6. Show all pets.\n\t" + "7. Quit";

		String userChoice;
		while (petsInShelter.hasPets()) {
			do {
				System.out.println(showMenu);
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6")
					&& !userChoice.equals("7"));
			switch (userChoice) {
			case "1":
				petsInShelter.tick(pets);
				petsInShelter.feedPets(pets);
				System.out.println("They all seem happy and full.");
				break;
			case "2":
				petsInShelter.tick(pets);
				petsInShelter.waterPets(pets);
				System.out.println("You've watered all the pets in the shelter.");
				break;
			case "3":
				petsInShelter.tick(pets);
				System.out.println("Who are you going to play with?");
				petsInShelter.showPetName(pets);
				System.out.println();
				String chosenPet = input.next();
				VirtualPet playWithPet = petsInShelter.getPet(chosenPet);
				playWithPet.play();
				System.out.println(chosenPet + " had a great time!");
				break;
			case "4":
				petsInShelter.tick(pets);
				System.out.println("Which pet would you like to adopt?");
				petsInShelter.showPetName(pets);
				System.out.println();
				String upForAdoption = input.next();
				petsInShelter.adoptPet(upForAdoption);
				System.out.println("Hey! You've just adopted " + upForAdoption);
				break;
			case "5":
				petsInShelter.tick(pets);
				System.out.print("Please name the new pet: ");
				String newPet = input.next();
				System.out.println();
				System.out.print("Please describe the pet: ");
				String newPetDescription = input.next();
				VirtualPet strayPet = new VirtualPet(newPet, newPetDescription);
				petsInShelter.addPet(strayPet);
				System.out.print(newPet + ", \"" + newPetDescription + "\"" + " Joined The Lodge.");
				break;
			case "6":
				petsInShelter.tick(pets);
				System.out.println("These are the pets at The Lodge:");
				petsInShelter.showPets(pets);
				break;
			case "7":
				System.out.println("See you next time!");
				System.exit(0);
				break;
			}
		}
		input.close();
	}
}
