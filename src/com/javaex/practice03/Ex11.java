package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		
		System.out.println("숫자를 입력하세요");
		int sum=0;
		int num = sc.nextInt();
		
		if(num%2==1) 
			{
				for(i=1;i<=num;i++) 
				{
					if(i%2==1) 
					{						
						sum = sum+i;
					}
					
				}	
			
			System.out.println("결과값은: "+sum);
			
			} else 
				  {
					for(i=1;i<=num;i++) 
					{
						if(i%2==0) 
						{						
							sum = sum+i;
						}
					}
				  
					System.out.println("결과값은: "+sum);
					
				  }
		
		
		sc.close();
		
		
		
	}

}
