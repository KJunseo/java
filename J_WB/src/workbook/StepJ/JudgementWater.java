package workbook.StepJ;

import java.util.Scanner;

public class JudgementWater {
	private double water[] = new double[10];
	
	public JudgementWater() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<water.length;i++) {
			System.out.printf("%d번 물의 온도를 입력하시오. ", i+1);
			water[i] = s.nextDouble();
			if(water[i]<0) {
				System.out.println("잘못 입력 하셨습니다.");
				i--;
			}
		}
	}
	byte askWater(double degree) {
		byte k;
		if(degree>=0&&degree<25) k=0;
		else if(degree>=25&&degree<40) k=1;
		else if(degree>=40&&degree<80) k=2;
		else k=3;
		return k;
	}
	public void printWater() {
		int count[] = {0,0,0,0};
		String degree_name[] = {"냉수","미온수","온수","끓는물"};
		for(int i=0;i<water.length;i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다. \n", i+1, water[i]);
			count[askWater(water[i])]++;
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" 입력 횟수: %d 입니다.\n", count[i]);
		}
	}
}
