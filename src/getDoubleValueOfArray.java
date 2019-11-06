
public class getDoubleValueOfArray {

	public static void main(String[] args) {
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
		
		
		
		
		for (int b = 0; b < a.length; b++) {
			for (int c = 0; c < a[b].length; c++) {
				System.out.print(a[b][c] * 2+" ");
				
			}
			System.out.println();
	}

}

}