package workbook.StepF;

import java.util.Scanner;

public class NumResident2 {
	private int [][] number = new int[5][3];
	private int [] floor_total = new int[5];
	private int [] line_total = new int[3];
	private int total;
	
	public NumResident2() {
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
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<3;j++) {
				total = total + number[i][j];
			}	
		}
		return this.total;
	}
	int getFloor(int i) {
		for(int j=0;j<3;j++) {
			floor_total[i] = floor_total[i] + number[i][j];
		}
		return this.floor_total[i];
	}
	int getLine(int i) {
			for(int j=0;j<number.length;j++) {
				line_total[i] = line_total[i] + number[j][i];
			}
			return this.line_total[i];
	}
	public void printNum() {
		for(int i=0;i<number.length;i++) {
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n",(i+1),getFloor(i));
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n",(i+1),getLine(i));
		}
		System.out.println();
		System.out.println("이 아파트에 사는 거주자는 모두 "+getTotal()+"명 입니다.");
	}
}
