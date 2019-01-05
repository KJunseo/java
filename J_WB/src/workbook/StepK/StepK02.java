package workbook.StepK;

import java.util.Scanner;

public class StepK02 {
	static int NUMBEROFMENU;
	
	public StepK02() {
		Scanner s = new Scanner(System.in);
		System.out.printf("등록하실 메뉴의 개수를 입력하세요: ");
		NUMBEROFMENU = s.nextInt();
		MenuPan mp = new MenuPan(NUMBEROFMENU);
		mp.input(NUMBEROFMENU);
		mp.show(NUMBEROFMENU);
	}
}
