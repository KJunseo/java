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
		String shape[]= {"����","����","��"};
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		while(true) {
			com_finger = r.nextInt(3)+1;
			System.out.printf("����(1), ����(2), ��(3)�� �Է��ϼ���. ");
			my_finger = s.nextInt();
			if(my_finger==0) break;
			System.out.printf("��ǻ�Ͱ� �� ���� " + shape[com_finger-1] + "�Դϴ�. ");
			if(my_finger == com_finger) {
				System.out.printf("-----> ���~\n\n");
				score[0][1]++;
				score[1][1]++;
			}
			else if(my_finger-com_finger==-2||my_finger-com_finger==1) {
				System.out.printf("-----> ����� ��!\n\n");
				score[0][2]++;
				score[1][0]++;
			}
			else if(my_finger-com_finger==2||my_finger-com_finger==-1) {
				System.out.printf("-----> ��ǻ�� ��\n\n");
				score[0][0]++;
				score[1][2]++;
			}
		}
	}
	public void printResult() {
		System.out.printf("\n��ǻ��: �̱� Ƚ���� %dȸ, �� Ƚ�� %dȸ, ��� Ƚ���� %d �Դϴ�.\n",score[0][0],score[0][2],score[0][1]);
		System.out.printf("�����: �̱� Ƚ���� %dȸ, �� Ƚ�� %dȸ, ��� Ƚ���� %d �Դϴ�.\n",score[1][0],score[1][2],score[1][1]);
	}
}
