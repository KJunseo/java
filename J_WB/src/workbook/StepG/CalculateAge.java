package workbook.StepG;

import java.util.Scanner;

public class CalculateAge {
	
	private int age[] = new int[100];
	private int count[]= {0,0,0,0,0,0};
	private int count_person;
	
	public CalculateAge() {
		input();
	}
	void input() {
		int birth_year;
		int k=0;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<age.length;i++) {
			System.out.printf("%d ��° ����� �¾ �⵵�� �Է��Ͻÿ�. ",i+1);
			birth_year = s.nextInt();
			if(birth_year>2018) break;
			age[i] = 2018 - birth_year +1;
			if(age[i]<7) k=0;
			else if(age[i]>=7&&age[i]<13) k=1;
			else if(age[i]>=13&&age[i]<20) k=2;
			else if(age[i]>=20&&age[i]<30) k=3;
			else if(age[i]>=30&&age[i]<60) k=4;
			else k=5;
			count[k]++;
			count_person++;
		}
	}
	public void printAge() {
		String name[] = {"���ƴ�","��̴�","û�ҳ���","û����","�߳���","�����"};
		for(int i=0;i<count_person;i++) {
			System.out.printf("%d ��° ����� ���̴� %d �Դϴ�.\n", i+1,age[i]);
		}
		for(int i=0;i<name.length;i++) {
			System.out.printf(name[i] + " %d�� �Դϴ�.\n",count[i]);
		}
	}
}
