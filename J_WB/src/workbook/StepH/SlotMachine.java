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
		System.out.printf("����Ͻ� ������ ������ �Է��ϼ���. ");
		this.coins = s.nextInt();
	}
	public void Game() {
		int number[] = new int[3];
		int check=0;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		for(int i=0;0<coins;i++) {
			System.out.printf("���� %dȸ Start!!! (�ƹ� ���ڳ� �Է��ϼ���.) ",i+1);
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
			System.out.printf("���� ���: %d %d %d",number[0],number[1],number[2]);
			if(check==0)
				System.out.printf("----> ���Դϴ�... �ƽ�����\n");
			else if(check==1)
				System.out.printf("----> ���� 2�� ��ġ... ���� 2�� ����\n");
			else 
				System.out.printf("----> ���� 3�� ��ġ... ���� 4�� ����\n");
			check=0;
			System.out.println(coins);
		}
		System.out.println("�����ִ� ������ 0���Դϴ�.\n");
		System.out.println("��������!!");
	}
	
}
