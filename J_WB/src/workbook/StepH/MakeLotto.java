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
			System.out.printf("생성된 로또 번호는");
			for(int i=0;i<lotto.length;i++) {
				System.out.printf(" %d ", lotto[i]);
			}
			System.out.println("입니다.");
			System.out.printf("더 만드시겠습니까? (Y/N) ");
			onemore = s.next();
			if(onemore.equalsIgnoreCase("N"))break;
			else if(onemore.equalsIgnoreCase("Y")) input();
		}
	}
}
