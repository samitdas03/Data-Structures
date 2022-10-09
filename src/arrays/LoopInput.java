package arrays;
import java.util.Scanner;


public class LoopInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float studentNumber;
		float sum = 0;
		
		
		do {
		
			System.out.print("Enter the number of students who gave the exam : ");
			studentNumber = sc.nextFloat();
			
			if (studentNumber <= 0 || studentNumber != (int)studentNumber) {
				System.out.println("Student number should be a POSITIVE INTEGER");
				System.out.println();
			}
		
		} while (studentNumber <= 0 || studentNumber != (int)studentNumber);
		
		
		
		float[] studentMarks = new float[(int)studentNumber];
		
		for (int i = 0; i < studentNumber; i++) {
			
			switch (i) {
				case 0:
					System.out.print("Marks obtained by first student : ");
					studentMarks[i] = sc.nextFloat();
					break;
					
				case 1:
					System.out.print("Marks obtained by second student : ");
					studentMarks[i] = sc.nextFloat();
					break;

				case 2:
					System.out.println("Marks obtained by third student: ");
					studentMarks[i] = sc.nextFloat();
					break;
					
				default:
					System.out.print("Marks obtained by " + (i+1) + "th student : ");
					studentMarks[i] = sc.nextFloat();
				
			}
		}
		
		for (int i = 0; i < studentNumber; i++) {
			sum += studentMarks[i];
		}
		
		float averageMarks = sum / studentNumber;
		
		System.out.println("Average marks of all the students = " + averageMarks);
		
		sc.close();

	}

}
