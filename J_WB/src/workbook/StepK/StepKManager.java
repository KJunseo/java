package workbook.StepK;

import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("2. �޴��� �����ϱ�2\n");
			printf("3. ��ǥ �����ϱ�\n");
			printf("4. ��ǥ �����ϱ�2\n");
			printf("5. ����� ��� �����ϱ�\n");
			printf("6. ����� ��� �����ϱ�2\n");
			printf("7. �л� ���� ��� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				StepK01 k01 = new StepK01();
				break;
			case 2:
				StepK02 k02 = new StepK02();
				break;
			case 3: 
				StepK03 k03 = new StepK03();
				break;
			case 4:
				StepK04 k04 = new StepK04();
				break;
			case 5:
				StepK05 k05 = new StepK05();
				break;
			case 6:
				StepK06 k06 = new StepK06();
				break;
			case 7:
				StepK07 k07 = new StepK07();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}