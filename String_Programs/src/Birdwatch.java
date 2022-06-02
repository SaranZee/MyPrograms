import java.util.Scanner;

public class Birdwatch {
	
	public int[] getlastweek (int[] lastweek) {
		return lastweek;
	}
	
	public int gettoday (int[] lastweek) {
		int len = lastweek.length;
		return lastweek[len-1];
	}
	
	public int increamenttodayscount(int[] birdsperday) {
		int len = birdsperday.length;
		int todayscount = birdsperday[len-1]+1;
		return todayscount;
	}
	
	public boolean HasDayWithoutBirds(int[] birdsperday) {
		for (int i : birdsperday) {
			if (birdsperday[i]==0) {
				return true;
			}
		}
		return false;
	}
	
	public int getCountForFirstDays(int[] birdsperday, int days) {
		int count=0;
		for(int i=0 ; i < days; i++) {
			count = count + birdsperday[i];
		}
		return count;
	}
	
	public int getBusyDays(int[] birdsperday) {
		int count = 0;
		for (int i=0 ; i<birdsperday.length;i++) {
			if(birdsperday[i]>=5) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner day = new Scanner(System.in);
		int[] lastweek = {0, 2, 5, 3, 7, 8, 4};
		int[] birdsperday = {2, 5, 0, 7, 4, 1 };
		Birdwatch bird = new Birdwatch();
		int [] lastweek1 = bird.getlastweek(lastweek);
		for(int i : lastweek1) {
			System.out.println(i);
		}

		System.out.println("Today Count : "+ bird.gettoday(birdsperday));
		System.out.println("Incremented count : "+ bird.increamenttodayscount(birdsperday));
		System.out.println("Without Birds : "+bird.HasDayWithoutBirds(birdsperday));
		System.out.println("Enter the days : ");
		int days = day.nextInt();
		System.out.println("Visted Count :"+ bird.getCountForFirstDays(birdsperday,days));
		System.out.println("Busy Days :"+ bird.getBusyDays(birdsperday));	
	}
}
