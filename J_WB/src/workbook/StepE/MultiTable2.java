package workbook.StepE;

import java.util.Scanner;

public class MultiTable2 {
	private int mode;
	private int column;
	
	public MultiTable2() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("구구단의 출력모드(1: 홀수단, 2:짝수단)를 입력하시오. ");
		this.mode = s.nextInt();
		System.out.printf("힌 즐에 출력할 갯수를 입력하시오. ");
		this.column = s.nextInt();
	}
	public void printTable() {
		if(mode==1) {
			for(int i=1;i<5;i++) {
				for(int j=1;j<10;j++) {
						System.out.printf("%d x %d = %-4d",i*2+1,j,(i*2+1)*j);
						System.out.printf("  ");
						if(j%column==0) {
							System.out.println();
						}
				}
				System.out.println();
			}
		}
		else if(mode==2) {
			for(int i=1;i<5;i++) {
				for(int j=1;j<10;j++) {
					System.out.printf("%d x %d = %-4d",i*2,j,(i*2)*j);
						System.out.printf("  ");
						if(j%column==0) {
							System.out.println();
						}
				}
				System.out.println();
			}
		}	

	}
}
