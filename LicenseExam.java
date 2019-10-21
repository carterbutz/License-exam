
	//Objective: Grades the written portion of the driver's exam


import java.util.*;
	public class LicenseExam {
		public static void main(String[] args) {
			int matches = 0;
			char[] a = {'a', 'd', 'c', 'b', 'a', 'd', 'c', 'a'};
			char[] b = new char[a.length];
			Scanner scan = new Scanner(System.in); 
			for(int i = 0; i < b.length; i++) {
				System.out.print("Enter your answer the following question: " + (i+1) + ":");
				String answers = scan.nextLine().toLowerCase();

				if(answers.length() == 1) {
					b[i] = answers.charAt(0);
					if (b[i] == a[i]);
						matches++;
				}
			} 
			System.out.print("These are the correct answers: \n Question 1:A\n Question 2:D\n Question 3:C\n Question 4:D\n Question 5:A\n Question 6:B\n Question 7:C\n Question 8: D\n Question 9: A\n Question 10:B\n");
			System.out.printf("Congratulations, you answered %d question(s) correct!\n", matches);	
				if (matches < 7) 
					System.out.print("You have failed, you must get 7 out of 10 answer right!");
					else
						System.out.print("You passed the exam, Congratulations!");		
		}
	}