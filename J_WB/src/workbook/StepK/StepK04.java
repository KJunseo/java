package workbook.StepK;

import java.util.Scanner;

public class StepK04 {
	static int NUMBEROFCOORDINATE;
	
	public StepK04() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ���� ��ǥ�� �Է��ϰڽ��ϱ�? ");
		NUMBEROFCOORDINATE = s.nextInt();
		point mp = new point(NUMBEROFCOORDINATE);
		mp.input(NUMBEROFCOORDINATE);
		mp.show(NUMBEROFCOORDINATE);
	}
}
