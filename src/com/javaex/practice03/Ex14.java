package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		

		Scanner sc = new Scanner(System.in);
		
		int i;
		int sum=0;

	System.out.print("숫자를 입력하세요: ");
	
	int num = sc.nextInt();
		
	for(i=1; i<=num;i++) {
		
		sum = sum+i;
		System.out.print(i);
		if(i<num) {
		System.out.print("+");
				  }
		else {
			System.out.println();
			 }
	} System.out.println("합계: "+sum);
	
	
	
	
		
		
	sc.close();
		
		
		
		
		
	}

}
