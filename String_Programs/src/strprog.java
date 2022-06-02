
import java.util.Scanner;

public class strprog {

	    public double successrate(int speed){
	    	if (speed == 10) {
	            return 0.77;
	        }
	        if (speed == 9) {
	            return 0.8;
	        }
	        if (speed >= 5) {
	            return 0.9;
	        }
	        return 1;
	    } 
	    public double productionRatePerHour(int speed) {
	        return speed*221*successrate(speed);
	    }

	    public int workingItemsPerMinute(int speed) {
	        return (int)(productionRatePerHour(speed)/60);
	    }

	public static void main(String[] args) {
		strprog car = new strprog();
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the speed");
		int speed = myObj.nextInt();
		car.successrate(speed);
		car.productionRatePerHour(speed);
		int result = car.workingItemsPerMinute(speed);
		System.out.println(result);

	}

}
