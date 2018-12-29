package workbook.StepI;

import java.util.Scanner;

public class JudgementObesity {

	public JudgementObesity() {
		input();
	}
	void askBiman(int height, int weight) {
		double judge = weight/((height*0.01)*(height*0.01));
		if(judge<18.5) System.out.println("저체중 입니다.");
		else if(judge>=18.5&&judge<23) System.out.println("정상 입니다.");
		else if(judge>=23&&judge<25) System.out.println("과체중 입니다.");
		else if(judge>=25&&judge<30) System.out.println("경도비만 입니다.");
		else if(judge>=30) System.out.println("고도비만 입니다.");
	}
	void input() {
		int height;
		int weight;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오. ",i+1);
			height = s.nextInt();
			weight = s.nextInt();
			askBiman(height,weight);
		}
	}
}
