package sess4;

public class StringOperations {

	public static void main(String[] args) {

		//Strings are Immutable i.e they cannot be changed !!
		String str1 ="Its an Awesome Day";
		str1 = str1.toUpperCase();
		System.out.println("str1 is: "+ str1);

		String salutation = "Mr.";
		String fName ="Srini";
		String lName ="Vasu";
		String name =salutation+" "+fName+" "+lName;
		System.out.println("Name is: "+name);
		
		
		String names = " Srini, Swathi, Suraj,Sruthi";
		String newNames = names.replace('S', 'p');
		System.out.println("New Names are: "+ newNames);
		char[] cha = names.toCharArray();
		int count =0;
		for(char ch: cha){
			System.out.print(ch+" ");
			if(ch=='S'){
				count++;
			}
		}
		System.out.println();
		System.out.println("S Occurs "+count+" times ");	
		
		String str3 = names.substring(6,12);
		System.out.println("Str3 is: "+ str3);
		
		int idx = names.indexOf('r');
		System.out.println("Index of s is: "+ idx);
		
		idx =names.lastIndexOf('S');
		System.out.println("Last Index of s is: "+ idx);
		
		int l = names.length();
		System.out.println("Lenght of String names is: "+l);
		
		idx = names.indexOf("Srini");
		System.out.println("index of Jennie is: "+idx);
		
		char ch = names.charAt(7);
		System.out.println("Char at index 7 is: "+ch);
		
		if(names.contains("Srini")){
			System.out.println("Srini is present in the names.");
			
			String[] allNames = names.split(",");
			for(String s: allNames){
				System.out.println(s.trim());
			}
		}
	}

}
