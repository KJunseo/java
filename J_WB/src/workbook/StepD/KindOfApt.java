package workbook.StepD;

import java.util.Scanner;

public class KindOfApt {
	private double m2_area;
	private double pyung_area;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int i;
	
	public KindOfApt() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.printf("아파트 분양 면적(제곱미터)을 입력하시오. ");
			this.m2_area = s.nextDouble();
			if(getPyung()<15) {
				count1++;
			}
			else if(getPyung()>=15&&getPyung()<30) {
				count2++;
			}
			else if(getPyung()>=30&&getPyung()<50) {
				count3++;
			}
			else {
				count4++;
			}
			System.out.printf("--> 이 아파트의 평형은 %.1f 입니다. \n", getPyung());
		}
	}
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	public void printApt() {
		System.out.println("\"소형 아파트\"의 개수는 " + count1 + "입니다.");
		System.out.println("\"중소형 아파트\"의 개수는 " + count2 + "입니다.");
		System.out.println("\"중형 아파트\"의 개수는 " + count3 + "입니다.");
		System.out.println("\"대형 아파트\"의 개수는 " + count4 + "입니다.");
	}
}
