package sess1;

public class PrintOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 20;
		System.out.println("\nOdd Numbers");
		for(int i =1; i<=count; i++){
			if(i % 2 ==0){
				System.out.println(i+ "");
			}
		}
		System.out.println("\nOdd Numbers");
		for(int i =1; i<= count; i++){
			
			if( i %2 !=0){
				System.out.println(i+ "");
			}
		}
	}

}
