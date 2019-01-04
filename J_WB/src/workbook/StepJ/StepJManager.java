package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. �ɻ����� ���\n");
			printf("3. ���� �µ� ���� ���� ����\n");
			printf("4. ���� ��¥ ��� �޼ҵ带 �̿��� ��¥ ���� ����\n");
			printf("5. ���� ���� �ý���\n");
			printf("6. �Ǻ���ġ �� ���ϱ�\n");
			printf("7. 2�� ������ ���ϱ�\n");
			printf("8. Ackermann �� ���ϱ�\n");
			printf("9. pow() �޼ҵ� �����\n");
			printf("10. �Ǻ���ġ ������ Ȳ�ݺ��� ���ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				JudgementAge ja = new JudgementAge();
				ja.printAge();
				break;
			case 2:
				CalculateScore cs = new CalculateScore();
				cs.printAvg();
				break;
			case 3: 
				JudgementWater jw = new JudgementWater();
				jw.printWater();
				break;
			case 4:
				CalculateDay cd = new CalculateDay();
				cd.printTerm();
				break;
			case 5:
				ParkingLot pl = new ParkingLot();
				pl.totalFee();
				break;
			case 6:
				Fibonacci f = new Fibonacci();
				break;
			case 7:
				SquareNumberOfTwo snot = new SquareNumberOfTwo();
				break;
			case 8:
				AckermannNumber a = new AckermannNumber();
				break;
			case 9:
				PowMethod pm = new PowMethod();
				pm.printResult();
				break;
			case 10:
				GoldenRatio gr = new GoldenRatio();
				
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}