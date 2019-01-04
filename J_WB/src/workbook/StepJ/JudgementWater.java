package workbook.StepJ;

import java.util.Scanner;

public class JudgementWater {
	private double water[] = new double[10];
	
	public JudgementWater() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<water.length;i++) {
			System.out.printf("%d�� ���� �µ��� �Է��Ͻÿ�. ", i+1);
			water[i] = s.nextDouble();
			if(water[i]<0) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				i--;
			}
		}
	}
	byte askWater(double degree) {
		byte k;
		if(degree>=0&&degree<25) k=0;
		else if(degree>=25&&degree<40) k=1;
		else if(degree>=40&&degree<80) k=2;
		else k=3;
		return k;
	}
	public void printWater() {
		int count[] = {0,0,0,0};
		String degree_name[] = {"�ü�","�̿¼�","�¼�","���¹�"};
		for(int i=0;i<water.length;i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. \n", i+1, water[i]);
			count[askWater(water[i])]++;
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" �Է� Ƚ��: %d �Դϴ�.\n", count[i]);
		}
	}
}
