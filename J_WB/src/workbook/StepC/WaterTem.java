package workbook.StepC;

import java.util.Scanner;

public class WaterTem {
	private double input_degree;
	
	public WaterTem() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �µ��� �Է��ϼ���. ");
		this.input_degree = s.nextDouble();
	}

	public void printWT() {
		if(input_degree<0) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		else if(input_degree>=0 && input_degree<25) {
			System.out.println("�ü��Դϴ�.");
		}
		else if(input_degree>=25 && input_degree<40) {
			System.out.println("�̿¼��Դϴ�.");
		}
		else if(input_degree>=40 && input_degree<80) {
			System.out.println("�¼��Դϴ�.");
		}
		else {
			System.out.println("���� �� �Դϴ�.");
		}
	}
}
