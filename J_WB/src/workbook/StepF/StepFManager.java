package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �� ��°�� ū ���� ���� ã��\n");
			printf("2. �ɻ����� ���\n");
			printf("3. 5���� ��, ��, �� 3���� ������ ���� ����, ��հ� ���ϱ�\n");
			printf("4. 5���� ��, ��, �� 3���� ������ �л� �� ����, ��հ� ���ϱ�\n");
			printf("5. �� ����\n");
			printf("6. 5�� ����Ʈ�� ������ ���� ���ϱ�\n");
			printf("7. 5�� ����Ʈ�� ����, ȣ���� ������ ���� ���ϱ�\n");
			printf("8. ��ġ�� �ʴ� ���� 10�� �Է� �ޱ�\n");
			printf("9. �迭�� �̿��� ���� ��¥ ���\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				FindSecondNum fsn = new FindSecondNum();
				fsn.printSNum();
				break;
			case 2:
				CalScore cs = new CalScore();
				cs.printAvg();
				break;
			case 3: 
				SumAndAvg saa = new SumAndAvg();
				saa.printSV();
				break;
			case 4:
				SumAndAvg2 saa2 = new SumAndAvg2();
				saa2.printSV();
				break;
			case 5:
				JudgeObesity jo = new JudgeObesity();
				jo.printObesity();
				break;
			case 6:
				NumResident nr = new NumResident();
				nr.printNum();
				break;
			case 7:
				NumResident2 nr2 = new NumResident2();
				nr2.printNum();
				break;
			case 8:
				TenNumber tn = new TenNumber();
				tn.printNum();
				break;
			case 9:
				CalDay cd = new CalDay();
				cd.printDay();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}