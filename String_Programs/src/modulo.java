import java.util.Scanner;

public class modulo {
	
	String convert (int num) {
		if (num%3 == 0) {
			return "pling";
		}
		if(num%5 == 0) {
			return "plang";
		}
		if(num%7 == 0) {
			return "plong";
		}
		return Integer.toString(num);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		modulo modulos = new modulo();
		System.out.println("Enter the number");
		int num = input.nextInt();
		System.out.println(modulos.convert(num));
      }

}
