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
		System.out.printf("�¾ �⵵�� �Է��ϼ���. ");
		this.birth_year = s.nextInt();
	}
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}
	public void printAge() {
		if(getAge()<20) {
			System.out.println("�̼����� �Դϴ�.");
		}
		else
			System.out.println("�̼����ڰ� �ƴմϴ�.");
	}
}
