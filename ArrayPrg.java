package progone;

public class ArrayPrg {

	public static void main(String[] args) {
		int[] data = {10,20,30,40,50,60};
		
		for(int k=1;k<=3;k++) {
		int last = data[data.length-1];
		
		for(int i = data.length-1;i>=1;i--) {
			data[i] = data [i-1];
		}	
			data[0]=last;
		}

		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]+" ");
		}
		
	}

}
