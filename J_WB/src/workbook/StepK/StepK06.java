package workbook.StepK;

import java.util.Scanner;

public class StepK06 {
	static int NUMBEROFUSER;
	
	public StepK06() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����� �л��� �����? ");
		NUMBEROFUSER = s.nextInt();
		System.out.println();
		UserInfo ui = new UserInfo(NUMBEROFUSER);
		ui.input(NUMBEROFUSER);
		ui.print(NUMBEROFUSER);
	}
}
