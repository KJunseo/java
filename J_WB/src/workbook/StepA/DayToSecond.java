package workbook.StepA;

import java.util.Scanner;

public class DayToSecond {
	private int days;
	private int seconds;
	
	public DayToSecond() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ���� �Է��ϼ���. ");
		this.days = s.nextInt();
	}
	void printSec() {
		System.out.println("�� ���� �ش�Ǵ� �ð��� ��� "+getSec()+" ���Դϴ�.");
	}
	int getSec() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
}
