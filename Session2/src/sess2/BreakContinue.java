package sess2;

public class BreakContinue {

	public static void main(String[] args) {
		 
		int whichFloor = 5;
		//Break will terminate the loop
		for(int floor =0; floor <=10; floor++){
			System.out.println("Elevator of the floor number: "+ floor);
			if(whichFloor == floor){
				System.out.println("Elevator of the floor number: "+ floor +" Step out");
				break;
			}

		}
		System.out.println();
		//Continue makes the loop to the next iteration
		for(int i =0; i<= 10; i++){
			if (i<=5){
				continue;
			}
			System.out.println("i is : "+ i);
		}

	}

}
