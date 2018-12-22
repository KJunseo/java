package workbook.StepE;

import java.util.Scanner;

public class TwoDimenNum {
	private int rows;
	private int columns;
	
	public TwoDimenNum() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("출력하려는 행의 크기와 열의 크기를 입력하시오. ");
		this.rows = s.nextInt();
		this.columns = s.nextInt();
	}
	public void printTable() {
		for(int i=1;i<rows+1;i++) {
			for(int j=1;j<columns+1;j++) {
				int number=i*j;
				System.out.printf("%4d",number);
				if(j%columns==0) {
					System.out.println();
				}
			}
		}
	}
}
