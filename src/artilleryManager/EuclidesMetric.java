package artilleryManager;

public class EuclidesMetric {
 public static double distance(Coordinate a,Coordinate b){
	 return Math.sqrt(Math.pow(b.getX()-a.getX(), 2)-Math.pow(b.getY()-a.getY(),2));
 }
}
