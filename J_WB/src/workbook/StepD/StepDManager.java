package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1부터 숫자 더하기\n");
			printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기\n");
			printf("3. 입력 받은 숫자들의 총 합계와 평균 값 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트평형 계산 및 종류 판정\n");
			printf("7. 1차 메소드의 좌표 구하기\n");
			printf("8. 2차 메소드의 좌표 구하기\n");
			printf("9. 원하는 구구단의 단 출력하기\n");
			printf("10. 두 수의 배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				AddOneTo aot = new AddOneTo();
				aot.printSum();
				break;
			case 2:
				MaxMin mm = new MaxMin();
				mm.printResult();
				break;
			case 3: 
				SumAvg sa = new SumAvg();
				sa.printResult();
				break;
			case 4:
				CountMinor cm = new CountMinor();
				cm.printCount();
				break;
			case 5:
				CountRect cr = new CountRect();
				cr.printNum();
				break;
			case 6:
				KindOfApt koa = new KindOfApt();
				koa.printApt();
				break;
			case 7:
				FirstCoordi fc = new FirstCoordi();
				fc.printCoordi();
				break;
			case 8:
				SecondCoordi sc = new SecondCoordi();
				sc.printCoordi();
				break;
			case 9:
				PrintMultiTable pmt = new PrintMultiTable();
				pmt.printMTable();
				break;
			case 10:
				ExcluMulti em = new ExcluMulti();
				em.printResult();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}