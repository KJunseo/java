package workbook.StepH;

import java.util.Scanner;

public class PrintSplit {
	private String input;
	
	public PrintSplit() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("============================");
		System.out.printf("=> ���ڿ��� �Է��ϼ��� (x: ����): ");
		this.input = s.next();
	}
	public void printSplit() {
		while(!input.equalsIgnoreCase("x")) {
			String list[] = input.split("");
			System.out.printf("=> �� ������ ������ %d�� �Դϴ�.\n", list.length);
			for(int i=0;i<list.length;i++) 
				System.out.println("=> " + list[i]);
			System.out.println();
			input();
		}
		System.out.println("* ����Ǿ����ϴ�.");

	}
}
