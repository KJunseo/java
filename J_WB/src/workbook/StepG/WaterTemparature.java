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
			System.out.printf("%d�� ���� �µ��� �Է��Ͻÿ�. ", i+1);
			degrees[i] = s.nextDouble();
			if(degrees[i]<0) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
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
		String degree_name[] = {"�ü�","�̿¼�","�¼�","���¹�"};
		for(int i=0;i<degrees.length;i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. ", i+1, degrees[i]);
			count[getDegreeSection(degrees[i])]++;
			System.out.println(degree_name[getDegreeSection(degrees[i])]);
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" �Է� Ƚ��: %d\n", count[i]);
		}
	}
}
