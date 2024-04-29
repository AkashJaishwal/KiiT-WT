public class SumDiagonal {

	static void printDiagonalSums(int [][]mat,int n)
	{
		int left = 0, right = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
	
				if (i == j)
					left += mat[i][j];
				
				if ((i + j) == (n - 1))
                    right += mat[i][j];
			}
		}
	
		System.out.println("Left Diagonal:"+ left);
									
		System.out.println("Right Diagonal:"+ right);
	}

	static public void main (String[] args)
	{
		
		int [][]a = { { 1, 2 },{ 5, 6 } };
					
		printDiagonalSums(a, 2);
	}
}