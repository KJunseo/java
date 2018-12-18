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
		System.out.printf("국어 점수를 입력하세요. ");
		this.kor = s.nextInt();
		System.out.printf("영어 점수를 입력하세요. ");
		this.eng = s.nextInt();
		System.out.printf("수학 점수를 입력하세요. ");
		this.math = s.nextInt();
	}
	public void printScore() {
		System.out.println("입력하신 점수의 총점은 " + getSum() + " 이고,");
		System.out.printf("평균은 %.1f 입니다.\n", getAvg());
		if(kor >= 90) {
			System.out.println("국어 점수가 우수합니다.");
		}
		if(eng >= 90) {
			System.out.println("영어 점수가 우수합니다.");
		}
		if(math >= 90) {
			System.out.println("수학 점수가 우수합니다.");
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
