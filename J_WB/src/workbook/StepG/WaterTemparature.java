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
	public void printWater() {
		int sel;
		int count[] = {0,0,0,0};
		String degree_name[] = {"냉수","미온수","온수","끓는물"};
		for(int i=0;i<degrees.length;i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다. ", i+1, degrees[i]);
			if(degrees[i]>=0&&degrees[i]<25) {
				sel=0;
				count[0]++;
			}
			else if(degrees[i]>=25&&degrees[i]<40) {
				sel=1;
				count[1]++;
			}
			else if(degrees[i]>=40&&degrees[i]<80) {
				sel=2;
				count[2]++;
			}
			else {
				sel=3;
				count[3]++;
			}
			System.out.println(degree_name[sel]);
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" 입력 횟수: %d\n", count[i]);
		}
	}
}
