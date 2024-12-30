package com.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		StudentData sd=new StudentData();
		
		boolean choice=true;
		
		while(choice) {
			
			System.out.println("Select an option \n 1.Insert \n 2.update \n 3.Delete \n 4.Fetch \n 5.Exit");
			
			int key=sc.nextInt();
			
			switch(key) {
			
			case 1: {
				
				StudentDTO s=new StudentDTO();
				
				System.out.println("Enter sno :- ");
				
				s.setSno(sc.nextInt());
				
				System.out.println("Enter sname :-");
				
				s.setSname(sc.next());
				
				System.out.println("Enter sage :-");
				
				s.setSage(sc.nextInt());
				
				sd.insertstudent(s);
				
			} break;
			
			case 2: {
				
				StudentDTO s1=new StudentDTO();
				
				System.out.println("Enter sno :-");
				
				s1.setSno(sc.nextInt());
				
				System.out.println("Enter sanme :-");
				
				s1.setSname(sc.next());
				
				System.out.println("Enter sage :-");
				
				s1.setSage(sc.nextInt());
				
				sd.updateStudent(s1);
				
			} break;
			
			case 3: {
				
				StudentDTO s2=new StudentDTO();
				
				System.out.println("Enter sno :-");
				
				s2.setSno(sc.nextInt());
				
//				System.out.println("Enter sname :-");
//				
//				s2.setSname(sc.next());
//				
//				System.out.println("Enter sage :-");
//				
//				s2.setSage(sc.nextInt());
//				
				sd.deleteStudent(s2);
				
			} break;
			
			case 4: {
				
				StudentDTO s3=new StudentDTO();
				
				System.out.println("Enter sno :-");

				s3.setSno(sc.nextInt());
//				
//				System.out.println("Enter sname :-");
//				
//				s3.setSname(sc.next());
//				
//				System.out.println("Enter sage :-");
//					
//				s3.setSage(sc.nextInt());
				
				sd.selectStudent(s3);
				
		 }  break;
		 
		 case 5: {
			 
			 choice=false;
			 
			 System.out.println("Completed");
		 
		     break;
		     
		    }
	     }  
      }
   }
}