package workbook.StepG;

import java.util.Scanner;

public class ShoppingMallSales {
	private int total_sale;
	
	public ShoppingMallSales() {
		input();
	}
	void input() {
		int order[] = {0,0,0};
		int sale=0;
		int price[] = {10000,6000,3000};
		
		Scanner s = new Scanner(System.in);
		System.out.println("�� ������ ��ǰ�� �ֽ��ϴ�.");
		System.out.println("(1. �����尩 1����, 2. ���尩 6õ��, 3. ����尩 3õ��)\n");
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.printf("%d�� ��ǰ�� ��� �����ϽǷ���? ", i+1);
				order[i] = s.nextInt();
				sale = sale+(price[i]*order[i]);
			}
			if(sale==0) break;
			System.out.printf("�Ǹűݾ��� %d�� �Դϴ�.\n", sale);
			System.out.println();
			total_sale = total_sale + sale;
			sale=0;
		}
	}
	public void printSales() {
		System.out.printf("���ݱ����� �� ���� �ݾ��� %d�� �Դϴ�.\n", total_sale);
	}
}
