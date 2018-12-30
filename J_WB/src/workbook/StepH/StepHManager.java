package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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