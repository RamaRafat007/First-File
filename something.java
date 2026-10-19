package lab1;
 
public class Seat {
	private int seatNumber;
	private String passengerName;
 
	Seat(int seatNumber){
		this.seatNumber = seatNumber;
	}
 
	public int getSeatNumber() {
		return seatNumber;
	}
 
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
 
	public String getPassengerName() {
		return passengerName;
	}
 
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
 
	public boolean isEmpty(String passengerName){
		if (passengerName == null){
			return true;
		}
		else{
			return false;
		}
	}
 
	public String toString(){
		String information = seatNumber + ": " + passengerName;
		return information;
	}
 
	public static boolean isValid(int seatNumber){
		if (seatNumber<1 || seatNumber>92 || seatNumber==3 || seatNumber==4||seatNumber==89||seatNumber==90){
			return false;
		}
		else
			return true;
		}
 
	public static int getRow(int seatNumber){
		boolean result = isValid(seatNumber);
		if (result == true){
			int rowNumber = ((seatNumber-1)/4)  +1;
			return rowNumber;
		}
		else{
			return -1;
		}
	}
 
	public static int getColumn (int seatNumber){
		boolean result = isValid(seatNumber);
		if (result == true){
			int columnNumber = ((seatNumber-1)%4) + 1;
			return columnNumber;
		}
		else{
			return -1;
		}
	}
 
	public static void main(String [] args){
		Seat mySeat = new Seat(5);
        	mySeat.setPassengerName("Ahmad");
        	System.out.println(mySeat.toString());
        	System.out.println("Is empty: " + mySeat.isEmpty(mySeat.getPassengerName()));
        	int seatNumToCheck = 5;
        	System.out.println("Is Valid: " + Seat.isValid(seatNumToCheck));
        	System.out.println("Row: " + Seat.getRow(seatNumToCheck));
        	System.out.println("Column: " + Seat.getColumn(seatNumToCheck)); 
	}
 
}