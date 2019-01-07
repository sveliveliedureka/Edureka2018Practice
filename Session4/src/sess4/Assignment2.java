package sess4;
import java.util.Scanner;

public class Assignment2 {

	 void display(int id[], double salary[], String names[]){
		System.out.println("----------------------------------------------------------");
		System.out.println("ID			Name			Salary");
		System.out.println("----------------------------------------------------------");
		int length = id.length;
		for(int i =0; i<length; i++)
		{
			System.out.println(id[i]+"			"+names[i]+ "			"+salary[i]	);
		}
	}	 
	 
	 void display(int id[],String names[]){

			System.out.println("---------------------------------------");
			System.out.println("ID			Name");
			System.out.println("---------------------------------------");
			int length = id.length;
			for(int i =0; i<length; i++)
			{
				System.out.println(id[i]+"			"+names[i]);
			}
		}
	
	 void display(String name, int id[],String names[],double salary[]){
			System.out.println("----------------------------------------------------------");
			System.out.println("ID			Name			Salary");
			System.out.println("----------------------------------------------------------");
			int length = id.length;
			for(int i =0; i<length; i++)
			{
				if(names[i].equals(name))
				System.out.println(id[i]+"			"+names[i]+ "			"+salary[i]	);
			}
	 }

	 public static void main(String[] args) {
		int id[] = new int[5];
		double salary[] = new double[5];
		String names[] = new String[5];

		Scanner scan = new Scanner(System.in);
		for(int i =0; i<5 ; i++){
			System.out.println("Enter Employee ID Salary and Name Format.....");
			id[i]= scan.nextInt();
			salary[i] = scan.nextDouble();
			names[i] = scan.next();
			
		}
		Assignment2 assign = new Assignment2();
		assign.display(id, salary, names);
		System.out.println("***********************************************");
		assign.display(id, names);
		System.out.println("Enter name to Search the Employee..........");
		String name = scan.next();
		assign.display(name, id, names, salary);
	}

}
