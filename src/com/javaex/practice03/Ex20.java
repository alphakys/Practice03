package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
		
		
		String choice;
	
		int answer = 10;
		
		
		boolean run = true;
		
		
			System.out.println("====================================");
			System.out.println("[      숫자맞추기 게임시작       ]");
			System.out.println("====================================");
		
			
			
			while(run) {
			
		
	
		
		
		
		System.out.print(">>");
	
		int num = sc.nextInt();
		
		if(num>answer)
					{
					System.out.println("더 낮게");
					
					}
		
		else if(num==answer)
					{		
					System.out.println("맞았습니다");	
					System.out.print("게임을 종료하시겠습니까?(y/n)  >>");
					
					sc.nextLine();
					 choice = sc.nextLine();	
					 	
					 	
					
					if(choice.equals("y")) 
							{
							System.out.println("====================================");
							System.out.println("[      숫자맞추기 게임종료       ]");
							System.out.println("====================================");
							run=false;
							}
					else {
							run =true; 
							System.out.println("====================================");
							System.out.println("[      숫자맞추기 게임시작       ]");
							System.out.println("====================================");
					 	 }	
					
					} 
		
		
		else 		{
					System.out.println("더 높게");
				
					}

			
		
		
			
			
			
					}		
			

		 

			
			
			sc.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	}

