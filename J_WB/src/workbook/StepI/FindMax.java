package workbook.StepI;

import java.util.Scanner;

public class FindMax {
	private int num[] = new int[10];
	
	public FindMax() {
		input();
	}
	int maxOfTen() {
		int max = num[0];
		for(int i=1;i<num.length;i++) {
			if(max<num[i]) max=num[i];
		}
		return max;
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("10개의 숫자 중 최댓값을 구합니다.");
		for(int i=0;i<10;i++) {
			System.out.printf("%d번 수를 입력하시오. ", i+1);
			num[i] = s.nextInt();
		}
	}
	public void printMax() {
		System.out.printf("최댓값은 %d 입니다.\n", maxOfTen());
	}
}
