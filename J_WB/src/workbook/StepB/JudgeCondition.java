package workbook.StepB;

import java.util.Scanner;

public class JudgeCondition {
	private int num1;
	private int num2;
	private int num3;
	
	public JudgeCondition() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("ù ��° ���ڸ� �Է��ϼ���. ");
		this.num1 = s.nextInt();
		System.out.printf("�� ��° ���ڸ� �Է��ϼ���. ");
		this.num2 = s.nextInt();
		System.out.printf("�� ��° ���ڸ� �Է��ϼ���. ");
		this.num3 = s.nextInt();
	}
	public void printCondition() {
		if(num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����.");
		}
		if((num1>50&&num2>50) || (num2>50&&num3>50) || (num1>50&&num3>50)) {
			System.out.println("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50���� ũ��.");
		}
		if((num1+num2 == num3)||(num2 + num3 == num1)||(num1+num3 == num2)) {
			System.out.println("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����.");
		}
		if((num2%num1 == 0 && num3%num1 ==0)||(num3%num2 == 0 && num1%num2 ==0)||(num1%num3 == 0 && num2%num3 ==0)) {
			System.out.println("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ������ �������� ��찡 �ִ�.");
		}
	}
}
