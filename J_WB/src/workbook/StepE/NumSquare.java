package workbook.StepE;

import java.util.Scanner;

public class NumSquare {
	private int length;
	
	public NumSquare() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("정사각형의 크기를 입력하시오. ");
		this.length = s.nextInt();
	}
	public void printResult() {
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
	}
}
