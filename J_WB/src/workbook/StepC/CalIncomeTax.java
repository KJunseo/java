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
		System.out.printf("����(�� ����)�� ���ڷ� �Է��ϼ���. ");
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
		System.out.println("���� �ݾ׿� ���� �ҵ漼�� " + getTax() + "�� �Դϴ�.");	
	}
}
