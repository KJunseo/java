package workbook.StepC;

import java.util.Scanner;

public class SimpleCal {
	private int num1;
	private int num2;
	private String operator;
	private int result;
	
	public SimpleCal() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� 1�� �Է��ϼ���. ");
		this.num1 = s.nextInt();
		System.out.printf("���� 2�� �Է��ϼ���. ");
		this.num2 = s.nextInt();
		System.out.printf("���� ��ȣ ����('+', '-', '*', '/' �� 1��)�� �Է��ϼ���. ");
		this.operator = s.next();
	}
	int getResult() {
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
		return this.result;
	}
	public void printResult() {
		System.out.println("������ ��� ���� " + getResult() + "�Դϴ�.");
	}
}
