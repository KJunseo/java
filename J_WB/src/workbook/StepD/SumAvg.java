package workbook.StepD;

import java.util.Scanner;

public class SumAvg {
	private int number;
	private int count=0;
	private int totalsum;
	private double average;
	
	public SumAvg() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("0���� 100������ ���ڸ� �Է��ϼ���. ");
			this.number = s.nextInt();
			if(number<0||number>100) {
				break;
			}
			getSum();
			getAvg();
			count++;
		}
	}
	int getSum() {
		if(number>=0&&number<=100) { 
			totalsum = totalsum + number;
		}
		return this.totalsum;
	}
	double getAvg() {
		average = (double)totalsum/count;
		return this.average;
	}
	public void printResult() {
		System.out.printf("�Է��� %d ���� ���ڵ��� �� �հ��  %d �̰�, ��� ����  %.1f �Դϴ�.\n",count,getSum(),getAvg());
	}
}
