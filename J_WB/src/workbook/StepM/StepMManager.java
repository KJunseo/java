package workbook.StepM;

import java.util.Scanner;

public class StepMManager {
	public StepMManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				StoreMenu sm = new StoreMenu();
				break;
			case 0:
				System.exit(0);
			}
		}
	}
	void printf(String s){System.out.print(s);} 
	
	
}