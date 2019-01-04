package sess3;

public class MultiDimArrays {

	public static void main(String[] args) {

		int [][] a =
			{
			
					{10,20,30},
					{10,20,30,40,50},
					{10},
					{10,20},
					{10,20,30,40},
			};
		System.out.println();
		a[1][2]= 122;
		for(int i =0; i< a.length;i++){
			for(int j =0; j< a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int [][] a2 = new int [3][5];
		a2[0][1] = 12;
		a2[1][2] = 15;
		for(int i =0; i< a2.length;i++){
			for(int j =0; j< a2[i].length; j++){
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int [][] a3 = new int[4][];
		a3[0]= new int[5];
		a3[1]= new int [10];
		a3[2] = new int [15];
		a3[3] = new int[20];
		
		for(int i =0; i<a3.length; i++){
			for(int j =0; j<a3[i].length; j++){
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
