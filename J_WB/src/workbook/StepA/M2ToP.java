package workbook.StepA;

import java.util.Scanner;

public class M2ToP {
	private double m2_area;
	private double pyung_area;
	
	public M2ToP() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����Ʈ�� ���� ������ �Է��Ͻÿ�. ");
		this.m2_area = s.nextDouble();
	}
	void printP() {
		System.out.printf("����Ʈ�� ������ %.1f�Դϴ�.\n",getP());
	}
	double getP() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
}
