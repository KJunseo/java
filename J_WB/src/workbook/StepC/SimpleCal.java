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
		System.out.printf("숫자 1을 입력하세요. ");
		this.num1 = s.nextInt();
		System.out.printf("숫자 2를 입력하세요. ");
		this.num2 = s.nextInt();
		System.out.printf("연산 기호 문자('+', '-', '*', '/' 중 1개)를 입력하세요. ");
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
		System.out.println("계산식의 결과 값은 " + getResult() + "입니다.");
	}
}
