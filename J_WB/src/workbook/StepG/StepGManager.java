package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���� ���\n");
			printf("4. �ε��� �߰� ������ ����\n");
			printf("5. pc�� �̿�� ����\n");
			printf("6. ���θ� ���� ����\n");
			printf("7. ���̰��� ��ǥ��\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
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