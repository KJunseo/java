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
		System.out.printf("������ �� ������ �Է��ϼ���. ");
		this.count_all = s.nextInt();
		for(i=0;i<count_all;i++) {
			System.out.printf("�¾ �⵵�� �Է��ϼ���. ");
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
		System.out.println("������ �߿� �̼����ڴ� ��� " + count_young + "�� �Դϴ�.");
	}
}
