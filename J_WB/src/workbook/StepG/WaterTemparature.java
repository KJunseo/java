package workbook.StepG;

import java.util.Scanner;

public class WaterTemparature {
	private double degrees[] = new double[10];
	
	public WaterTemparature() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<degrees.length;i++) {
			System.out.printf("%d번 물의 온도를 입력하시오. ", i+1);
			degrees[i] = s.nextDouble();
			if(degrees[i]<0) {
				System.out.println("잘못 입력 하셨습니다.");
				i--;
			}
		}
	}
	int getDegreeSection(double degree) {
		if(degree>=0&&degree<25) return 0;
		else if(degree>=25&&degree<40) return 1;
		else if(degree>=40&&degree<80) return 2;
		else return 3;	
	}
	public void printWater() {
		int count[] = {0,0,0,0};
		String degree_name[] = {"냉수","미온수","온수","끓는물"};
		for(int i=0;i<degrees.length;i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다. ", i+1, degrees[i]);
			count[getDegreeSection(degrees[i])]++;
			System.out.println(degree_name[getDegreeSection(degrees[i])]);
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" 입력 횟수: %d\n", count[i]);
		}
	}
}
