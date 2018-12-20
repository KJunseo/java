package workbook.StepD;

import java.util.Scanner;

public class CountMinor {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	private int i;
	
	public CountMinor() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("가족이 몇 명인지 입력하세요. ");
		this.count_all = s.nextInt();
		for(i=0;i<count_all;i++) {
			System.out.printf("태어난 년도를 입력하세요. ");
			this.birth_year = s.nextInt();
			if(getAge(birth_year)<20) {
				count_young++;
			}
		}
	}
	int getAge(int year) {
		age = 2018 - year + 1;
		return this.age;		
	}
	public void printCount() {
		System.out.println("가족들 중에 미성년자는 모두 " + count_young + "명 입니다.");
	}
}
