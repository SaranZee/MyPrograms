import java.util.*;
import java.lang.*;

public class cipherdecipher{
	
	
	public String ciphering(String normal) {
		
		StringBuffer cipher = new StringBuffer();
		int len = normal.length();
		for (int i=0 ; i<len ; i++) {
			char c = normal.charAt(i);
			if(Character.isUpperCase(c)) {
				cipher = Character.toLowerCase(c);
			}
			else{
				cipher = append (Character.toUpperCase(c));
			}
		}
		return null;
		
	}
	
	public String deciphering(String ciphered) {
		
		return null;
	}
}
public class Word_Count {

	public static void main(String[] args) {
		        Scanner readInput = new Scanner(System.in);
		        System.out.println("Enter normal text");
		        String normal=readInput.nextLine();
		        System.out.println("Enter the ciphered text");
		        String ciphered=readInput.nextLine();
		        
		        CipherDecipher cipherOrDecipher = new CipherDecipher();
		        System.out.println(cipherOrDecipher.ciphering(normal));
		        System.out.println(cipherOrDecipher.deciphering(ciphered));
		    }

	}
