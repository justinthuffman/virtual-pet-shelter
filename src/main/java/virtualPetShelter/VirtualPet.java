package virtualPetShelter;

public class VirtualPet {

	// Traits of virtual pet
	int hunger;
	int thirst;
	int waste;
	int boredom;
	int tiredness;

	// pet characteristics
	public VirtualPet(int initialHunger, int initialThirst, int initialWaste, int initialBoredom,
			int initialTiredness) {
		hunger = initialHunger;
		thirst = initialThirst;
		waste = initialWaste;
		boredom = initialBoredom;
		tiredness = initialTiredness;
	}

	public String userInputChoices() {
		return ("What would you like to do:\n1. Feed\n2. Water\n3. Let out\n4. Play with\n5. Send to bed");
	}

	// actions and repercussions
	public void eat() {
		hunger -= 5;
		thirst += 1;
		waste += 2;
		boredom += 1;
		tiredness += 1;
	}

	public void drink() {
		hunger += 1;
		thirst -= 5;
		waste += 2;
		boredom += 1;
		tiredness += 1;
	}

	public void bathroom() {
		hunger += 1;
		thirst += 1;
		waste -= 5;
		boredom += 1;
		tiredness += 1;
	}

	public void play() {
		hunger += 2;
		thirst += 2;
		waste += 0;
		boredom -= 5;
		tiredness += 2;
	}

	public void sleep() {
		hunger += 2;
		thirst += 2;
		waste += 2;
		boredom += 0;
		tiredness -= 5;
	}

	public void godMode() {
		hunger -= 999999999;
		thirst -= 999999999;
		waste -= 999999999;
		boredom -= 999999999;
		tiredness -= 999999999;
	}

	// status check
	public String statusUpdate() {
		if (hunger > 3) {
			return "               )\\._.,--....,'``.       \n" + " .b--.        /;   _.. \\   _\\  (`._ ,. \n"
					+ "`=,-,-'~~~   `----(,_..'--(,_..'`-.;.'\n \n Your cat is hungry!\n";
		} else if (thirst > 3) {
			return "    (\"`-''-/\").___..--''\"`-._\n" + "     `6_ 6  )   `-.  (     ).`-.__.`)\n"
					+ "     (_Y_.)'  ._   )  `._ `. ``-..-'\n" + "   _..`--'_..-_/  /--'_.' ,'\n"
					+ "  (il).-''  (li).'  ((!.-' \n--Your cat is thirsty!\n";
		} else if (waste > 3) {
			return "                       (`.-,')\n" + "                     .-'     ;\n"
					+ "                 _.-'   , `,-\n" + "           _ _.-'     .'  /._\n"
					+ "         .' `  _.-.  /  ,'._;)\n" + "        (       .  )-| (\n"
					+ "         )`,_ ,'_,'  \\_;)  \n" + " ('_  _,'.'  (___,))\n" + "  `-:;.-'\n"
					+ "\n --Everybody has to poop, and so does your cat... like right now.\n";
		} else if (tiredness > 3) {
			return "   |\\      _,,,---,,_\n" + "   /,`.-'`'    -.  ;-;;,_\n" + "  |,4-  ) )-,_..;\\ (  `'-'\n"
					+ " '---''(_/--'  `-'\\_) \n--Your cat seems sleepy.\n";
		} else
			return "                                 _\n" + "                                | \\\n"
					+ "                                | |\n" + "                                | |\n"
					+ "           |\\                   | |\n" + "          /, ~\\                / /\n"
					+ "         X     `-.....-------./ /\n" + "          ~-. ~  ~              |\n"
					+ "             \\             /    |\n" + "              \\  /_     ___\\   /\n"
					+ "              | /\\ ~~~~~   \\ |\n" + "              | | \\        || |\n"
					+ "              | |\\ \\       || )\n" + "             (_/ (_/      ((_/";
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