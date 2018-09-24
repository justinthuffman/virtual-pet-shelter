package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	VirtualPet adoptablePet = new VirtualPet(null, null);
	Map<String, VirtualPet> myVirtualShelter = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> availablePets() {
		return myVirtualShelter.values();
	}

	public void addPet(VirtualPet adoptablePet) {
		String petsAvailable = adoptablePet.getName();
		myVirtualShelter.put(petsAvailable, adoptablePet);
	}

	public void adoptPet(String adoption) {
		myVirtualShelter.remove(adoption);
	}

	public void showPets(VirtualPet adoptablePet) {
		for (Entry<String, VirtualPet> entry : myVirtualShelter.entrySet()) {
			System.out.println("Name : " + entry.getKey() + "\tHunger: " + entry.getValue().getHunger() + "\tThirst: "
					+ entry.getValue().getThirst() + "\tBoredom: " + entry.getValue().getBoredom());
		}
	}

	public VirtualPet getPet(String name) {
		return myVirtualShelter.get(name);
	}

	public void showPetName(VirtualPet adoptablePet) {

		for (Entry<String, VirtualPet> entry : myVirtualShelter.entrySet()) {
			System.out.print(entry.getKey() + "\t" + entry.getValue().getDescription() + "\n");
		}
	}

	public void feedPets(VirtualPet adoptablePet) {
		for (VirtualPet entries : availablePets()) {
			entries.feed();
		}
	}

	public void waterPets(VirtualPet adoptablePet) {
		for (VirtualPet entries : availablePets()) {
			entries.water();
		}
	}

	public void tick(VirtualPet adoptablePet) {

		for (VirtualPet entries : availablePets()) {
			entries.tick();
		}
	}

	public boolean hasPets() {
		return !myVirtualShelter.isEmpty();
	}
}
