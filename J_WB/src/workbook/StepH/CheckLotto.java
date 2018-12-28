package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class CheckLotto {
	private int lotto_user[] = new int[6];
	private int count;
	
	public CheckLotto() {
		input();
	}
	void input() {
		count=0;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<lotto_user.length;i++) {
			System.out.printf("���ϴ� %d ��° �ζ� ���ڸ� �Է��ϼ���. ", i+1);
			this.lotto_user[i] = s.nextInt();
			for(int j=0;j<count;j++) {
				if((lotto_user[i]==lotto_user[j])||lotto_user[i]<=0||lotto_user[i]>45) {
					System.out.println("=> �߸� �Է��ϼ̽��ϴ�.");
					i--;
					count--;
				}
			}
			count++;
		}
	}
	void com_input() {
		
	}
	public void printWin() {
		int lotto_com[] = new int[6];
		int match_count=0;
		count=0;
		Random r = new Random();
		for(int i=0;i<lotto_com.length;i++) {
			lotto_com[i] = r.nextInt(45)+1;
			for(int j=0;j<count;j++) {
				if(lotto_com[i]==lotto_com[j]) {
					i--;
					count--;
				}
			}
			count++;
		}
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++) {
				if(lotto_com[i]==lotto_user[j])
					match_count++;
			}
		System.out.printf("\n�̹� ���� �ζ� ��÷ ��ȣ�� ");
		for(int i=0;i<lotto_com.length;i++) 
			System.out.printf(" %d ", lotto_com[i]);
		System.out.println("�Դϴ�.\n");
		System.out.println("��ġ�ϴ� �ζ� ��ȣ�� " + match_count + "�� �Դϴ�.");
		
	}
}
