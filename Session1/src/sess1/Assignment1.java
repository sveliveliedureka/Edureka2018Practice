package sess1;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		char c = 'v';
		boolean bol = a>b ;
		double d = 10.50;
		int sum = a+b;
		int minus = a-b;
		int div = b/a;
		int mul = a*b;
		int incr = ++a;
		int dec = --b;
		System.out.println("The bool Value is :" +bol);
		System.out.println("The increment of a is:"+incr);
		System.out.println("The decrement of a is:"+dec);
		System.out.println("The sum of a+ b is:" +sum);
		System.out.println("The substraction of a - b is:" +minus);
		System.out.println("The div of a+ b is:" +div);
		System.out.println("The mul of a+ b is:" +mul);
		
		int age = 19;
		if(age> 18){
			System.out.println("You are elgible to Vote");
		}else{
			System.out.println("You are not eligible to vote");
		}
		
		int num = 0;
		if(num > 0){
			System.out.println("The give number is Positive and the number is:" +num);
		}
		else if(num == 0){
			System.out.println("The given number is Zero and the number is:" +num);
		}else{
			System.out.println("The given number is Negative and the number is:" +num);
		}
		
		int X =70;int Y= 50;
		if(X > Y){
			System.out.println("The largest of two numners is :"+ X);
		}else{
			System.out.println("The largest of two numners is :"+ Y);
		}
		
		int number = 15;
		if(number % 2 == 0){
			System.out.println("The given numner is Even and the numner is: "+ number);
		}
		else{
			System.out.println("The given numner is Odd and the numner is: "+ number);
		}
		

	}

}
