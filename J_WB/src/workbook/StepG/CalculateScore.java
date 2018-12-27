package workbook.StepG;

import java.util.Scanner;

public class CalculateScore {
	private int jumsu[][] = new int[5][3];
	private int sum;
	private double average;
	
	public CalculateScore() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수는? ",i+1);
			for(int j=0;j<3;j++) {
				this.jumsu[i][j] = s.nextInt();
			}	
		}
	}
	int getSum1(int i) {
		for(int j=0;j<jumsu.length;j++)
			sum = sum + jumsu[j][i];		
		return this.sum;
		}
	double getAvg1(int i) {
		for(int j=0;j<jumsu.length;j++)
			average = sum/5.0;
		return this.average;
	}
	int getSum2(int i) {
		for(int j=0;j<3;j++)
			sum = sum + jumsu[i][j];
		return this.sum;
	}
	double getAvg2(int i) {
		for(int j=0;j<3;j++) {
			average = (double)sum/3.0;
		}
		return this.average;
	}
	public void printScore() {
		int k=0;
		String class_name[] = {"국어", "영어", "수학"};
		String grade[]= {"A","B","C","D","F"};
		System.out.println();
		System.out.println("1) 각 과목별 총점과 평균 점수");
		for(int i=0;i<3;i++) {
			System.out.printf(class_name[i] + "과목 총점은 %d 평균은 %.1f 입니다.\n", getSum1(i),getAvg1(i));	
			sum=0;
			average=0;
		}
		System.out.println();
		System.out.println("2) 각 학생별 총점과 평균 점수");
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf("%d번 학생 점수: 총점 %d, 평균 %.1f, 등급 " ,i+1, getSum2(i),getAvg2(i));
			if(getAvg2(i)>=90)System.out.printf(grade[0]);
			else if(getAvg2(i)>=80&&getAvg2(i)<90)System.out.printf(grade[1]);
			else if(getAvg2(i)>=70&&getAvg2(i)<80)System.out.printf(grade[2]);
			else if(getAvg2(i)>=60&&getAvg2(i)<70)System.out.printf(grade[3]);
			else System.out.printf(grade[4]);
			System.out.println();
			sum=0;
			average=0;
		}
	}
}
