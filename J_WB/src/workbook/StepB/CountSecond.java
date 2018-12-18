package workbook.StepB;

import java.util.Scanner;

public class CountSecond {
	private int days;
	private int seconds;
	private int m_count;
	
	public CountSecond() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요. ");
		this.days = s.nextInt();
	}
	public void printSecond() {
		System.out.println("날 수에 해당되는 기간은 모두 " + getSecond() + " 초입니다.");
		if(m_count>0) {
			System.out.println("100만 초가 모두 " + m_count + "번 이나 포함됩니다.");
		}
		
	}

	int getSecond() {
		seconds = days * 24 * 60 * 60;
		m_count = seconds / 1000000;	
		return this.seconds;
	}
}
