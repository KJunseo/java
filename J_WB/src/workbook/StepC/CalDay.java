package workbook.StepC;

import java.util.Scanner;

public class CalDay {
	private int month;
	private int day;
	private int day_count;
	
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
		if(month==1) {
			day_count = day;
		}
		else if(month == 2) {
			day_count = 31 + day;
		}
		else if(month == 3) {
			day_count = 31 + 28 + day;
		}
		else if(month == 4) {
			day_count = 31 + 28 + 31 + day;
		}
		else if(month == 5) {
			day_count = 31 + 28 + 31 + 30 + day;
		}
		else if(month == 6) {
			day_count = 31 + 28 + 31 + 30 + 31 + day;
		}
		else if(month == 7) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + day;
		}
		else if(month == 8) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		}
		else if(month == 9) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		}
		else if(month == 10) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		}
		else if(month == 11) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		}
		else if(month == 12) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		else {
			day_count=-1;
		}
		return this.day_count;
	}
	public void printDay() {
		if(getDay()== -1 ) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�� ��¥�� 1�� �� " + getDay()+" ��° ���� �ش�˴ϴ�.");
		}	
	}
}
