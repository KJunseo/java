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
			System.out.printf("���ڸ� �Է��Ͻÿ�. (0.����): ");
			num = s.nextInt();
			if(num==0) break;
			System.out.printf("2�� %d����: ", num);
			System.out.println(poweroftwo(num));
		}
	}
	int poweroftwo(int n) {
		if(n==0) return 1;
		else return 2*poweroftwo(n-1);
	}
}
