package workbook.StepH;

import java.util.Scanner;

public class SquareCombination {
	private int number[] = new int[5];
	
	public SquareCombination() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("2에서 9사이의 숫자 5개를 입력하세요." );
		for(int i=0;i<5;i++) {
			this.number[i]=s.nextInt();
		}
	}
	public void printResult() {
		int max_a=2;
		int max_b=2;
		int min_a=9;
		int min_b=9;
		double max=Math.pow(max_a, max_b);
		double min=Math.pow(min_a, min_b);
		
		for(int i=0;i<number.length;i++)
			for(int j=0;j<number.length;j++) {
				if(number[i]==number[j]) continue;
				if(Math.pow(number[i],number[j])>max) {
					max = Math.pow(number[i],number[j]);
					max_a = number[i];
					max_b = number[j];
				}
				if(Math.pow(number[i],number[j])<min) {
					min = Math.pow(number[i],number[j]);
					min_a = number[i];
					min_b = number[j];
				}
			}
		System.out.println();
		System.out.println("입력하신 5개의 수로 제곱수를 만들면...");
		System.out.printf("가장 큰 수는 %d의 %d승인 %d 입니다.\n", max_a,max_b,(int)max);
		System.out.printf("가장 작은 수는 %d의 %d승인 %d 입니다.\n", min_a,min_b,(int)min);
	}
}
