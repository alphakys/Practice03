package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
					
					int i;
					
					
					
					System.out.print("숫자를 입력하세요: ");
					
					int num = sc.nextInt();
					
					for(i=1;i<=num;i++) 
						{
						  for(int j=num; i<=j;j--) 
						  {
							  System.out.print("*");
						  }
						  
						  for(int k=1;k<i;k++) 
						  {
							  System.out.print(" ");
						  }
						
						System.out.println();
						
						}
					
					
		
		
		
		
		
	}

}
