package workbook.StepK;

import java.util.Scanner;

public class Student {
	static final int NUMBEROFSUBJECT=3;
	int jumsu[][];
	int sum = 0;
	double average = 0;
	
	public Student(int num) {
		jumsu = new int[num][NUMBEROFSUBJECT];
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf("%d�� �л��� ����, ����, ���� ������? ",i+1);
			for(int j=0;j<NUMBEROFSUBJECT;j++) {
				jumsu[i][j]=s.nextInt();
			}
		}
	}
	int getSum(int i) {
		sum=0;
		for(int j=0;j<NUMBEROFSUBJECT;j++)
			sum = sum + jumsu[i][j];
		return this.sum;
	}
	double getAvg(int i) {
		average=0;
		for(int j=0;j<NUMBEROFSUBJECT;j++) {
			average = (double)getSum(i)/3.0;
		}
		return this.average;
	}
	int get_grade(int i) {
		if(getAvg(i)>=90)return 0;
		else if(getAvg(i)>=80&&getAvg(i)<90)return 1;
		else if(getAvg(i)>=70&&getAvg(i)<80)return 2;
		else if(getAvg(i)>=60&&getAvg(i)<70)return 3;
		else return 4;
	}
	void print(int index) {
		String grade[] = {"A","B","C","D","F"};
		System.out.println("==============================");
		System.out.printf("��ϵ� %d���� �л� ����� ������ �����ϴ�.\n", jumsu.length);
		System.out.println("------------------------------");
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t����");
		for(int i=0;i<index;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t"+grade[get_grade(i)]+"\n",i+1,jumsu[i][0],jumsu[i][1],jumsu[i][2],getSum(i),getAvg(i));
			sum=0;
			average=0;
		}
	}
}
