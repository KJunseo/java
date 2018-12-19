package workbook.StepC;

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
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	public void printSize() {
		System.out.printf("아파트의 평형은 %.1f 입니다.\n",getPyung());
		if(getPyung()<15) {
			System.out.println("소형 아파트 입니다.");
		}
		else if(getPyung()>=15&&getPyung()<30) {
			System.out.println("중소형 아파트 입니다.");
		}
		else if(getPyung()>=30&&getPyung()<50) {
			System.out.println("중형 아파트 입니다.");
		}
		else {
			System.out.println("대형 아파트 입니다.");
		}
	}
}
