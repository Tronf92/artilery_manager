package artilleryManager;

public interface IGun {
//interface - no implementation
	double getRange();
	int getAmmo();
	void setAmmo(int amount);
	void setPosition(Coordinate position);
	Coordinate getPosition();
}
