package workbook.StepA;

import java.util.Scanner;

public class TotalOfScore {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public TotalOfScore() {
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
	void printTotal() {
		System.out.println("�Է��Ͻ� ������ ������ "+getSum()+" �̰�,");
		System.out.printf("����� %.1f �Դϴ�.\n",getAvg());
	}
	int getSum() {
		total = kor + eng + math;
		return this.total;
	}
	double getAvg() {
		average = total / 3.0;
		return this.average;
	}
}
