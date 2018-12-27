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
		System.out.println("세 종류의 제품이 있습니다.");
		System.out.println("(1. 가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원)\n");
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.printf("%d번 제품은 몇개를 구입하실래요? ", i+1);
				order[i] = s.nextInt();
				sale = sale+(price[i]*order[i]);
			}
			if(sale==0) break;
			System.out.printf("판매금액은 %d원 입니다.\n", sale);
			System.out.println();
			total_sale = total_sale + sale;
			sale=0;
		}
	}
	public void printSales() {
		System.out.printf("지금까지의 총 매출 금액은 %d원 입니다.\n", total_sale);
	}
}
