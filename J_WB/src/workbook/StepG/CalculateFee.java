package workbook.StepG;

import java.util.Scanner;

public class CalculateFee {
	private int money;
	private int charge;
	private int total_charge;
	
	public CalculateFee() {
		input();
	}
	void input() {
		int kind;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("�ε��� �ŷ�����(1:�Ÿ�, 2:�Ӵ�, 0:�������)�� �Է��ϼ���.: ");
			kind = s.nextInt();
			if(kind==0)break;
			System.out.printf("�ε��� �ŷ��ݾ�(��)�� �Է��ϼ���.: ");
			this.money = s.nextInt();
			if(kind==1) charge = sold();
			else if(kind==2) charge = rental();
			System.out.printf("�̿� ���� �߰� ������� %d�� �Դϴ�.\n", charge);
			total_charge = total_charge + charge;
		}
	}
	public void printFee() {
		System.out.printf("���ݱ����� ������ �Ѿ��� %d�� �Դϴ�.\n", total_charge);
	}
	int sold() {
		if(money<50000000) {
			charge = (int)(money*0.006);
			if(charge >=250000) charge = 250000;
		}
		else if(money>=50000000&&money<200000000) {
			charge = (int)(money*0.005);
			if(charge >=800000) charge  = 800000;
		}
		else charge = (int)(money*0.004);
		return this.charge;
	}
	int rental() {
		if(money<20000000) {
			charge = (int)(money*0.005);
			if(charge>=70000) charge = 70000;
		}
		else if(money>=20000000&&money<50000000) {
			charge = (int)(money*0.005);
			if(charge >=200000) charge  = 200000;
		}
		else if(money>=50000000&&money<100000000) {
			charge = (int)(money*0.004);
			if(charge >=300000) charge  = 300000;
		}
		else charge = (int)(money*0.003);
		return this.charge;
	}
	
}
