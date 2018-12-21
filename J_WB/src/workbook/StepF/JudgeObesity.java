package workbook.StepF;

import java.util.Scanner;

public class JudgeObesity {
	private double bmi;
	private int [][] bmilist = new int [10][3];
	private int count;
	
	public JudgeObesity() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<bmilist.length;i++) {
			System.out.printf((i+1) + "번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ");
			for(int j=0;j<2;j++) {
				this.bmilist[i][j] = s.nextInt();
			}
		}
	}
	double getBmi(int i) {
		bmi = bmilist[i][1]/((bmilist[i][0]*0.01)*(bmilist[i][0]*0.01));
		return bmi;
	}
	public void printObesity() {
		for(int i=0;i<bmilist.length;i++) {
			if(getBmi(i)>=25) {
				System.out.printf((i+1) + "번째 사람은 비만입니다.\n");
				count++;
			}
		}
		System.out.printf("총 %d명의 사람이 비만입니다.\n",count);
	}
}
