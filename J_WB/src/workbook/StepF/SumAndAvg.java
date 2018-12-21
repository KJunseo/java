package workbook.StepF;

import java.util.Scanner;

public class SumAndAvg {
	private int [][] jumsu = new int[5][3];
	private int [] sum = new int[3];
	private double [] average = new double[3];
	private int kor;
	private int eng;
	private int mat;
	
	public SumAndAvg() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<jumsu.length;i++) {
			System.out.printf((i+1) + "�� �л� ����, ����, ���� ������ �Է��Ͻÿ�. ");
			for(int j=0;j<3;j++) {
				this.jumsu[i][j]= s.nextInt();
			}
		}
	}
	void getSum() {
		for(int i=0;i<jumsu.length;i++) {
			for(int j=0;j<3;j++) {
				sum[j] = sum[j] + jumsu[i][j];
			}
		}
		kor = sum[0];
		eng = sum[1];
		mat = sum[2];
	}
	double getAvg(int i) {
			average[i] = (double)sum[i]/jumsu.length;
			return this.average[i];
	}
	public void printSV() {
		getSum();
		System.out.printf("������ ������ %d �̰�, ����� %.1f �Դϴ�.\n",kor,getAvg(0));
		System.out.printf("������ ������ %d �̰�, ����� %.1f �Դϴ�.\n",eng,getAvg(1));
		System.out.printf("������ ������ %d �̰�, ����� %.1f �Դϴ�.\n",mat,getAvg(2));
	}
}
