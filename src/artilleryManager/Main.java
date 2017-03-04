package artilleryManager;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayArtilleryList a= new ArrayArtilleryList();
		
		Random r = new Random(); //randomly generate numbers 
		
		{
			for (int i = 0; i <= 20; i++)
			{
				IGun gun = new Gun();
				gun.setAmmo(r.nextInt(200));
				gun.setPosition(new Coordinate((r.nextInt(200)),r.nextInt(200)));
				a.addGun(gun);
				System.out.println(gun);
				
			}
		}

	}
	

}
