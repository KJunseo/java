package workbook.StepD;

import java.util.Scanner;

public class AddOneTo {
	private int number;
	private int totalsum;
	private int i;
	
	public AddOneTo() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요. ");
		this.number = s.nextInt();
	}
	public void printSum() {
		if(number<=1) {
			System.out.println("잘못 입력하였습니다.");
		}
		else {
			for(i=0;i<number+1;i++) {
				totalsum = totalsum+i;
			}
			System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 " + totalsum + " 입니다.");
		}
	}
}
