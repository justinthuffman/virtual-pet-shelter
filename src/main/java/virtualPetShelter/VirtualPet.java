package virtualPetShelter;

//naming
//feeding
//watering
//playing
//adopiton (pet out)
//intake (pet in)

public class VirtualPet {
	public String petName;
	public String petDescription;
	public int petHunger;
	public int petThirst;
	public int petBoredom;

	public VirtualPet(String name, int hunger, int thirst, int boredom) {
		petName = name;
		petHunger = hunger;
		petThirst = thirst;
		petBoredom = boredom;
	}

	public VirtualPet(String name, String description) {
		this.petName = name;
		this.petDescription = description;
		this.petHunger = 0;
		this.petThirst = 0;
		this.petBoredom = 0;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	public int getHunger() {
		return petHunger;
	}

	public int getThirst() {
		return petThirst;
	}

	public int getBoredom() {
		return petBoredom;
	}

	public void feed() {
		petHunger -= 7;
	}

	public void water() {
		petThirst -= 7;
	}

	public void play() {
		petBoredom -= 7;
	}

	public void tick() {
		petHunger += 2;
		petThirst += 2;
		petBoredom += 2;
	}
}