package workbook.StepB;

import java.util.Scanner;

public class JudgeObesity {
	private int height;
	private int weight;
	private int bmi;
	
	public JudgeObesity() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("신장(cm단위)를 입력하세요. ");
		this.height = s.nextInt();
		System.out.printf("체중(kg단위)를 입력하세요. ");
		this.weight = s.nextInt();
	}
	public void printObesity() {
		if(getBMI()>=25) {
			System.out.println("당신은 비만이십니다.");
		}
		else
			System.out.println("당신은 비만이 아니군요.");
	}
	int getBMI() {
		bmi = weight/(int)((height*0.01)*(height*0.01));
		return this.bmi;
	}
}
