package workbook.StepD;

import java.util.Scanner;

public class AddOneTo {
	private int number;
	private int totalsum;
	private int i;
	
	public AddOneTo() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���ڸ� �Է��ϼ���. ");
		this.number = s.nextInt();
	}
	public void printSum() {
		if(number<=1) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		else {
			for(i=0;i<number+1;i++) {
				totalsum = totalsum+i;
			}
			System.out.println("1���� �Է��� ���ڱ����� ��� ������ ���� ���� " + totalsum + " �Դϴ�.");
		}
	}
}
