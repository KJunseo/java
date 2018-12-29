package workbook.StepI;

import java.util.Random;

public class RandomSection {
	private int count[] = {0,0,0};
	private String name[] = {"대 (70이상)","중 (40이상)","소 (40미만)"};
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
		System.out.println("10개의 숫자를 생성합니다.");
		for(check=0;check<10;check++) {
			num[check]=r.nextInt(100)+1;
			System.out.printf("생성된 임의의 숫자는 %d입니다.\n", num[check]);
			count[getRandom()]++;
		}
	}
	public void printSection() {
		System.out.println();
		for(int i=0;i<name.length;i++) 
			System.out.printf("%d. " + name[i] + ": " + count[i] + "회 생성\n", i+1);
	}
}
