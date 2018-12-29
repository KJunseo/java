package workbook.StepI;

import java.util.Scanner;

public class MenuNumber {
	private int total_price;
	private int select;
	
	public MenuNumber() {
		input();
	}
	void showMenu() {
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
	}
	int selectMenu() {
		int price[]= {15000,10000,7000,2000};
		Scanner s = new Scanner(System.in);
		System.out.printf("메뉴를 선택해주세요.(종료: 5):");
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
			System.out.printf("현재까지의 주문 금액은 %d원 입니다.\n\n", total_price);
		}
	}
	public void printPrice() {
		System.out.printf("\n총 주문 금액은 %d원 입니다.\n", total_price+1);
	}
}
