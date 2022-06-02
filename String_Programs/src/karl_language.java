import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class karl_language {
	
	public boolean isEmpty(List<String> language) {
		if(language.isEmpty())
			return true;
		return false;
	}
	
	public void addlanguage(String languages,List<String> language){
		language.add(languages);
		
	}

	public static void main(String[] args) {
		karl_language lan = new karl_language();
		List<String> language = new ArrayList<String>();
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the number of languages : ");
		int n = input1.nextInt();
		System.out.println("Enter the language : ");
		for(int i=0;i<n;i++){
			language.add(input1.next());
		}
		System.out.println(language);
		System.out.println("Is List Empty? : "+lan.isEmpty(language));
		System.out.println("Enter the number of languages need to be added :");
		int n1 = input1.nextInt();
		for(int i =0 ; i<n1 ;i++) {
			lan.addlanguage(input1.next(),language);
		}
		System.out.println(language);
		input1.close();
	}
}
