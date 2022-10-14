
public class ArrayPractice2 {

	public static void main(String[] args) {
		int a[] = {8,5,9,15,20,90};
		
		int max = a[0];
		
		for (int i=1;i<a.length;i++) {
			if(a[i]>max)
				
			{
				max  = a[i];
			}	
		}
	
	System.out.println("maximum number: "+max);
	}


	
}
