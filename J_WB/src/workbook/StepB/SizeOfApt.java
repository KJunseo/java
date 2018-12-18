package workbook.StepB;

import java.util.Scanner;

public class SizeOfApt {
	private double m2_area;
	private double pyung_area;
	
	public SizeOfApt() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 문양 면적(제곱미터)를 입력하시오. ");
		this.m2_area = s.nextDouble();
	}
	public void printSize() {
		System.out.printf("아파트의 평형은 %.1f 이고, \n", getPyung());
		if(getPyung() < 30) {
			System.out.println("30평 미만이므로 작은 아파트 입니다.");
		}
		else
			System.out.println("30평 이상이므로 큰 아파트 입니다.");
	}
	double getPyung() {
		pyung_area = m2_area/3.305;
		return this.pyung_area;
	}
}
