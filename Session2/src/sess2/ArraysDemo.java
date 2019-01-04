package sess2;

public class ArraysDemo {

	public static void main(String[] args) {
		//Arrays(Multi Value Container) which stores lot of values on one single box and gives indexes to values{0,1,2,3,4}
		//Homogenous in Nature(we cannot have different type of data
		int a1 = 100;
		int [] a2 = {10,20, 30,40,50};
		String[] s1 ={"srini", "vasu", "Swathi"};
		System.out.println("a1 is : "+a1); //a1 is variable
		System.out.println("a2 is: "+ a2);//a2 Reference variable
		System.out.println("s1 is : "+ s1);
		System.out.println("Lenght of Array is: " + a2.length);
		for(int i =0; i< a2.length; i++){
			System.out.print(a2[i]+ " ");
		}
		System.out.println();
		
		//Enhanced For Loop(Automatic Loop)
		for(int elm : a2){
			System.out.print(elm +" ");
		}
	}

}
