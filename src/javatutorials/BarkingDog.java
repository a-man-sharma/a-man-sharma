package javatutorials;

public class BarkingDog {
	 static boolean a;
	public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
		if (hourOfDay<0 || hourOfDay>23) {

		}
		else if (barking && ((hourOfDay<8)||(hourOfDay>22))){
			a=true;
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = shouldWakeUp(true,22);
		System.out.println(result);
	}

}
