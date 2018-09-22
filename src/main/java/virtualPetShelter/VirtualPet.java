package virtualPetShelter;

public class VirtualPet {

	// Traits of virtual pet
	int hunger;
	int thirst;
	int waste;
	int boredom;
	int tiredness;

	// pet characteristics
	public VirtualPet(int initialHunger, int initialThirst, int initialWaste, int initialBoredom, int initialTiredness,
			String petName) {
		hunger = initialHunger;
		thirst = initialThirst;
		waste = initialWaste;
		boredom = initialBoredom;
		tiredness = initialTiredness;
	}

	public String petNameEntry() {
		return ("Please name your pet: ");
	}

	public String userInputChoices() {
		return ("What would you like to do:\n1. Feed\n2. Water\n3. Let out\n4. Play with\n5. Send to bed");
	}

	// actions and repercussions
	public void eat() {
		hunger -= 7;
		System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
		System.out.println("Mmmmmm mmmmm good. They love your cooking.");

	}

	public void drink() {
		thirst -= 7;

	}

	public void bathroom() {
		waste -= 7;

	}

	public void play() {
		boredom -= 7;
	}

	public void sleep() {
		tiredness -= 7;
	}

	public void tick() {
		hunger += 2;
		thirst += 2;
		waste += 2;
		boredom += 2;
		tiredness += 2;
	}

	// status check
	public String statusUpdate() {
		if (hunger > 3) {
			return "Your cat is hungry!\n";
		} else if (thirst > 3) {
			return "Your cat is thirsty!\n";
		} else if (waste > 3) {
			return "Everybody has to poop, and so does your cat... like right now.\n";
		} else if (boredom > 3) {
			return "You're SO BORING. Play with your cat!\n";
		} else if (tiredness > 3) {
			return "Your cat seems sleepy.\n";
		} else
			return "";
	}

	boolean notDead() {
		if (hunger > 10 || thirst > 10 || waste > 10 || boredom > 10 || tiredness > 10) {
			return false;
		}
		return true;
	}

	String death() {
		if (hunger > 10) {
			return "Your cat starved to death!";
		} else if (thirst > 10) {
			return "Your cat died of dehydration!";
		} else if (waste > 10) {
			return "Your cat ran away to shit and never came back!";
		} else if (boredom > 10) {
			return "Your cat didn't die of boredom, but it did find a better owner that plays with them and is now way happier.";
		} else if (tiredness > 10) {
			return "Your cat died of exhaustion!";
		} else
			return "";
	}
}