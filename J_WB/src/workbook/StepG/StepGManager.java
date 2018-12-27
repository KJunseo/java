package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 점수 계산\n");
			printf("4. 부동산 중개 수수료 계산기\n");
			printf("5. pc방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				CalculateAge ca = new CalculateAge();
				ca.printAge();
				break;
			case 2:
				WaterTemparature wt = new WaterTemparature();
				wt.printWater();
				break;
			case 3: 
				CalculateScore cs = new CalculateScore();
				cs.printScore();
				break;
			case 4:
				CalculateFee cf = new CalculateFee();
				cf.printFee();
				break;
			case 5:
				PCFee pcf = new PCFee();
				pcf.printFee();
				break;
			case 6:
				ShoppingMallSales sms = new ShoppingMallSales();
				sms.printSales();
				break;
			case 7:
				AmusementPark ap = new AmusementPark();
				ap.printFee();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}