package paymentcurrencyDenomination;

public class NoteDenomination {
	
	public static void minimumDenomination(int[] arr, int amount) {
		
		performBubblesort(arr);
		
		int size=arr.length;
		int[] count = new int[size];
		int remainingAmount=amount;
		for(int i=0;i<size;i++) {
			count[i]=remainingAmount/arr[i];
			remainingAmount=remainingAmount-(count[i]*arr[i]);
		}
		if(remainingAmount>0) {
			System.out.println("Oops! Amount can't be tendered!");		
		}
		else {
			System.out.println("Your payment approach in order to give min no: of notes will be: ");
			for(int j=0;j<size;j++) {
				if(count[j]!=0) {
					System.out.println(arr[j]+":"+count[j]);
				}
			}
		}
	}
	
	static void performBubblesort(int[]arr) {
		int size=arr.length;
		int temp=0;		
		for(int j=size-1;j>0;j--) {
		
			for(int i=0;i<size-1;i++) {
				if(arr[i]<arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
}
