package workbook.StepK;

import java.util.Scanner;

public class StepK04 {
	static int NUMBEROFCOORDINATE;
	
	public StepK04() {
		Scanner s = new Scanner(System.in);
		System.out.printf("몇 개의 좌표를 입력하겠습니까? ");
		NUMBEROFCOORDINATE = s.nextInt();
		point mp = new point(NUMBEROFCOORDINATE);
		mp.input(NUMBEROFCOORDINATE);
		mp.show(NUMBEROFCOORDINATE);
	}
}
