package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰�� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���簢�� ���� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ���� ��¥ ���\n");
			printf("6. ���� ���\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. 3���� �� �� �ִ񰪰� �ּڰ� ���ϱ�\n");
			printf("9. �ҵ漼 ���\n");
			printf("10. ������ ��Ģ���� ����\n");
			printf("11. ���� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				CalAge ca = new CalAge();
				ca.printAge();
				break;
			case 2:
				WaterTem wt = new WaterTem();
				wt.printWT();
				break;
			case 3: 
				JudgeRect jr = new JudgeRect();
				jr.printRect();
				break;
			case 4:
				SizeOfApt soa = new SizeOfApt();
				soa.printSize();
				break;
			case 5:
				CalDay cd = new CalDay();
				cd.printDay();
				break;
			case 6:
				CalScore cs = new CalScore();
				cs.printScore();
				break;
			case 7:
				FileTransTime ftt = new FileTransTime();
				ftt.printTime();
				break;
			case 8:
				MaxAndMin mam = new MaxAndMin();
				mam.printMAM();
				break;
			case 9:
				CalIncomeTax cit = new CalIncomeTax();
				cit.printTax();
				break;
			case 10:
				SimpleCal sc = new SimpleCal();
				sc.printResult();
				break;
			case 11:
				JudgeLeapYear jly = new JudgeLeapYear();
				jly.printLeapYear();
				break;
			case 0:
				System.exit(0);
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
	
	
}