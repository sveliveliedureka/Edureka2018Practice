package sess3;

public class Functions {
	//Non Static Functions/Methods
	//Void means no return in the method
	void addNumbers(int n1, int n2){
		int n3 = n1+n2;
		System.out.println("n3 is :"+ n3);
	}
	//Function with return type: We need to return integer data in the END	
	int addNumbersAgain(int n1, int n2){
		int n3 = n1+n2;
		//System.out.println("n3 is :"+n3);
		return n3;
	}
	void addManyNumbers(int [] arr){
		int sum =0;
		for(int elm: arr){
			sum = sum + elm;
		}
		System.out.println("sum is: "+ sum);
	}
	//Statics Method and does not need to create an object to use this mehtod.
	static void sqrtNumbers(int num){
		int result = num * num;
		System.out.println("Sqrt of Numner "+num+ "is: "+result);
	}
	
	static double areaOfCirlce(double radius){
		double result = 3.14*radius*radius;
		return result;
	}

	public static void main(String[] args) {
		//Object Construction  we shall discuss later
		Functions f1 = new Functions();
		f1.addNumbers(10, 20);
		f1.addNumbersAgain(20, 30);
		f1.addNumbers(20, 50);
		int result = f1.addNumbersAgain(12,18);	//Capture returned value from method/Function
		System.out.println("result is: "+ result);
		result = f1.addNumbersAgain(22, 18);
		System.out.println("result is: "+ result);
		
		int [] a1 = {10,20,30,40,50};
		System.out.println("a1 is: "+ a1);//a1 is the reference variable
		f1.addManyNumbers(a1);
		
		//We don't need object creation for Static methods/Functions
		//Directly access them through class name
		Functions.sqrtNumbers(4);
		double area = Functions.areaOfCirlce(2.0);
		System.out.println("Area is: "+ area);
		System.out.println("Area of Circle with radius 5.5 is: "+Functions.areaOfCirlce(5.5));//Returned Value is direclty printed
	}

}
