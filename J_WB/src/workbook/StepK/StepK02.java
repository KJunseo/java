package workbook.StepK;

import java.util.Scanner;

public class StepK02 {
	static int NUMBEROFMENU;
	
	public StepK02() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����Ͻ� �޴��� ������ �Է��ϼ���: ");
		NUMBEROFMENU = s.nextInt();
		MenuPan mp = new MenuPan(NUMBEROFMENU);
		mp.input(NUMBEROFMENU);
		mp.show(NUMBEROFMENU);
	}
}
