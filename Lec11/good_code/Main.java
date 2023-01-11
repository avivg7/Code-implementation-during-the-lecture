package t_cache_friendly;

import java.util.Random;

public class Main {


	public static int[][] generateMatrix(int n, boolean isEmpty) {
		  Random r=new Random();
		  int[][] mat=new int[n][n];
		  for(int i=0;i<n;i++) {
		      for(int j=0;j<n;j++){
		         mat[i][j]= isEmpty ? 0 : r.nextInt(9);
		      }
		  }
		  return mat;
	}
	
	public static void main(String[] args) {
		
		int n = 1024;
		int[][] a = generateMatrix(n, false);
		int[][] b = generateMatrix(n, false);
		int[][] c = generateMatrix(n, true);;
		int r;
		
		long time = System.currentTimeMillis();
		
		
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length; k++) {
				r = b[k][j];
				for (int i = 0; i < a.length; i++) {
					c[k][i] += a[j][i] * r;
				}
			}
		}

		long duration = (System.currentTimeMillis() - time);
		System.out.println("Running time is: " + duration + "Milisec");
		
	}

}
