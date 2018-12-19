package workbook.StepC;

import java.util.Scanner;

public class JudgeRect {
	private int width;
	private int height;

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
	public void printRect() {
		if(width == height) {
			System.out.println("정사각형입니다.");
		}
		else if(width >= 2*height) {
			System.out.println("좌우로 길쭉한 직사각형 입니다.");
		}
		else if(width*2 <= height) {
			System.out.println("위아래로 길쭉한 직사각형 입니다.");
		}
		else if(width > height) {
			System.out.println("일반적인 가로형 직사각형 입니다.");
		}
		else {
			System.out.println("일반적인 세로형 직사각형 입니다.");
		}
			
	}
}
