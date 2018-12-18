package workbook.StepB;

import java.util.Scanner;


public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰�� �� �̼����� ����\n");
			printf("2. �µ� ��ȣ ��ȯ\n");
			printf("3. ���簢�� ���� ��� �� ���簢�� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. �پ��� ���� ����\n");
			printf("9. �� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				ChangeTem ct = new ChangeTem();
				ct.printTem();
				break;
			case 3: 
				JudgeRect jr = new JudgeRect();
				jr.printRecInfo();
				break;
			case 4:
				SizeOfApt soa = new SizeOfApt();
				soa.printSize();
				break;
			case 5:
				CountSecond cs = new CountSecond();
				cs.printSecond();
				break;
			case 6:
				CalKEM ckem = new CalKEM();
				ckem.printScore();
				break;
			case 7:
				FileTransTime ftt = new FileTransTime();
				ftt.printTime();
				break;
			case 8:
				JudgeCondition jc = new JudgeCondition();
				jc.printCondition();
				break;
			case 9:
				JudgeObesity jo = new JudgeObesity();
				jo.printObesity();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}