package workbook.StepA;

import java.util.Scanner;

public class M2ToP {
	private double m2_area;
	private double pyung_area;
	
	public M2ToP() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 문양 면적을 입력하시오. ");
		this.m2_area = s.nextDouble();
	}
	void printP() {
		System.out.printf("아파트의 평형은 %.1f입니다.\n",getP());
	}
	double getP() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
}
