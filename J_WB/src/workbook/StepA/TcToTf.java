package workbook.StepA;

import java.util.Scanner;

public class TcToTf {
	private double c_degree;
	private double f_degree;
	
	public TcToTf(){input();}
	public void printTf() {
		System.out.printf("ȭ�� �µ��� %.1f�Դϴ�.\n", getTf());
	}	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �µ��� �Է��Ͻÿ�");
		this.c_degree = s.nextDouble();
	}	
	double getTf() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}
	
}
