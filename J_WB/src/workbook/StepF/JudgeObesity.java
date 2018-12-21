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
			System.out.printf((i+1) + "��° ����� ����(cm)�� ü��(kg)�� �Է��Ͻÿ�. ");
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
				System.out.printf((i+1) + "��° ����� ���Դϴ�.\n");
				count++;
			}
		}
		System.out.printf("�� %d���� ����� ���Դϴ�.\n",count);
	}
}
