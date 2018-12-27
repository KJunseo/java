package workbook.StepG;

import java.util.Scanner;

public class PCFee {
	private int hour;
	private int minute;
	private int charge;
	private int total_charge;
	
	public PCFee() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("����� �ð��� �ð��� ������ �Է��ϼ���. ");
			this.hour = s.nextInt();
			this.minute = s.nextInt();
			if(hour==0&&minute==0) break;
			charge = calculate();
			System.out.printf("������ �̿��� %d�� �Դϴ�.\n", charge);
			total_charge = total_charge+charge;
		}
	}
	int calculate() {
		if(minute>30) charge = 2000*(hour+1);
		else if(minute<=30&&minute>0) charge = 2000*hour + 1000;
		else if(minute==0) charge = 2000*hour;
		if(hour>=2&&hour<3)charge = (int)(charge*0.95);
		else if(hour>=3&&hour<5)charge = (int)(charge*0.9);
		else if(hour>=5)charge = (int)(charge*0.8);
		System.out.println(charge);
		return this.charge;
	}
	public void printFee() {
		System.out.println();
		System.out.printf("���ݱ����� �̿�� �ѱݾ��� %d�� �Դϴ�.\n", total_charge);
	}
}
