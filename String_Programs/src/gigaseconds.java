import java.time.LocalDate;
import java.time.LocalDateTime;

class gigaseconds {
	 private LocalDateTime moment;
	 
	 gigaseconds(LocalDate moment){
		 this.moment = moment.atTime(0,0);
	 }
	 
	 gigaseconds(LocalDateTime moment){
		 this.moment = moment;
	 }
	 
	 LocalDateTime getDateTime() {
		 return moment.plusSeconds(1000000000);
	 }

	public static void main(String[] args) {
		gigaseconds giga = new gigaseconds();
		System.out.println(giga.getDateTime());

	}

}
