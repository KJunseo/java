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
			System.out.printf("0부터 100사이의 숫자를 입력하세요. ");
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
		System.out.printf("입력한 %d 개의 숫자들의 총 합계는  %d 이고, 평균 값은  %.1f 입니다.\n",count,getSum(),getAvg());
	}
}
