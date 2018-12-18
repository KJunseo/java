package workbook.StepB;

import java.util.Scanner;

public class CalKEM {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public CalKEM() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� ������ �Է��ϼ���. ");
		this.kor = s.nextInt();
		System.out.printf("���� ������ �Է��ϼ���. ");
		this.eng = s.nextInt();
		System.out.printf("���� ������ �Է��ϼ���. ");
		this.math = s.nextInt();
	}
	public void printScore() {
		System.out.println("�Է��Ͻ� ������ ������ " + getSum() + " �̰�,");
		System.out.printf("����� %.1f �Դϴ�.\n", getAvg());
		if(kor >= 90) {
			System.out.println("���� ������ ����մϴ�.");
		}
		if(eng >= 90) {
			System.out.println("���� ������ ����մϴ�.");
		}
		if(math >= 90) {
			System.out.println("���� ������ ����մϴ�.");
		}
	}
	int getSum() {
		total = kor + eng + math;
		return this.total;
	}
	double getAvg() {
		average = total/3.0;
		return this.average;
	}
}
