package artilleryManager;

public interface IArtilleryList {

	void addGun(IGun gunToAdd);
	int numberOfGuns();
	IArtilleryList gunsWithinRange(Coordinate toShootAt);
	
	
}
