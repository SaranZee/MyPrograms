import java.util.Scanner;
import java.util.*;

public class Divide_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char str1[] = str.toCharArray();
		System.out.println("Enter the number by which the string has to be divided");
		int num = sc.nextInt();
		int n = str.length();
		
		int n1 = n / num;
		
		for (int i=0;i<n;i++)
		{
			
			System.out.print(str1[i]);
			if(i==n1-1)
			{
			System.out.println();
			n1 = n1+n1;
			}
		}				

	}

}
