package sess1;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 133;
		int rev = 0;
		while(num != 0){
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
System.out.println("The Reverse Number is :" + rev);

	}

}
