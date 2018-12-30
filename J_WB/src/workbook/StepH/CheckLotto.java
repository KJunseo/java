package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class CheckLotto {
	private int lotto_user[] = new int[6];
	private int lotto_com[] = new int[6];
	private int count;
	
	public CheckLotto() {
		com_input();
		user_input();
	}
	void com_input() {
		count=0;
		Random r = new Random();
		for(int i=0;i<lotto_com.length;i++) {
			lotto_com[i] = r.nextInt(45)+1;
			if(checkSame(i,lotto_com)!=1) {
				i--;
				count--;
			}
			count++;
		}
	}
	void user_input() {
		count=0;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<lotto_user.length;i++) {
			System.out.printf("���ϴ� %d ��° �ζ� ���ڸ� �Է��ϼ���. ", i+1);
			this.lotto_user[i] = s.nextInt();
			if(checkSame(i,lotto_user)!=1||lotto_user[i]>45||lotto_user[i]<1) {
				System.out.println("=> �߸� �Է��ϼ̽��ϴ�.");
				i--;
				count--;
			}
			count++;
		}
	}
	int checkSame(int check,int[]lotto) {
		for(int j=0;j<count;j++) {
			if(lotto[check]==lotto[j]) {
				return -1;
			}
		}
		return 1;
	}
	int winNum() {
		int match_count=0;
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++) {
				if(lotto_com[i]==lotto_user[j])
					match_count++;
			}
		return match_count;
	}
	public void printWin() {
		System.out.printf("\n�̹� ���� �ζ� ��÷ ��ȣ�� ");
		for(int i=0;i<lotto_com.length;i++) 
			System.out.printf(" %d ", lotto_com[i]);
		System.out.println("�Դϴ�.\n");
		System.out.println("��ġ�ϴ� �ζ� ��ȣ�� " + winNum() + "�� �Դϴ�.");
		
	}
}
