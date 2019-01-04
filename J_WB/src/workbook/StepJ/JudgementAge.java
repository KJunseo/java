package workbook.StepJ;

import java.util.Scanner;

public class JudgementAge {

	private int age[] = new int[100];
	private int count[]= {0,0,0,0,0,0};
	private int count_person=0;
	
	public JudgementAge() {
		input();
	}
	void input() {
		int birth_year;
		int k=0;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<age.length;i++) {
			System.out.printf("%d 번째 사람의 태어난 년도를 입력하시오. ",i+1);
			birth_year = s.nextInt();
			if(birth_year>2018) break;
			count[askAge(birth_year)]++;
			count_person++;
		}
	}
	int askAge(int birthyear) {
		int k;
		age[count_person] = 2018 - birthyear +1;
		System.out.println("나이는 " + age[count_person] + "입니다.");
		if(age[count_person]<7) k=0;
		else if(age[count_person]>=7&&age[count_person]<13) k=1;
		else if(age[count_person]>=13&&age[count_person]<20) k=2;
		else if(age[count_person]>=20&&age[count_person]<30) k=3;
		else if(age[count_person]>=30&&age[count_person]<60) k=4;
		else k=5;
		return k;
	}
	public void printAge() {
		String name[] = {"유아는","어린이는","청소년은","청년은","중년은","노년은"};
		for(int i=0;i<name.length;i++) {
			System.out.printf(name[i] + " %d명 입니다.\n",count[i]);
		}
	}
}
