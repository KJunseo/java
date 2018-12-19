package workbook.StepC;

import java.util.Scanner;

public class CalIncomeTax {
	private int income;
	private int tax;
	
	public CalIncomeTax() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("연봉(원 단위)를 숫자로 입력하세요. ");
		this.income = s.nextInt();
	}
	int getTax() {
		if(income<10000000) {
			tax = (int)(income * 0.095);
		}
		else if(income>=10000000 && income<40000000) {
			tax = (int)(income * 0.19);
		}
		else if(income>=40000000 && income<80000000) {
			tax = (int)(income * 0.28);
		}
		else {
			tax = (int)(income * 0.37);
		}
		return this.tax;
	}
	public void printTax() {
		System.out.println("연봉 금액에 대한 소득세는 " + getTax() + "원 입니다.");	
	}
}
