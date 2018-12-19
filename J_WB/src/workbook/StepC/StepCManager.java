package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
			printf("9. 소득세 계산\n");
			printf("10. 간단한 사칙연산 계산기\n");
			printf("11. 윤년 판정하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				CalAge ca = new CalAge();
				ca.printAge();
				break;
			case 2:
				WaterTem wt = new WaterTem();
				wt.printWT();
				break;
			case 3: 
				JudgeRect jr = new JudgeRect();
				jr.printRect();
				break;
			case 4:
				SizeOfApt soa = new SizeOfApt();
				soa.printSize();
				break;
			case 5:
				CalDay cd = new CalDay();
				cd.printDay();
				break;
			case 6:
				CalScore cs = new CalScore();
				cs.printScore();
				break;
			case 7:
				FileTransTime ftt = new FileTransTime();
				ftt.printTime();
				break;
			case 8:
				MaxAndMin mam = new MaxAndMin();
				mam.printMAM();
				break;
			case 9:
				CalIncomeTax cit = new CalIncomeTax();
				cit.printTax();
				break;
			case 10:
				SimpleCal sc = new SimpleCal();
				sc.printResult();
				break;
			case 11:
				JudgeLeapYear jly = new JudgeLeapYear();
				jly.printLeapYear();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}