
public class ArrayMatrixSum{
	
	public static void main(String[] args) {
    int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
    int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
    int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
    int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

   printSum(first, second);
   
   


}
	public static void printSum(int[][] x,int [][]y){
		int sum=0;
		
		for(int i = 0; i < x.length; i++) {
			for(int a = 0; a < y.length; a++) {
				System.out.println(a+i);
				
			}
		}
	}
}
