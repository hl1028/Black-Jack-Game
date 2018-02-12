
public class text {
	public static void main(String[] args) {
		/*int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		for (int i = 1; i < 5; i++) { a[i] = a[9 - i]; }
		for (int i : a) {
		System.out.print(i + " ");
		}*/
		/*Fill elements alternately with 0s and 1s in a checkerboard pattern.*/
		int rows = 10;
		int columns =10;
		int[][] values = new int[rows][columns];
		
		/*Fill only the elements in the top and bottom rows with zeroes.*/
		  for (int j=0; j<columns; j++){
		    values[0][j]=0;
		  }
		  for (int j=0; j<columns; j++){
		    values[rows-1][j]=0;
		  }
		
		for (int i=0; i<rows; i++){
			  for (int j=0; j<columns; j++){
			    System.out.print(values[i][j] + " ");
			  }
			  System.out.println();
			}
	}
}
