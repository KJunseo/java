package workbook.StepF;

import java.util.Scanner;

public class SumAndAvg {
	private int [][] jumsu = new int[5][3];
	private int [] sum = new int[3];
	private double [] average = new double[3];
	private int kor;
	private int eng;
	private int mat;
	
	public SumAndAvg() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf((i+1) + "번 학생 국어, 영어, 수학 점수를 입력하시오. ");
			for(int j=0;j<3;j++) {
				this.jumsu[i][j]= s.nextInt();
			}
		}
	}
	void getSum() {
		for(int i=0;i<jumsu.length;i++) {
			for(int j=0;j<3;j++) {
				sum[j] = sum[j] + jumsu[i][j];
			}
		}
		kor = sum[0];
		eng = sum[1];
		mat = sum[2];
	}
	double getAvg(int i) {
			average[i] = (double)sum[i]/jumsu.length;
			return this.average[i];
	}
	public void printSV() {
		getSum();
		System.out.printf("국어의 총점은 %d 이고, 평균은 %.1f 입니다.\n",kor,getAvg(0));
		System.out.printf("영어의 총점은 %d 이고, 평균은 %.1f 입니다.\n",eng,getAvg(1));
		System.out.printf("수학의 총점은 %d 이고, 평균은 %.1f 입니다.\n",mat,getAvg(2));
	}
}
