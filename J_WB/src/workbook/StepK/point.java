package workbook.StepK;

import java.util.Scanner;

public class point {
	final static int NUMBEROFCOORDINATE = 4;
	double x[];
	double y[];
	int count[]= {0,0,0,0};
	
	public point(int num) {
		x = new double[num];
		y = new double[num];
	}
	void input(int n) {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.printf("��ǥ�� X, Y ���� �Է��Ͻÿ� --> ");
			x[i] = s.nextDouble();
			y[i] = s.nextDouble();
		}
	}
	void show(int n) {
		System.out.println("===============================");
		for(int i=0;i<n;i++) {
			System.out.printf("%d��° ��ǥ�� %d��и鿡 ��ġ�մϴ�.\n",i+1,get_area(x[i],y[i]));
			count[get_area(x[i],y[i])-1]++;
		}
		for(int i=0;i<NUMBEROFCOORDINATE;i++) {
			System.out.printf("%d��и��� ��ǥ�� ��� %d�� �Դϴ�.\n", i+1,count[i]);
		}
	}
	int get_area(double x, double y) {
		if(x==0||y==0) return 0;
		else if(x>0&&y>0) return 1;
		else if(x<0&&y>0) return 2;
		else if(x<0&&y<0) return 3;
		else return 4;
	}
}
