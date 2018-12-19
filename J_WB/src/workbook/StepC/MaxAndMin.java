package workbook.StepC;

import java.util.Scanner;

public class MaxAndMin {
	private int num1;
	private int num2;
	private int num3;
	private int max_num;
	private int min_num;
	
	public MaxAndMin() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("첫 번째 숫자를 입력하세요. ");
		this.num1 = s.nextInt();
		System.out.printf("두 번째 숫자를 입력하세요. ");
		this.num2 = s.nextInt();
		System.out.printf("세 번째 숫자를 입력하세요. ");
		this.num3 = s.nextInt();
	}
	int getMax() {
		if(num1>num2) {
			if(num1>num3) {
				max_num = num1;
			}
			else {
				max_num = num3;
			}
		}
		else {
			if(num2>num3) {
				max_num = num2;
			}
			else {
				max_num = num3;
			}
		}
		return this.max_num;
	}
	int getMin() {
		if(num1>num2) {
			if(num2>num3) {
				min_num = num3;
			}
			else {
				min_num = num2;
			}
		}
		else {
			if(num1>num3) {
				min_num = num3;
			}
			else {
				min_num = num1;
			}
		}
		return this.min_num;
	}
	public void printMAM() {
		System.out.printf("가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다. \n",getMax(),getMin());
	}
}
