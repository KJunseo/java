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
		System.out.println("10���� ���� �� �ִ��� ���մϴ�.");
		for(int i=0;i<10;i++) {
			System.out.printf("%d�� ���� �Է��Ͻÿ�. ", i+1);
			num[i] = s.nextInt();
		}
	}
	public void printMax() {
		System.out.printf("�ִ��� %d �Դϴ�.\n", maxOfTen());
	}
}
