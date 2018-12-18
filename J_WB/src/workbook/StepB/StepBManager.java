package workbook.StepB;

import java.util.Scanner;


public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산 및 미성년자 판정\n");
			printf("2. 온도 상호 변환\n");
			printf("3. 직사각형 넓이 계산 및 정사각형 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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