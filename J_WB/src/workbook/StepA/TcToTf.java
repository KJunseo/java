package workbook.StepA;

import java.util.Scanner;

public class TcToTf {
	private double c_degree;
	private double f_degree;
	
	public TcToTf(){input();}
	public void printTf() {
		System.out.printf("화씨 온도는 %.1f입니다.\n", getTf());
	}	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("섭씨 온도를 입력하시오");
		this.c_degree = s.nextDouble();
	}	
	double getTf() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}
	
}
