
public class jf {
	public static void main(String[] args) {
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1,5}
			};
	 //should be true

	 boolean b = false;
			
			for (int i = 0; i < a.length; i++) {
				if (a.length == a[i].length){
					b = true;
				}
				break;
			}
			System.out.println(b);
	}

}
