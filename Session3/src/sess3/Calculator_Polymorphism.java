package sess3;

public class Calculator_Polymorphism {

	void add(int num1, int num2){
		int result = num1+ num2;
		System.out.println("additon of numbers "+num1+ " and  "+num2+" is :" + result);
	}
	void add(int num1, int num2, int num3){
		int result = num1+ num2+num3;
		System.out.println("additon of numbers "+num1+ ","+num2+ " and "+ num3+ " is :" + result);
	}
	
	void add(double num1, double num2){
		double result = num1+ num2;
		System.out.println("additon of numbers "+num1+ ","+num2+ " is :" + result);
	}
	
	void add(int num1, double num2){
		double result = num1+ num2;
		System.out.println("additon of numbers "+num1+ ","+num2+ " is :" + result);
	}
	public static void main(String[] args) {

		Calculator_Polymorphism c = new Calculator_Polymorphism();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.234, 20.456);
		c.add(10, 20.987);
	}

}
