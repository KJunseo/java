package workbook.StepI;

import java.util.Scanner;

public class JudgementObesity {

	public JudgementObesity() {
		input();
	}
	void askBiman(int height, int weight) {
		double judge = weight/((height*0.01)*(height*0.01));
		if(judge<18.5) System.out.println("��ü�� �Դϴ�.");
		else if(judge>=18.5&&judge<23) System.out.println("���� �Դϴ�.");
		else if(judge>=23&&judge<25) System.out.println("��ü�� �Դϴ�.");
		else if(judge>=25&&judge<30) System.out.println("�浵�� �Դϴ�.");
		else if(judge>=30) System.out.println("���� �Դϴ�.");
	}
	void input() {
		int height;
		int weight;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d��° ����� ����(cm)�� ü��(kg)�� �Է��Ͻÿ�. ",i+1);
			height = s.nextInt();
			weight = s.nextInt();
			askBiman(height,weight);
		}
	}
}
