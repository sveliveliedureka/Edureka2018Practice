package sess2;

public class NestedLoops {

	public static void main(String[] args) {

		for(int i =1; i<= 3; i++){
			System.out.print("*");
			for(int j = 0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
