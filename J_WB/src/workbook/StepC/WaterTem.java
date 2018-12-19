package workbook.StepC;

import java.util.Scanner;

public class WaterTem {
	private double input_degree;
	
	public WaterTem() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("물의 온도를 입력하세요. ");
		this.input_degree = s.nextDouble();
	}

	public void printWT() {
		if(input_degree<0) {
			System.out.println("잘못 입력 하셨습니다.");
		}
		else if(input_degree>=0 && input_degree<25) {
			System.out.println("냉수입니다.");
		}
		else if(input_degree>=25 && input_degree<40) {
			System.out.println("미온수입니다.");
		}
		else if(input_degree>=40 && input_degree<80) {
			System.out.println("온수입니다.");
		}
		else {
			System.out.println("끓는 물 입니다.");
		}
	}
}
