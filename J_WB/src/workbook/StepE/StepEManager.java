package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 입력한 숫자 크기의 정사각형 출력하기\n");
			printf("2. 입력한 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기\n");
			printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
			printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기\n");
			printf("6. 2차원 숫자 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				NumSquare ns = new NumSquare();
				ns.printResult();
				break;
			case 2:
				RightTriangle rt = new RightTriangle();
				rt.printResult();
				break;
			case 3: 
				IsoTriangle it = new IsoTriangle();
				it.printResult();
				break;
			case 4:
				MultiTable mt = new MultiTable();
				mt.printTable();
				break;
			case 5:
				MultiTable2 mt2 = new MultiTable2();
				mt2.printTable();
				break;
			case 6:
				TwoDimenNum tdn = new TwoDimenNum();
				tdn.printTable();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}