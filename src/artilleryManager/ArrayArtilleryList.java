package artilleryManager;

public class ArrayArtilleryList implements IArtilleryList {

	private IGun[] guns = new IGun[100];
	private int numberOfGuns = 0;

	public void addGun(IGun gunToAdd) {
		guns[numberOfGuns] = gunToAdd;
		numberOfGuns++;
	}

	public int numberOfGuns() {
		return numberOfGuns;
	}

	public IArtilleryList gunsWithinRange(Coordinate toShootAt) {
		ArrayArtilleryList withinRange = new ArrayArtilleryList();
		double distance;
		IGun actualGun;
		for (int i = 0; i < numberOfGuns; i++) {
			actualGun = guns[i];
			distance = EuclidesMetric.distance(actualGun.getPosition(), toShootAt);
			if (distance <= actualGun.getRange()) {
				withinRange.addGun(actualGun);
			}
		}
		return withinRange;
	}

	@Override
	public String toString() {
		String list = "";
		for (int i = 0; i < numberOfGuns; i++) {
			list += guns[i].toString() + System.lineSeparator();
		}
		return list;
	}

}
