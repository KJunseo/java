package workbook.StepG;

import java.util.Scanner;

public class CalculateAge {
	
	private int age[] = new int[100];
	private int count_person;
	private int count_baby;
	private int count_child;
	private int count_youth;
	private int count_young;
	private int count_adult;
	private int count_old;
	
	public CalculateAge() {
		input();
	}
	void input() {
		int birth_year;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<age.length;i++) {
			System.out.printf("%d 번째 사람의 태어난 년도를 입력하시오. ",i+1);
			birth_year = s.nextInt();
			if(birth_year>2018) break;
			age[i] = 2018 - birth_year +1;
			if(age[i]<7) count_baby++;
			else if(age[i]>=7&&age[i]<13) count_child++;
			else if(age[i]>=13&&age[i]<20) count_youth++;
			else if(age[i]>=20&&age[i]<30) count_young++;
			else if(age[i]>=30&&age[i]<60) count_adult++;
			else count_old++;
			count_person++;
		}
	}

	public void printAge() {
		for(int i=0;i<count_person;i++) {
			System.out.printf("%d 번째 사람의 나이는 %d 입니다.\n", i+1,age[i]);
		}
		System.out.printf("유아는 %d명 입니다.\n",count_baby);
		System.out.printf("어린이는 %d명 입니다.\n",count_child);
		System.out.printf("청소년은 %d명 입니다.\n",count_youth);
		System.out.printf("청년은 %d명 입니다.\n",count_young);
		System.out.printf("중년은 %d명 입니다.\n",count_adult);
		System.out.printf("노년은 %d명 입니다.\n",count_old);
	}
}
