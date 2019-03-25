
public class AdditionMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]first = { { 1, 2, 0 }, { 2, 3, 4 } };
		int [][]second = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };
		printSum(first, second);
		System.out.println();
		printSum(third, fourth);
	}

	public static void printSum(int[][] x, int[][] y) {
		int c[][] = new int[x.length][x[0].length];
		int row = x.length;
		int column = x[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c[i][j] = x[i][j] + y[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
