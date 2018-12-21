package workbook.StepE;

import java.util.Scanner;

public class RightTriangle {
	private int height;
	private int blank;
	
	public RightTriangle() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오. ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
	}
	public void printResult() {
		for(int i=0;i<height;i++) {
			blank = height-i;
			for(int j=blank;j>0;j--) {
				System.out.printf(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
