package workbook.StepB;

import java.util.Scanner;

public class ChangeTem {
	private double input_degree;
	private String kind;
	private double output_degree;
	
	public ChangeTem() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�µ��� �Է��ϼ���. ");
		this.input_degree = s.nextDouble();
		System.out.printf("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ���. ");
		this.kind = s.next();
	}
	double getTC() {
		output_degree = (input_degree - 32)/1.8;
		return this.output_degree;
	}
	double getTF() {
		output_degree = input_degree * 1.8 + 32;
		return this.output_degree;
	}
	public void printTem() {
		if(kind.equalsIgnoreCase("C")) {
			System.out.println("��ȯ�� �µ��� " + getTF() + " �Դϴ�.");
		}
		else if(kind.equalsIgnoreCase("F")) {
			System.out.println("��ȯ�� �µ��� " + getTC() + " �Դϴ�.");
		}
	}
}
