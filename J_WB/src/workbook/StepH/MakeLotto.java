package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class MakeLotto {
	private int lotto[] = new int[6];

	public MakeLotto() {
		input();
	}
	void input() {
		int count=0;
		Random r = new Random();
		for(int i=0;i<lotto.length;i++) {
			this.lotto[i] = r.nextInt(45)+1;
			for(int j=0;j<count;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					count--;
				}
			}
			count++;
		}
	}
	public void printLotto() {
		String onemore;
		Scanner s = new Scanner(System.in);
		while(true) {	
			System.out.printf("������ �ζ� ��ȣ��");
			for(int i=0;i<lotto.length;i++) {
				System.out.printf(" %d ", lotto[i]);
			}
			System.out.println("�Դϴ�.");
			System.out.printf("�� ����ðڽ��ϱ�? (Y/N) ");
			onemore = s.next();
			if(onemore.equalsIgnoreCase("N"))break;
			else if(onemore.equalsIgnoreCase("Y")) input();
		}
	}
}
