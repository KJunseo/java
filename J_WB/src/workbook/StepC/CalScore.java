package workbook.StepC;

import java.util.Scanner;

public class CalScore {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public CalScore() {
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
		if(getAvg() >= 90) {
			System.out.println("�� �Դϴ�.");
		}
		else if(getAvg()< 90 && getAvg()>=80) {
			System.out.println("�� �Դϴ�");
		}
		else if(getAvg()< 80 && getAvg()>=70) {
			System.out.println("�� �Դϴ�");
		}
		else if(getAvg()< 70 && getAvg()>=60) {
			System.out.println("�� �Դϴ�");
		}
		else {
			System.out.println("�� �Դϴ�");
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
