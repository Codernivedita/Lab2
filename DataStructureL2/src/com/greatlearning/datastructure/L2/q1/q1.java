package com.greatlearning.datastructure.L2.q1;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		size=sc.nextInt();
        int[] array= new  int[size];
        System.out.println("enter the values of array");
        for(int i=0; i<size; i++)  
        {  
        //reading array elements from the user   
        array[i]=sc.nextInt();  
        }  
        System.out.println("enter the total no of targets that needs to be achieved ");
        int numTarget=sc.nextInt();
        int target;
        for(int j=1;j<=numTarget;j++) {
        	
        int sum=0;
        System.out.println("enter the value of target");
        target=sc.nextInt();
        for(int k=0;k<size;k++) {
        	sum=sum+array[k];
        	if(sum>=target) {
        		System.out.printf("Target Achieved after %d transactions \n ",k+1);
        		break;
        	}
        	
        }
        if(sum<target) {
        	System.out.println("Given target is not achieved");
        }
        
        }
        
	}

}
