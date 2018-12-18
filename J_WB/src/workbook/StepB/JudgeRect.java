package workbook.StepB;

import java.util.Scanner;

public class JudgeRect {
	private int width;
	private int height;
	private int area;
	
	public JudgeRect() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하시오. ");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하시오. ");
		this.height = s.nextInt();
	}
	public void printRecInfo() {
		System.out.println("직사각형의 넓이는 " + getArea() + " 이고");
		if(width == height) {
			System.out.println("정사각형입니다.");
		}
		else
			System.out.println("정사각형이 아닙니다.");
	}
	int getArea() {
		area = width * height;
		return this.area;
	}
}
