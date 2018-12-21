package workbook.StepE;

import java.util.Scanner;

public class IsoTriangle {
	private int height;
	
	public IsoTriangle() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("이등변 삼각형의 높이를 입력하시오. ");
		this.height = s.nextInt();
	}
	public void printResult() {
		for(int i=0;i<height;i++) {
			for(int j=height-i;j>0;j--) {
				System.out.printf(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.printf("*");
			}
			for(int j=height-i;j>0;j--) {
				System.out.printf(" ");
			}
			System.out.println();
		}
	}
}
