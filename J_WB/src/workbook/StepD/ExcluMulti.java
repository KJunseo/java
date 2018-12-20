package workbook.StepD;

import java.util.Scanner;

public class ExcluMulti {
	private int num1;
	private int num2;
	private int i;
	
	public ExcluMulti() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("2개의 숫자를 입력하시오. ");
		this.num1 = s.nextInt();
		this.num2 = s.nextInt();
	}
	public void printResult() {
		for(i=1;i<101;i++) {
			if((i%num1==0&&i%num2!=0)||(i%num2==0&&i%num1!=0)) {
				System.out.printf("%d,",i);
			}
		}
		System.out.println();
	}
}