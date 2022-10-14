
public class EnhancedLoop {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50,60,70,80,90,100,110};
		System.out.println("total size: "+num.length);
		
		int sum= 0; 	
		for(int x:num) {
		sum= sum+x;
		}
		System.out.println("total sum is : "+sum);

	}

}
