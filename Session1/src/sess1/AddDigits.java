package sess1;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 250;
		int n = 0;
		int sum =0;
		while(num > 0){
			n = num % 10;
			sum = sum + n;
			num = num/10;
		}
		System.out.println("The sum of digit is :"+ sum);
	}

}
