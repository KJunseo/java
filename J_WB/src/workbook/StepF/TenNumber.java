package workbook.StepF;

import java.util.Scanner;

public class TenNumber {
	private int [] number = new int[10];
	
	public TenNumber() {
		input();
	}
	void input() {
		int count=0;
		boolean dup;
		Scanner s = new Scanner(System.in);
		System.out.printf("1부터 100사이의 숫자를 입력하시오.\n");
		for(count=0;count<number.length;) {
			System.out.printf((count+1)+"번째 숫자를 입력하시오. ");
			this.number[count] = s.nextInt();
			dup=true;
			if((number[count] < 1)||(number[count] > 100)) {
				System.out.println("잘못 입력하였습니다.");
				dup = false;
			}
			for(int i=0;i<count;i++) {
				if(number[i]==number[count]) {
					System.out.println("잘못 입력하였습니다.");
					dup = false;
					break;
				}
			}
			if(dup) {
				count++;
			}
		}
	}
	public void printNum() {
		for(int i=0;i<number.length;i++) {
			System.out.println((i+1)+"번째 숫자는 "+number[i]+"입니다.");
		}
	}
}
