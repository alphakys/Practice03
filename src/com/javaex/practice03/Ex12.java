package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc = new Scanner(System.in);
			
				int i;
				int fac=1;
		
			System.out.println("숫자를 입력하세요");
			
			int num = sc.nextInt();
			
			for(i=1; i<=num;i++) {
				
				fac=fac*i;
				
			} System.out.println("결과값은: "+fac);
				
		
			sc.close();
	}

}
