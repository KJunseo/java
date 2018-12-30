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
			System.out.printf("원하는 %d 번째 로또 숫자를 입력하세요. ", i+1);
			this.lotto_user[i] = s.nextInt();
			if(checkSame(i,lotto_user)!=1||lotto_user[i]>45||lotto_user[i]<1) {
				System.out.println("=> 잘못 입력하셨습니다.");
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
		System.out.printf("\n이번 주의 로또 당첨 번호는 ");
		for(int i=0;i<lotto_com.length;i++) 
			System.out.printf(" %d ", lotto_com[i]);
		System.out.println("입니다.\n");
		System.out.println("일치하는 로또 번호는 " + winNum() + "개 입니다.");
		
	}
}
