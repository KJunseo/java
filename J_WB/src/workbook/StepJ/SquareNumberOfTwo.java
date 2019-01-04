package workbook.StepJ;

import java.util.Scanner;

public class SquareNumberOfTwo {
	
	public SquareNumberOfTwo() {
		input();
	}
	void input() {
		int num;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("숫자를 입력하시오. (0.종료): ");
			num = s.nextInt();
			if(num==0) break;
			System.out.printf("2의 %d승은: ", num);
			System.out.println(poweroftwo(num));
		}
	}
	int poweroftwo(int n) {
		if(n==0) return 1;
		else return 2*poweroftwo(n-1);
	}
}
