import java.util.Scanner;

public class Duplicate_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine();
		int num = str1.length();
		char str2[] = str1.toCharArray();
		
		
		System.out.println("Duplicate Values in given String");
		
		for(int i=0; i < str2.length;i++)
		{
			int count=0;
			
			for (int j=i+1; j<str2.length;j++)
			{
				if(str2[i]==str2[j] && str2[i]!=' ')
				{
					
					count++;
					str2[j]='0';
				}
			}
			if(count>0 && str2[i]!= '0')
				System.out.println(str2[i]);
		}
		

	}

}
