package sess2;

public class ArraySyntaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit Statement
		int[] a1 ={10,20,30,40};
		//Explicit Statement
		int[] a2 = new int[]{10,20,30,40,50};
		
		int a3 [] = {10,20,30,40};
		int a4 [] = new int[]{10,20,30,40,50};
		
		int a5[] = new int[5];
		int[] a6 = new int[5];
		
		a3[2] = 222;
		for(int num : a3){
			System.out.print(num+" ");
		}
		System.out.println();
		a5[1] = 300;
		a5[4] = 450;
		for(int num: a5){
			System.out.print(num+" ");
		}
		System.out.println();

	}

}
