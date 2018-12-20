package workbook.StepD;

import java.util.Scanner;

public class CountRect {
	private int width;
	private int height;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	
	public CountRect() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("직사각형의 가로 크기와 세로 크기를 입력하시오. ");
			this.width = s.nextInt();
			this.height = s.nextInt();
			if(width<=0 || height<=0) {
				break;
			}
			if(width==height) {
				count1++;
			}
			else if(width>=2*height) {
				count2++;
			}
			else if(height>=2*width) {
				count3++;
			}
			else if(width>height) {
				count4++;
			}
			else {
				count5++;
			}
		}
	}
	public void printNum() {
		System.out.println("\"정사각형\"의 개수는 " + count1 + " 입니다.");
		System.out.println("\"좌우로 길쭉한 직사각형\"의 개수는 " + count2 + " 입니다.");
		System.out.println("\"위아래로 길쭉한 직사각형\"의 개수는 " + count3 + " 입니다.");
		System.out.println("\"일반적인 가로형 직사각형\"의 개수는 " + count4 + " 입니다.");
		System.out.println("\"일반적인 세로형 직사각형\"의 개수는 " + count5 + " 입니다.");
	}
}
