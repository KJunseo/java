package workbook.StepK;

import java.util.Scanner;

public class StepK07 {
	static int NUMBEROFSTUDENT;
	
	public StepK07() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����� �л��� �����? ");
		NUMBEROFSTUDENT = s.nextInt();
		Student st = new Student(NUMBEROFSTUDENT);
		st.input();
		st.print(NUMBEROFSTUDENT);
	}
}
