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
		System.out.printf("2�� �Լ� y=ax^2+bx+c �� ��� a��b, c�� �Է��Ͻÿ�. ");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.printf("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�. ");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
	public void printCoordi() {
		for(x=x_begin;x<x_end+1;x++) {
			System.out.printf("��ǥ (%d, %d)\n",x, a*x*x + b*x + c);
		}
	}
}
