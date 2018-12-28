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
			System.out.printf("1부터 100까지의 숫자 하나를 맞춰보세요. ");
			number_try = s.nextInt();
			count++;
			if(answer==number_try) break;
			else if(answer>number_try) System.out.println("좀 더 큰 수 입니다.");
			else if(answer<number_try) System.out.println("좀 더 작은 수 입니다.");
		}
	}
	public void printCount() {
		System.out.printf("%d번만에 숫자를 맞추셨습니다.\n",count);
	}
}
