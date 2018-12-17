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
		System.out.printf("날 수를 입력하세요. ");
		this.days = s.nextInt();
	}
	void printSec() {
		System.out.println("날 수에 해당되는 시간은 모두 "+getSec()+" 초입니다.");
	}
	int getSec() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
}
