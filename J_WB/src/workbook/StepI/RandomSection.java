package workbook.StepI;

import java.util.Random;

public class RandomSection {
	private int count[] = {0,0,0};
	private String name[] = {"�� (70�̻�)","�� (40�̻�)","�� (40�̸�)"};
	private int num[]=new int[10];
	private int check;
	
	public RandomSection() {
		input();
	}
	byte getRandom() {
		byte k=0;
		if(num[check]>=70) k=0;
		else if(num[check]>=40) k=1;
		else if(num[check]<40) k=2;
		return k;
	}
	void input() {
		Random r = new Random();
		System.out.println("10���� ���ڸ� �����մϴ�.");
		for(check=0;check<10;check++) {
			num[check]=r.nextInt(100)+1;
			System.out.printf("������ ������ ���ڴ� %d�Դϴ�.\n", num[check]);
			count[getRandom()]++;
		}
	}
	public void printSection() {
		System.out.println();
		for(int i=0;i<name.length;i++) 
			System.out.printf("%d. " + name[i] + ": " + count[i] + "ȸ ����\n", i+1);
	}
}
