package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰��\n");
			printf("2. �µ���ȯ\n");
			printf("3. ���簢�� ���̰��\n");
			printf("4. ����Ʈ ���� ���\n");
			printf("5. ��¥���\n");
			printf("6. �������\n");
			printf("7. ���� �뷮 ���\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				TcToTf ctf = new TcToTf();
				ctf.printTf();
				break;
			case 3:
				AreaOfRec wor = new AreaOfRec();
				wor.printArea();
				break;
			case 4:
				M2ToP mtp = new M2ToP();
				mtp.printP();
				break;
			case 5:
				DayToSecond dts = new DayToSecond();
				dts.printSec();
				break;
			case 6:
				TotalOfScore tos = new TotalOfScore();
				tos.printTotal();
				break;
			case 7:
				GigaToEtype gte = new GigaToEtype();
				gte.printEtype();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
