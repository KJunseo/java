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
		System.out.printf("�� ���� �Է��ϼ���. ");
		this.days = s.nextInt();
	}
	public void printSecond() {
		System.out.println("�� ���� �ش�Ǵ� �Ⱓ�� ��� " + getSecond() + " ���Դϴ�.");
		if(m_count>0) {
			System.out.println("100�� �ʰ� ��� " + m_count + "�� �̳� ���Ե˴ϴ�.");
		}
		
	}

	int getSecond() {
		seconds = days * 24 * 60 * 60;
		m_count = seconds / 1000000;	
		return this.seconds;
	}
}
