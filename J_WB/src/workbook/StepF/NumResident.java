package workbook.StepF;

import java.util.Scanner;

public class NumResident {
	private int [][]number = new int[5][3];
	
	public NumResident() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf((i+1)+"0"+(j+1)+"호에 살고 있는 사람의 숫자를 입력하시오. ");
				this.number[i][j] = s.nextInt();
			}
		}
	}
	int getTotal() {
		int total=0;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<3;j++) {
				total = total + number[i][j];
			}	
		}
		return total;
	}
	public void printNum() {
		System.out.println("이 아파트에 사는 거주자는 모두 "+getTotal()+"명 입니다.");
	}

}
