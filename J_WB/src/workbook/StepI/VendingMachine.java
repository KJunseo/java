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
		System.out.printf("메뉴를 선택해주세요: ");
		select = s.nextInt();
		return price[select-1];
	}
	void showMenu() {
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원)");
		System.out.println("4.홍차(500원) 5.코코아(600원)");
	}
	void input() {
		String check;
		Scanner s = new Scanner(System.in);
		while(true) {
			showMenu();
			total_sum+=selectCan();
			count++;
			System.out.printf("더 필요하십니까?(Y/N) ");
			check =s.next();
			if(check.equalsIgnoreCase("N"))break;	
		}
	}
	public void printPrice() {
		System.out.printf("%d개의 음료를 선택하여 총 %d원 입니다.\n", count,total_sum);
	}
}
