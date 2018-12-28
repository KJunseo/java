package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
	private int coins;
	
	public SlotMachine() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("사용하실 코인의 개수를 입력하세요. ");
		this.coins = s.nextInt();
	}
	public void Game() {
		int number[] = new int[3];
		int check=0;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		for(int i=0;0<coins;i++) {
			System.out.printf("게임 %d회 Start!!! (아무 숫자나 입력하세요.) ",i+1);
			coins--;
			int dummy = s.nextInt();
			for(int j=0;j<number.length;j++) {
				number[j]=r.nextInt(9)+1;
				for(int k=0;k<j;k++) {
					if(number[j]==number[k]) {
						coins=coins+2;
						check++;
					}
					if(check==2)coins=coins-2;
				}
			}
			System.out.printf("게임 결과: %d %d %d",number[0],number[1],number[2]);
			if(check==0)
				System.out.printf("----> 꽝입니다... 아쉽군요\n");
			else if(check==1)
				System.out.printf("----> 숫자 2개 일치... 코인 2개 증정\n");
			else 
				System.out.printf("----> 숫자 3개 일치... 코인 4개 증정\n");
			check=0;
			System.out.println(coins);
		}
		System.out.println("남아있는 코인은 0개입니다.\n");
		System.out.println("게임종료!!");
	}
	
}
