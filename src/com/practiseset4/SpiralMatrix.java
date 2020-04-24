package com.practiseset4;
//work only for n*n size matrix
public class SpiralMatrix { //-> O(mn)

	public static void main(String args[]) {
		int[][] mat =
			{
					{1,    2 ,  3, 4 },
					{ 5  ,  6  , 7 , 8},
			        {9 ,  10  ,11, 12},
			        {13 , 14 , 15, 16 }
			};

		printSpiral(mat,3);
	}

	static void printSpiral(int[][] arr,int size) {
		int iterator,ithrow, jthcol=0;
		
	    for(iterator=size-1, ithrow=0; iterator>0;  iterator--, ithrow++) //n
	    {
	    
	    	
	        //print top row
	        for(jthcol=ithrow; jthcol<iterator; jthcol++)  //m
	        	System.out.print(arr[ithrow][jthcol]+" ");
	        
	        //print last column
	        for(jthcol=ithrow; jthcol<iterator; jthcol++) 
	        	System.out.print(arr[jthcol][iterator]+" ");
	        
	        //print last row
	        for(jthcol=iterator; jthcol>ithrow; jthcol--) 
	        	 System.out.print(arr[iterator][jthcol]+" ");
	        
	        //print first column
	        for(jthcol=iterator; jthcol>ithrow; jthcol--) 
	        	 System.out.print(arr[jthcol][ithrow]+" ");

	 
	    }
	    //if odd size matrix print the middle value
	     int middle = (size-1)/2;
	     if (size% 2 == 1)
	    	 System.out.print(arr[middle][middle]+" ");
	    	

	}

}
