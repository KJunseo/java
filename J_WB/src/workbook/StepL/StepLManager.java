package workbook.StepL;

import java.util.Scanner;

public class StepLManager {
	public StepLManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("2. ������ ����� ����\n");
			printf("3. �Ĵ� �ֹ� ����\n");
			printf("4. �л� ���� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				StoreMenu sm = new StoreMenu();
				break;
			case 2:
				ParkingLot pl = new ParkingLot();
				break;
			case 3: 
				Restaurant rt = new Restaurant();
				break;
			case 4:
				StudentInfo si= new StudentInfo();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}