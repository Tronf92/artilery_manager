package artilleryManager;

public class Gun implements IGun {

	//define variables
	// Coordinate - data type
	int ammo;
	double range;
	Coordinate position; 
	
	public double getRange() {
		// TODO Auto-generated method stub
		return range;
	}

	public int getAmmo() {
		// TODO Auto-generated method stub
		return ammo;
	}

	public void setAmmo(int amount) {
		// TODO Auto-generated method stub
		ammo = amount;

	}

	public void setPosition(Coordinate position) {
		// TODO Auto-generated method 
		
		this.position = position;

	}

	public Coordinate getPosition() {
		// TODO Auto-generated method stub
		return position;
	}
	
	public String toString()
			{
		return "Gun:ammo = " + ammo + " range = " + range + " position =" + position;
		
			}

}
