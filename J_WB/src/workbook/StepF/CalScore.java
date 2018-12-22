package workbook.StepF;

import java.util.Scanner;

public class CalScore {
	private double [] score = new double[10];
	
	public CalScore() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d�� �ɻ������� �Է��Ͻÿ�. ",i+1);
			this.score[i] = s.nextDouble();
		}
	}
	double getAvg(double [] score) {
		double total = 0;
		double average = 0;
		double maxscore = score[0];
		double minscore = score[0];
		for(int i=0;i<score.length;i++) {
			if(maxscore<score[i]) {
				maxscore = score[i];
			}
			if(minscore>score[i]) {
				minscore = score[i];
			}
			total = total + score[i];
		}
		total = total - maxscore - minscore;
		average = total/8;
		return average;
	}
	public void printAvg() {
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.\n",getAvg(score));
	}
}
