package workbook.StepD;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1���� ���� ���ϱ�\n");
			printf("2. �Է� ���� ���ڵ� �߿��� ���� ū ���� ���� ���� �� ���ϱ�\n");
			printf("3. �Է� ���� ���ڵ��� �� �հ�� ��� �� ���ϱ�\n");
			printf("4. �̼����� ���� ����\n");
			printf("5. ���簢�� ���� ���� ����\n");
			printf("6. ����Ʈ���� ��� �� ���� ����\n");
			printf("7. 1�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("8. 2�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("9. ���ϴ� �������� �� ����ϱ�\n");
			printf("10. �� ���� ��Ÿ�� ��� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
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