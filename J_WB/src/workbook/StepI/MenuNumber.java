package workbook.StepI;

import java.util.Scanner;

public class MenuNumber {
	private int total_price;
	private int select;
	
	public MenuNumber() {
		input();
	}
	void showMenu() {
		System.out.println("1. ����(15,000��) 2. ���İ�Ƽ(10,000��) 3. ������(7,000��) 4. �����(2,000��)");
	}
	int selectMenu() {
		int price[]= {15000,10000,7000,2000};
		Scanner s = new Scanner(System.in);
		System.out.printf("�޴��� �������ּ���.(����: 5):");
		select = s.nextInt();
		if(select==5) {
			return -1;
		}
		return price[select-1];
	}
	void input() {
		while(true) {
			showMenu();
			total_price+=selectMenu();
			if(select==5) break; 
			System.out.printf("��������� �ֹ� �ݾ��� %d�� �Դϴ�.\n\n", total_price);
		}
	}
	public void printPrice() {
		System.out.printf("\n�� �ֹ� �ݾ��� %d�� �Դϴ�.\n", total_price+1);
	}
}
