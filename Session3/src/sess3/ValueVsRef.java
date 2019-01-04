package sess3;

public class ValueVsRef {

	void sqrtOfNum(int n){
		n++;
		int sq = n*n;
		System.out.println("sqroot of number is: "+ sq);
	}
	
	void sqrtOfNumners(int [] arr){
		System.out.println("Arr is: "+ arr);
		for(int i =0; i< arr.length; i ++){
			arr[i] = arr[i]* arr[i];
			System.out.println("sqrt of numbers is : " +arr[i]);
		}
	}
	public static void main(String[] args) {
		
		ValueVsRef v = new ValueVsRef();
		int a = 10;
		v.sqrtOfNum(a);
	System.out.println("sqroot of a is :" + a);
	
	System.out.println("*****************");
	int [] a1 = {10,20,30, 40, 50};
	System.out.println("a1 is: "+ a1);
	v.sqrtOfNumners(a1);
	
	for(int elm : a1){
		System.out.print(elm+ " ");
	}
	
	System.out.println();
	}
}
