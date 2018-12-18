package workbook.StepB;

import java.util.Scanner;

public class YearToAge {
	private int birth_year;
	private int age;
	
	public YearToAge() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요. ");
		this.birth_year = s.nextInt();
	}
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}
	public void printAge() {
		if(getAge()<20) {
			System.out.println("미성년자 입니다.");
		}
		else
			System.out.println("미성년자가 아닙니다.");
	}
}
