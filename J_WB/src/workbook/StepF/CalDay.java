package workbook.StepF;

import java.util.Scanner;

public class CalDay {
	private int [] monthdays = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month;
	private int day;
	
	public CalDay() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �Է��Ͻÿ�. ");
		this.month = s.nextInt();
		System.out.printf("���� �Է��Ͻÿ�. ");
		this.day = s.nextInt();
	}
	int getDay() {
		int day_count = 0;
		for(int i=0;i<month-1;i++) {
			day_count = day_count + monthdays[i];
		}
		day_count = day_count+day;
		return day_count;
	}
	public void printDay() {
		if((month<1)||(month>12)||(day>monthdays[month-1])) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		else {
			System.out.printf("�� ��¥�� 1�� �� %d��° ���� �ش�˴ϴ�.\n", getDay());
		}	
	}
}
