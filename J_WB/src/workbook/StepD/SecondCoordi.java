package workbook.StepD;

import java.util.Scanner;

public class SecondCoordi {
	private int a;
	private int b;
	private int c;
	private int x_begin;
	private int x_end;
	private int x;
	private int y;
	
	public SecondCoordi() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("2차 함수 y=ax^2+bx+c 의 계수 a와b, c를 입력하시오. ");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.printf("x좌표의 시작 값과 끝 값을 입력하시오. ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	public void printCoordi() {
		for(x=x_begin;x<x_end+1;x++) {
			System.out.printf("좌표 (%d, %d)\n",x, a*x*x + b*x + c);
		}
	}
}
