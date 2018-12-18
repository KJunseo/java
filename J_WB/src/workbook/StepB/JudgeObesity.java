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
		System.out.printf("����(cm����)�� �Է��ϼ���. ");
		this.height = s.nextInt();
		System.out.printf("ü��(kg����)�� �Է��ϼ���. ");
		this.weight = s.nextInt();
	}
	public void printObesity() {
		if(getBMI()>=25) {
			System.out.println("����� ���̽ʴϴ�.");
		}
		else
			System.out.println("����� ���� �ƴϱ���.");
	}
	int getBMI() {
		bmi = weight/(int)((height*0.01)*(height*0.01));
		return this.bmi;
	}
}
