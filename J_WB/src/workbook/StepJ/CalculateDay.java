package workbook.StepJ;

import java.util.Scanner;

public class CalculateDay {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int total_day[] = new int[2];
	private int month;
	private int day;
	
	public CalculateDay() {
		input();
	}
	void input() {
		String name[]= {"ù","��"};
		Scanner s = new Scanner(System.in);
		for(int i=0;i<total_day.length;i++) {
			System.out.printf(name[i] + " ��° ��¥�� �Է��Ͻÿ�. (��  ��) ");
			month = s.nextInt();
			day = s.nextInt();
			if((month<1)||(month>12)||(day>monthdays[month-1])) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			total_day[i] = CalcDate(month,day);
		}
	}
	int CalcDate(int month, int day) {
		int all_day = 0;
		for(int i=0;i<month-1;i++) {
			all_day+=monthdays[i];
		}
		all_day+=day;
		return all_day;
	}
	public void printTerm() {
		int term = Math.abs(total_day[1] - total_day[0]);
		if(!((month<1)||(month>12)||(day>monthdays[month-1]))) {
			System.out.printf("�� ��¥�� ������ %d�� �Դϴ�.\n", term);
		}
		
	}
}
