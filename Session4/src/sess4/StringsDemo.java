package sess4;

public class StringsDemo {

	public static void main(String[] args) {
		
		char chr = 's';
		//Interned Way
		String s ="Srinivas";
		String s2 ="Srinivas";
		
		//Object Way
		//Strings are referenced types
		//tostring() is executed automatically executed by complier, hence we did not see hascode rather we see values
		String s3 = new String("Srinivas");
		String s4 = new String("Srinivas");
		
		System.out.println("s is: "+s);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		
		System.out.println("s uisng tostring is: "+s.toString());
		System.out.println("s2 uisng tostring is: "+s2.toString());
		System.out.println("s3 uisng tostring is: "+s3.toString());
		System.out.println("s4 uisng tostring is: "+s4.toString());
		
		System.out.println("************");
		// == Operator is comparing references and not the values
		if(s == s2){
			System.out.println("S1 == S2"); //Primitive Comparision
		}else{
			System.out.println("S1!=S2");
		}
		
		if(s3 == s4){
			System.out.println("S3 == S4");
		}else{
			System.out.println("S3!=S4");
		}
		System.out.println("****************");
		//equals This is a String Comparison: Content
		if(s.equalsIgnoreCase(s2)){
			System.out.println("S1 is equal to S2");
		}else{
			System.out.println("S1 is not equal to S2");
		}
		
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("S3 is equal to S4");
		}else{
			System.out.println("S3 is not equal to S4");
		}
		
		if(s.compareToIgnoreCase(s2) ==0){
			System.out.println("S1 is compared to S2");
		}else{
			System.out.println("S1 is not compared to S2");
		}
		
		if(s3.compareToIgnoreCase(s4) == 0){
			System.out.println("S3 is compared to S4");
		}else{
			System.out.println("S3 is not compared to S4");
		}
		//Strings in Java are references types
	}

}
