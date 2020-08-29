/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Equilibrium index of an array

// Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
// Output: 3
// 3 is an equilibrium index, because:
// A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

//  Time complexity of O(n^2);
// time complexity of O(n)

/* Name of the class has to be "Main" only if the class is public. */
class EquaIndex
{
    public static int getEqlibriumIndex(int arr[]){
        
        int n = arr.length;
        int left = 0,right =0;
        for(int i=1;i<n;i++){
            left = 0;
            right = 0;
            for(int j=0;j<i;j++){
                left += arr[j];
            }
            
            for(int k=i+1;k<n;k++){
                right += arr[k];
            }
            
            if(left == right){
                return i;
            }
                
        }   
        
        return -1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] arr = new int[]{-7, 1, 5, 2, -4, 3, 0};
	    
	    System.out.println(getEqlibriumIndex(arr));
	}
}
