package workbook.StepF;

import java.util.Scanner;

public class FindSecondNum {
	private int [] num = new int[10];
	private int first;
	private int second;
	private int first_max_index;
	private int second_max_index;
	
	public FindSecondNum() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			System.out.printf(i+1 + "��° ���� �Է��Ͻÿ�. ");
			this.num[i] = s.nextInt();
		}
		FindSecond(num);
		
	}
	public void printSNum() {
		System.out.printf("�� ��°�� ū ���� %d�� ° �� %d�Դϴ�.\n",second_max_index,second);
	}
	void FindSecond(int[] num) {
		first=num[0];
		second=num[0];
		first_max_index=0;
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
