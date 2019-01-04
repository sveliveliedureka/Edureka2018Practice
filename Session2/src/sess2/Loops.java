package sess2;

public class Loops {

	public static void main(String[] args) {
		System.out.println("*****For Loop*****");
		int num = 7;
		//int i =1;
		for(int i = 1; i<= 10; i++){
		System.out.println(num +" " + i + "'s are :"+ (num * i));
		}
		System.out.println("*****While Loop*****");
		int num1 = 10;
		int i =1;
		while(i<= 10){
			System.out.println(num1 +" " + i + "'s are :"+ (num1 * i));
			//i++;
			//i+=1;
			++i;
		}
		
		System.out.println("*****Do While Loop*****");
		int num2 = 5;
		int j =1;
		do{
			System.out.println(num2 +" " + j + "'s are :"+ (num2 * j));
			j++;
		}
		while(j<=10);
	}

}
