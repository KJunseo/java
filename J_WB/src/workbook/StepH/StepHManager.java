package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� �˾� ���߱�\n");
			printf("2. �ζ� ��ȣ �����\n");
			printf("3. �ζ� ��ȣ ��÷ Ȯ���ϱ�\n");
			printf("4. ���������� �����ϱ�\n");
			printf("5. ���Ըӽ� �����\n");
			printf("6. 5�� ������ ������ ���� ���ϱ�\n");
			printf("7. ������ ������ ������ ����ϱ�\n");
			printf("8. ���ڿ� �ٲٱ�\n");
			printf("9. ����� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				MatchNumber mn = new MatchNumber();
				mn.printCount();
				break;
			case 2:
				MakeLotto ml = new MakeLotto();
				ml.printLotto();
				break;
			case 3: 
				CheckLotto cl = new CheckLotto();
				cl.printWin();
				break;
			case 4:
				RockScissorPaper rsp = new RockScissorPaper();
				rsp.printResult();
				break;
			case 5:
				SlotMachine sm = new SlotMachine();
				sm.Game();
				break;
			case 6:
				SquareCombination sc = new SquareCombination();
				sc.printResult();
				break;
			case 7:
				PrintSplit ps = new PrintSplit();
				ps.printSplit();
				break;
			case 8:	
				ChangeString cs = new ChangeString();
				break;
			case 9:
				PrintInformation pi = new PrintInformation();
				pi.printUser();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}