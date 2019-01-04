package workbook.StepJ;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사점수 계산\n");
			printf("3. 물의 온도 구간 개수 판정\n");
			printf("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 수열로 황금비율 구하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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