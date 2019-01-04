package workbook.StepJ;

import java.util.Scanner;

public class CalculateScore {
	private double score[] = new double[10];
	
	public CalculateScore() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번 심사점수를 입력하시오. ", i+1);
			this.score[i] = s.nextDouble();
		}
	}
	double Max(double num[]) {
		double maxscore=num[0];
		for(int i=0;i<num.length;i++) {
			if(maxscore<num[i]) {
				maxscore = num[i];
			}
		}
		return maxscore;
	}
	double Min(double num[]) {
		double minscore=num[0];
		for(int i=0;i<num.length;i++) {
			if(minscore>num[i]) {
				minscore = num[i];
			}
		}
		return minscore;
	}
	double getSum() {
		double sum=0;
		for(int i=0;i<score.length;i++) sum+=score[i];
		return sum;
	}
	double getAvg() {
		double result = getSum() - Max(score) - Min(score);
		double average = result/(score.length-2);
		return average;
	}
	public void printAvg() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n",getAvg());
	}
}
