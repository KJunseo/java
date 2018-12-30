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
	int getDegreeSection(int degree) {
		int sel;
		if(degrees[degree]>=0&&degrees[degree]<25) sel=0;
		else if(degrees[degree]>=25&&degrees[degree]<40) sel=1;
		else if(degrees[degree]>=40&&degrees[degree]<80) sel=2;
		else sel=3;
		return sel;
		
	}
	public void printWater() {
		int count[] = {0,0,0,0};
		String degree_name[] = {"�ü�","�̿¼�","�¼�","���¹�"};
		for(int i=0;i<degrees.length;i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. ", i+1, degrees[i]);
			count[getDegreeSection(i)]++;
			System.out.println(degree_name[getDegreeSection(i)]);
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" �Է� Ƚ��: %d\n", count[i]);
		}
	}
}
