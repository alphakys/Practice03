package com.javaex.practice03;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j;
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
			for(i=1;i<=num;i++) 
				{
				 	for(j=(num+1);i<j;j--) 
				 	{
					 System.out.print("*");
				 	}System.out.println();
				 	
				}
			for(i=1;i<=(num-1);i++) 
				{
				 for(j=(i*2)+1;i<j;j--) 
				 	{
					 System.out.print("*");
				 	}
				 	System.out.println();
				
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
