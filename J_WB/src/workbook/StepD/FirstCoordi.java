package workbook.StepD;

import java.util.Scanner;

public class FirstCoordi {
	private int a;
	private int b;
	private int x_begin;
	private int x_end;
	private int x;
	private int y;
	
	public FirstCoordi() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("1차 함수 y=ax+b의 계수 a와 b를 입력하시오. ");
		this.a = s.nextInt();
		this.b = s.nextInt();
		System.out.printf("x좌표의 시작 값과 끝 값을 입력하시오. ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	public void printCoordi() {
		for(x=x_begin;x<x_end+1;x++) {
			System.out.printf("좌표 (%d, %d)\n",x, a*x + b);
		}
	}
}
