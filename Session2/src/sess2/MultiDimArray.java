package sess2;

public class MultiDimArray {

	public static void main(String[] args) 
	{
		//Array of Arrays 	2-D Array
		//a3 is having 5 of 1-D Array
		int a1 = 10;
		int [] a2 = {10,20,30,40,50};
		int [][] a3 =
			{
					{10,20},
					{10,20,30},
					{10},
					{10,20,30,40,50},
					{10,20,30,40}
			};
		System.out.println("a1 is :"+a1);
		System.out.println("a2 is :"+a2);
		System.out.println("a3 is :"+a3);
		
		System.out.println();
		
		for(int i =0; i<a3.length; i++){
			System.out.println("a3["+i+"and the lenght is "+a3[i].length);
		}
		System.out.println("a3[2][3] is:" +a3[3][3]);
		
		//Read the entire Array
		for(int i =0; i<a3.length; i++)
		{		//i: 0,1,2,3,4
			for(int j =0; j<a3[i].length; j++)
			{	//j: 2(0,1),3(0,1,2),1(0),5(0,1,2,3,4,5),4(0,1,2,3)
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
		
		int [][][] a4 ={
				{
					{10,20,30},				//0
					{10,20},				//1
					{10,20,30,40,50},		//2		0
					{10,20,30,40},			//3
					{10}					//4
					
				},
				{
					{10,20,30},				//0
					{10,20},				//1
					{10,20,30,40,50},		//2
					{10,20,30,40},			//3
					{10}					//4
				}
				
		};
		System.out.println("a4 is: "+a4+" and lenght is: "+a4.length);
		System.out.println(a4[0][1][1]); //20
		
		int [][][] a5 ={
				{
					{10,20,30},				//0
					{10,20},				//1
					{10,20,30,40,50},		//2		0
					{10,20,30,40},			//3
					{10}					//4
					
				},
				{
					{10,20,30},				//0
					{10,20},				//1
					{10,20,30,40,50},		//2		1
					{10,20,30,40},			//3
					{10}					//4
				},
				{
					{10,20,30},				//0
					{10,20},				//1
					{10,20,30,40,50},		//2		2
					{10,20,30,40},			//3
					{10}					//4
				},
				{
					{10,20,30},				//0
					{10,20},				//1
					{10,20,30,40,50},		//2		3
					{10,20,30,40},			//3
					{10}					//4
				}
				
		};
		System.out.println("a4 is: "+a4+" and lenght is: "+a4.length);
		System.out.println(a4[1][2][2]); //20
	}

}

