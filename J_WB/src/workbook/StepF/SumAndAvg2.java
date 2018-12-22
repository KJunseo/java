package workbook.StepF;

import java.util.Scanner;

public class SumAndAvg2 {
	private int [][] jumsu = new int[5][3];
	private int [] sum = new int [5];
	
	public SumAndAvg2() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf((i+1) + "번 학생 국어, 영어, 수학 점수를 입력하시오. ");
			for(int j=0;j<3;j++) {
				this.jumsu[i][j]=s.nextInt();
			}
		}

	}
	int getSum(int i) {
		for(int j=0;j<3;j++) {
			sum[i]=sum[i]+jumsu[i][j];
		}
		return this.sum[i];
	}
	double getAvg(int i) {
		double [] average = new double [5];
		average[i] = (double)sum[i]/3;
		return average[i];
	}
	public void printSV() {
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf((i+1) + "번 학생의 총점은 %d 이고, 평균은 %.1f 입니다.\n",getSum(i),getAvg(i));
		}
	}
}
