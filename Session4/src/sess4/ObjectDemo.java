package sess4;

import java.util.Scanner;

class user{
	String name;
	char sex;
	private String phoneNum;
	private int age;
	String email;
	String address;
	
	void setPhone(String ph){
		phoneNum = ph;
	}
	
	void setage(int ag){
		age = ag;
	}
	String getPhone(){
		return phoneNum;
	}
	
	int getAge(){
		return age;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		user us1 = new user();
		us1.address ="5050 talbott dr";
		us1.name ="Srinivas";
		us1.email ="sveliveli@gmail.com";
		us1.sex ='M';
		us1.setage(35);
		us1.setPhone("973-723-5068");
		
		user us2 = new user();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter user detail with name,email,address,age,phone format...........");
		us2.name = scan.next();
		us2.email = scan.next();
		us2.address = scan.next();
		us2.setage(scan.nextInt());
		us2.setPhone(scan.next());
		
		
		System.out.println("Us1 details are: \n "+"Name:"+us1.name +"\n "+"Email:"+us1.email+"\n "+"Address:"+us1.address+"\n "+"Age:"+us1.getAge()+"\n "+"Phone:"+ us1.getPhone());
		System.out.println("Us2 details are: \n "+"Name:"+us2.name +"\n "+"Email:"+us2.email+"\n "+"Address:"+us2.address+"\n "+"Age:"+us2.getAge()+"\n "+"Phone:"+ us2.getPhone());
	}	
}
