package workbook.StepF;

import java.util.Scanner;

public class FindSecondNum {
	private int second;
	private int second_max_index;
	
	public FindSecondNum() {
		input();
	}
	void input() {
		int [] num = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.printf(i+1 + "번째 수를 입력하시오. ");
			num[i] = s.nextInt();
		}
		FindSecond(num);
		
	}
	public void printSNum() {
		System.out.printf("두 번째로 큰 수는 %d번 째 수 %d입니다.\n",second_max_index,second);
	}
	void FindSecond(int[] num) {
		int first=num[0];
		second=num[0];
		int first_max_index=0;
		second_max_index = 0;
		for(int i=1;i<num.length;i++) {
			if(num[i]>first) {
				second = first;
				second_max_index = first_max_index;
				first = num[i];
				first_max_index=i+1;
			}
			else if(first>num[i]&&num[i]>second) {
				second = num[i];
				second_max_index=i+1;
			}
		}
	}
}
