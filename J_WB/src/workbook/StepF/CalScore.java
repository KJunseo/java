package workbook.StepF;

import java.util.Scanner;

public class CalScore {
	private double [] score = new double[10];
	private double maxscore;
	private double minscore;
	private double total;
	private double average;
	
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
		maxscore = score[0];
		minscore = score[0];
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
		return this.average;
	}
	public void printAvg() {
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�.\n",getAvg(score));
	}
}
