package workbook.StepI;

import java.util.Scanner;

public class VendingMachine {
	private int count=0;
	private int total_sum=0;
	private static final int PRICE_COKE = 700;
	private static final int PRICE_COFFEE = 300;
	private static final int PRICE_LEMON = 1000;
	private static final int PRICE_TEA = 500;
	private static final int PRICE_COCOA = 600;
	
	public VendingMachine() {
		input();
	}
	int selectCan() {
		int select;
		int price[]= {PRICE_COKE,PRICE_COFFEE,PRICE_LEMON,PRICE_TEA,PRICE_COCOA};
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
