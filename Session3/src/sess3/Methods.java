package sess3;
import java.util.Scanner;

public class Methods {

	void areOfRectangle(int l, int b){
		int result = l* b;
		System.out.println("Area of Rectangle is: " + result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Lenght: ");
		int l = scan.nextInt();
		System.out.println("Enter Breadth: ");
		int b = scan.nextInt();
		Methods m = new Methods();
		m.areOfRectangle(l, b);

	}

}
