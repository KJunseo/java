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
		System.out.printf("온도를 입력하세요. ");
		this.input_degree = s.nextDouble();
		System.out.printf("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요. ");
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
			System.out.println("변환된 온도는 " + getTF() + " 입니다.");
		}
		else if(kind.equalsIgnoreCase("F")) {
			System.out.println("변환된 온도는 " + getTC() + " 입니다.");
		}
	}
}
