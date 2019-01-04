package sess2;

public class Conditions {

	public static void main(String[] args) {
		boolean isInternetEnabled = true;
		boolean isGpsEnables = false;
		if(isInternetEnabled){
			System.out.println("You can surf Internet !!");
		}
		else{
			System.out.println("Please enable Internet and try again");
		}
		
		//Nested if/else - if else with in if else
		if(isInternetEnabled){
			if(isGpsEnables){
				System.out.println("You can surf Internet and use GPS !!");
			}else{
				System.out.println("Please enable GPS and try again !!");
			}
			
		}else{
			System.out.println("Please enable Internet and try again");
			
		}
		
		int poolCab = 1;
		int luxCab = 2;
		int suvCab = 3;
		int userChoice = 2;
		//Ladder if/else
		if(userChoice == poolCab){
			System.out.println("Your Pool cab is booked . Arriving Soon!! Please pay $20");
			
		}else if(userChoice == luxCab){
			System.out.println("Your lux cab is booked . Arriving Soon!! Please pay $30");
		}else if(userChoice == suvCab){
			System.out.println("Your suv cab is booked . Arriving Soon!! Please pay $50");
		}else{
			System.out.println("Please have a valid selection");
		}
		System.out.println("Thanks for Riding with us");
	}

}
