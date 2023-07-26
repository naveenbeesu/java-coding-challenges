package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class MinOccurrence {

	 public static void main(String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    
	    int[][] matrix = { {4, 4, 3, 1, 2}};
	    
	    
	    int R =  matrix.length;
        int C = matrix[0].length;
        int maximum = 0;
        int M = 3;
        
        List<Integer> al = new ArrayList<Integer>();
	    for (int i = 0; i < R; i++){
	        int first = matrix[i][0];
	        for(int k=1;k<=first;k++) {
	        	al.add(matrix[i][k]);
	        }  
	      }
	   List<Integer> bl = al.stream().sorted().collect(Collectors.toList());
	    
	   for (int i = bl.size(); i > 0; i++){
		   
	   }
	   }
	   while(M>0) {
	    	maximum = maximum + bl.get(M-1);
	    	M--;
	    }
	    System.out.println(maximum);
	 }
}



