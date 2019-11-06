
public class ccddcd {
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			int sumColumn=1;
			int sumColumnTotal=0;
			for(int i=0; i<a.length; i++){
	  sumColumnTotal+=a[i][sumColumn];
	  
	         }
			System.out.println(sumColumnTotal);
	 }
	}
