import java.util.Scanner;

public class Replace_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine();
		System.out.println("Replaced String");
		
		str1 = str1.replaceAll(" ","Hi");
		System.out.println(str1);
		
	}

}
