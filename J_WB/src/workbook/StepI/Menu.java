package workbook.StepI;

import java.util.Scanner;

public class Menu {
	private int total_price;
	
	public Menu() {
		input();
	}
	void showMenu() {
		System.out.println("1. ����(15,000��) 2. ���İ�Ƽ(10,000��) 3. ������(7,000��) 4. �����(2,000��)");
	}
	void input() {
		int select;
		int price[]= {15000,10000,7000,2000};
		Scanner s = new Scanner(System.in);
		while(true) {
			showMenu();
			System.out.printf("�޴��� �������ּ���.(����: 5)");
			select = s.nextInt();
			if(select==5) {
				System.out.printf("��������� �ֹ� �ݾ��� %d�� �Դϴ�.\n\n", total_price);
				break;
			}
			total_price+=price[select-1];
			System.out.printf("��������� �ֹ� �ݾ��� %d�� �Դϴ�.\n\n", total_price);
		}
	}
	public void printPrice() {
		System.out.printf("\n�� �ֹ� �ݾ��� %d�� �Դϴ�.\n", total_price+1);
	}
}
