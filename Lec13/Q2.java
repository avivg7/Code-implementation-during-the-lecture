package test;

public class Q2 {
	
	/**
	 * This the the original (before optimization)
	 */
	
//	    static double avg(double[] x){
//		double sum=0;
//		for(int i=0;i<x.length;i++)
//			sum+=x[i];
//		return sum/x.length;
//	}
//	
//	static double[] averageCols(double[][] data){
//		
//		double avg[]=new double[data[0].length];
//		for(int col=0;col<data[0].length;col++){
//			double column[]=new double[data.length];
//			for(int row=0;row<data.length;row++){
//				column[row]=data[row][col];
//			}
//			avg[col]=avg(column);
//		}
//		return avg;
//	}

	
	/**
	 * 
	 * Solution 
	 */

	
	static double[] averageCols(double[][] data){
		
		int rowLen = data.length;
		int colLen = data[0].length;
		
		double avg[]=new double[colLen];
		
		for(int row=0;row<rowLen;row++){
						
			for(int col=0;col<colLen;col++){
				avg[col] += data[row][col];
			}
		}
		
		int i = 0;
		int limit = colLen - 1;
		
		for (; i < limit; i+=2) {
			avg[i] /= rowLen;
			avg[i+1] /= rowLen;
		}
		
		for(; i<colLen; i++) {
			avg[i] /= rowLen;
		}
		
		return avg;
	}
	
}
