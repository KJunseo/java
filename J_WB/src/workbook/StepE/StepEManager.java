package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �Է��� ���� ũ���� ���簢�� ����ϱ�\n");
			printf("2. �Է��� ���� ũ���� ���̸� ���� ������ �ﰢ�� ����ϱ�\n");
			printf("3. �Է��� ���� ũ���� ���̸� ���� �̵ �ﰢ�� ����ϱ�\n");
			printf("4. Ȧ���� �Ǵ� ¦������ ������ ����ϱ�\n");
			printf("5. Ȧ���� �Ǵ� ¦������ �������� ���� ������ ���߾� ����ϱ�\n");
			printf("6. 2���� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
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