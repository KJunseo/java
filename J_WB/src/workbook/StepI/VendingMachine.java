package workbook.StepI;

import java.util.Scanner;

public class VendingMachine {
	private int count;
	private int total_sum;
	
	public VendingMachine() {
		input();
	}
	int selectCan() {
		int select;
		int price[]= {700,300,1000,500,600};
		Scanner s = new Scanner(System.in);
		System.out.printf("�޴��� �������ּ���: ");
		select = s.nextInt();
		return price[select-1];
	}
	void showMenu() {
		System.out.println("1.�ݶ�(700��) 2.����Ŀ��(300��) 3.�����ֽ�(1000��)");
		System.out.println("4.ȫ��(500��) 5.���ھ�(600��)");
	}
	void input() {
		String check;
		Scanner s = new Scanner(System.in);
		while(true) {
			showMenu();
			total_sum+=selectCan();
			count++;
			System.out.printf("�� �ʿ��Ͻʴϱ�?(Y/N) ");
			check =s.next();
			if(check.equalsIgnoreCase("N"))break;	
		}
	}
	public void printPrice() {
		System.out.printf("%d���� ���Ḧ �����Ͽ� �� %d�� �Դϴ�.\n", count,total_sum);
	}
}
