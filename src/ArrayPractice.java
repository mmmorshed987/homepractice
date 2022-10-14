
public class ArrayPractice {


	public static void main(String[] args) {

		int [] beximco = {8,5,1,7,14,15} ;

		int day=0;

		int stockSell = beximco[0];
		int stockBuy  = beximco[0];

		for(int i=0;i<beximco.length;i++ ) {

			if (beximco[i]>stockSell) {
				stockSell = beximco[i];	
					
			}
			if  (beximco[i]<stockBuy) {
				stockBuy = beximco[i];	
			
		}
		}
		
		for (int j=0;j<beximco.length;j++) {
			if (beximco[j]==stockSell) {day=j+1;} 
		}
		System.out.println(day+" th day stock should be sold at price = : "+stockSell);
		
		for (int k=0;k<beximco.length;k++) {
			if (beximco[k]==stockBuy) {day=k+1;} 
		}
		
		
		
		
		System.out.println(day+" th day stock should be bought at price =: "+stockBuy);
		
		
		}
	}

