package workbook.StepD;

import java.util.Scanner;

public class MaxMin {
	private int number;
	private int max_num;
	private int min_num;
	
	public MaxMin() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		max_num=0;
		min_num=100;
		while(true) {
		System.out.printf("0���� 100������ ���ڸ� �Է��ϼ���. ");
		this.number = s.nextInt();
		if(number<0||number>100) {
			break;
		}
		getMax();
		getMin();
		}
	}
	int getMax() {
		if(number>=0&&number<=100) {
			if(number>max_num) {
				max_num = number;
			}
		}
		return this.max_num;
	}
	int getMin() {
		if(number>=0&&number<=100) {
			if(number<min_num) {
				min_num = number;
			}
		}
		return this.min_num;
	}
	public void printResult() {
		System.out.println("�Էµ� ���ڵ� �� ���� ū ���� " + getMax() + "�̰�, ���� ���� ���� " + getMin() + "�Դϴ�.");
	}
}
