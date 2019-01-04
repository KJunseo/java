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
		String name[]= {"첫","두"};
		Scanner s = new Scanner(System.in);
		for(int i=0;i<total_day.length;i++) {
			System.out.printf(name[i] + " 번째 날짜를 입력하시오. (월  일) ");
			month = s.nextInt();
			day = s.nextInt();
			if((month<1)||(month>12)||(day>monthdays[month-1])) {
				System.out.println("잘못 입력하셨습니다.");
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
			System.out.printf("두 날짜의 간격은 %d일 입니다.\n", term);
		}
		
	}
}
