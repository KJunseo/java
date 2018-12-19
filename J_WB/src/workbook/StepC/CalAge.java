package workbook.StepC;

import java.util.Scanner;

public class CalAge {
	private int birth_year;
	private int age;
	
	public CalAge() {
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
		if(getAge()<7) {
			System.out.println("유아입니다.");
		}
		else if(getAge()>=7&&getAge()<13) {
			System.out.println("어린이입니다.");
		}
		else if(getAge()>=13&&getAge()<20) {
			System.out.println("청소년입니다.");
		}
		else if(getAge()>=20&&getAge()<30) {
			System.out.println("청년입니다.");
		}
		else if(getAge()>=30&&getAge()<60) {
			System.out.println("중년입니다.");
		}
		else {
			System.out.println("노년입니다.");
		}
	}
}
