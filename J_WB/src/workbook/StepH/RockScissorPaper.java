package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class RockScissorPaper {
	private int score[][] = new int[2][3];
	
	public RockScissorPaper() {
		input();
	}
	void input() {
		int com_finger;
		int my_finger;
		String shape[]= {"가위","바위","보"};
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		while(true) {
			com_finger = r.nextInt(3)+1;
			System.out.printf("가위(1), 바위(2), 보(3)를 입력하세요. ");
			my_finger = s.nextInt();
			if(my_finger==0) break;
			System.out.printf("컴퓨터가 낸 것은 " + shape[com_finger-1] + "입니다. ");
			if(my_finger == com_finger) {
				System.out.printf("-----> 비김~\n\n");
				score[0][1]++;
				score[1][1]++;
			}
			else if(my_finger-com_finger==-2||my_finger-com_finger==1) {
				System.out.printf("-----> 사용자 승!\n\n");
				score[0][2]++;
				score[1][0]++;
			}
			else if(my_finger-com_finger==2||my_finger-com_finger==-1) {
				System.out.printf("-----> 컴퓨터 승\n\n");
				score[0][0]++;
				score[1][2]++;
			}
		}
	}
	public void printResult() {
		System.out.printf("\n컴퓨터: 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d 입니다.\n",score[0][0],score[0][2],score[0][1]);
		System.out.printf("사용자: 이긴 횟수는 %d회, 진 횟수 %d회, 비긴 횟수는 %d 입니다.\n",score[1][0],score[1][2],score[1][1]);
	}
}
