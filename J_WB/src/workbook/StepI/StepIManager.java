package workbook.StepI;

import java.util.Scanner;

public class StepIManager {
	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ִ� �޼ҵ� �����\n");
			printf("2. ��ĭ�� �Բ� Ư�� ���ڸ� ������ŭ ��� �޼ҵ� �����\n");
			printf("3. �� ����\n");
			printf("4. �޴� ��ȣ �޾ƿ��� �޼ҵ� �����\n");
			printf("5. �ִ� �����ϴ� �޼ҵ� �����\n");
			printf("6. ������ ���ڸ� ����� ������ �����ϴ� �޼ҵ� �����\n");
			printf("7. ���Ǳ⿡�� ������ ���� ������ �����ϴ� �޼ҵ� �����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				Menu m = new Menu();
				m.printPrice();
				break;
			case 2:
				BlankAndCharacter bac = new BlankAndCharacter();
				bac.printTriangle();
				break;
			case 3: 
				JudgementObesity jo = new JudgementObesity();
				break;
			case 4:
				MenuNumber mn = new MenuNumber();
				mn.printPrice();
				break;
			case 5:
				FindMax fm = new FindMax();
				fm.printMax();
				break;
			case 6:
				RandomSection rs = new RandomSection();
				rs.printSection();
				break;
			case 7:
				VendingMachine vm = new VendingMachine();
				vm.printPrice();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}