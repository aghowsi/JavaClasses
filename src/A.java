
public class A {
 public static void main(String[] args) {
	
	 int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}};
		
	 int largestNum= a[0][0];
        for (int j = 0; j <a.length; j++) {
            for (int i = 0; i <a[j].length; i++) {
                if (a[j][i] > largestNum) {
                    largestNum = a[j][i];
                }
            }
        }
        System.out.println(largestNum);
}
}
