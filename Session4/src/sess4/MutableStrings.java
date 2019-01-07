package sess4;

public class MutableStrings {

	public static void main(String[] args) {
		//String are Immutable i.e they cannot be modified
		String str = new String("Hello");
		str = str.concat("World");
		System.out.println("str is: "+ str);
		
		//String Buffer is Thread Safe
		//String Buffer are Mutable i.e they can be modified
		StringBuffer str1 = new StringBuffer("Hello");
		str1.append("World");
		System.out.println("str is: "+str1);
		
		//String Buffer is not Thread Safe
		//String Buffer are Mutable i.e they can be modified
		StringBuilder str2 = new StringBuilder("Hello");
		str2.append("World");
		System.out.println("str is: "+str2);
		
		int[] a = { 1, 2, 3 };int[] b = { 1, 2, 3 };System.out.println(a == b);
		
		int length = 100; 
		int[] d = new int[length]; 
		for (int i = 0; i < length; i++) 
			System.out.println(d[i]);

	}

}
