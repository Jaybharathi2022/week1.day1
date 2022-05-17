package week1.day1.assignment;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 873412;
	boolean isPunctured = false;
	String bikeName = "Suzuki Access";
	double runningKm = 23456.65;

	public static void main(String[] args) {
		TwoWheeler myTwoWheeler = new TwoWheeler();
		System.out.println("Bike name  " + myTwoWheeler.bikeName);
		System.out.println("Number of wheels  " + myTwoWheeler.noOfWheels);
		System.out.println("Number of mirrors  " + myTwoWheeler.noOfMirrors);
		System.out.println("Chasis number  " + myTwoWheeler.chassisNumber);
		System.out.println("Is Punctured " + myTwoWheeler.isPunctured);
		System.out.println("Run Km " + myTwoWheeler.runningKm);
	}

}
