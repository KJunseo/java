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
			System.out.printf("%d�� �ɻ������� �Է��Ͻÿ�. ", i+1);
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
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.\n",getAvg());
	}
}
