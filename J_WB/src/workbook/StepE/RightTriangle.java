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
		System.out.printf("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�. ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
	}
	public void printResult() {
		for(int i=1;i<height+1;i++) {
			blank = height-i;
			for(int j=0;j<blank;j++) {
				System.out.printf(" ");
			}
			for(int j=0;j<height-j;j++) {
				System.out.printf(" ");
			}
			for(int j=0;j<height-blank;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
