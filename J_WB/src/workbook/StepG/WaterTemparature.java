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
	public void printWater() {
		int sel;
		int count[] = {0,0,0,0};
		String degree_name[] = {"�ü�","�̿¼�","�¼�","���¹�"};
		for(int i=0;i<degrees.length;i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. ", i+1, degrees[i]);
			if(degrees[i]>=0&&degrees[i]<25) {
				sel=0;
				count[0]++;
			}
			else if(degrees[i]>=25&&degrees[i]<40) {
				sel=1;
				count[1]++;
			}
			else if(degrees[i]>=40&&degrees[i]<80) {
				sel=2;
				count[2]++;
			}
			else {
				sel=3;
				count[3]++;
			}
			System.out.println(degree_name[sel]);
		}
		for(int i=0;i<degree_name.length;i++) {
			System.out.printf(degree_name[i]+" �Է� Ƚ��: %d\n", count[i]);
		}
	}
}
