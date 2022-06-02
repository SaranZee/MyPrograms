
public class ElonsToyCar {
	
	private int driven = 0;
	private int batterypercentage = 100;
	private int minutes = 30 , speed = 80;
	
	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}
	
	public int drive() {
		if(minutes >=30 && speed >= 80 && batterypercentage!=0) {
			batterypercentage--;
			driven += 20;
		}
		return driven;
	}
	
	public int distanceDisplay() {
		return driven;
		
	}
	
	public int batteryDisplay() {
		if(batterypercentage == 0) {
			return batterypercentage ;
		}
		return batterypercentage;
	}

	public static void main(String[] args) {
		ElonsToyCar car = ElonsToyCar.buy();
		System.out.println("Driven "+car.drive()+ "meters");
		System.out.println("Drained " + car.distanceDisplay());
		System.out.println("Battery " + car.batteryDisplay() + " remaining");
	}

}
