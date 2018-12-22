package workbook.StepF;

import java.util.Scanner;

public class NumResident2 {
	private int [][] number = new int[5][3];
	
	public NumResident2() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf((i+1)+"0"+(j+1)+"ȣ�� ��� �ִ� ����� ���ڸ� �Է��Ͻÿ�. ");
				this.number[i][j] = s.nextInt();
			}
		}
	}
	int getTotal() {
		int total=0;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<3;j++) {
				total = total + number[i][j];
			}	
		}
		return total;
	}
	int getFloor(int i) {
		int [] floor_total = new int[5];
		for(int j=0;j<3;j++) {
			floor_total[i] = floor_total[i] + number[i][j];
		}
		return floor_total[i];
	}
	int getLine(int i) {
		int [] line_total = new int[3];
		for(int j=0;j<number.length;j++) {
			line_total[i] = line_total[i] + number[j][i];
		}
		return line_total[i];
	}
	public void printNum() {
		for(int i=0;i<number.length;i++) {
			System.out.printf("%d���� ��� �����ڴ� ��� %d�� �Դϴ�.\n",(i+1),getFloor(i));
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.printf("%dȣ ���ο� ��� �����ڴ� ��� %d�� �Դϴ�.\n",(i+1),getLine(i));
		}
		System.out.println();
		System.out.println("�� ����Ʈ�� ��� �����ڴ� ��� "+getTotal()+"�� �Դϴ�.");
	}
}
