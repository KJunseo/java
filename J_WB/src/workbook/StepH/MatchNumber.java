package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class MatchNumber {
	private int count;
	
	public MatchNumber() {
		input();
	}
	void input() {
		int number_try;
		Random Generator = new Random();
		Scanner s = new Scanner(System.in);
		int answer = Generator.nextInt(100)+1;
		while(true) {
			System.out.printf("1���� 100������ ���� �ϳ��� ���纸����. ");
			number_try = s.nextInt();
			count++;
			if(answer==number_try) break;
			else if(answer>number_try) System.out.println("�� �� ū �� �Դϴ�.");
			else if(answer<number_try) System.out.println("�� �� ���� �� �Դϴ�.");
		}
	}
	public void printCount() {
		System.out.printf("%d������ ���ڸ� ���߼̽��ϴ�.\n",count);
	}
}
