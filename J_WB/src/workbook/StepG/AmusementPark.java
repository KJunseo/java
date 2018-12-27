package workbook.StepG;

import java.util.Scanner;

public class AmusementPark {
	private int team_count;
	private int count[] = new int[4];
	private int v_count[] = new int[4];
	private int total_count = 0;
	private int sum;
	private int total_sum=0;
	private int membership=0;
	
	public AmusementPark() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("오늘 방문한 팀 수를 입력하세요. ");
		this.team_count = s.nextInt();
		for(int i=0;i<team_count;i++) {
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요. ", i+1);
			for(int j=0;j<count.length;j++) {
				this.count[j] = s.nextInt();
				total_count = total_count + count[j];
				v_count[j] = v_count[j]+count[j];
			}
			System.out.printf("%d번팀 할인카드 종류(카드없음: 0, 일반등급: 1, VIP등급: 2)를 입력하세요.",i+1);
			this.membership = s.nextInt();
			sum = calculate();
			System.out.printf("%d번팀 입장료는 %d원 입니다.\n", i+1,sum);
			total_sum = total_sum+sum;
			sum=0;
		}
		
	}
	int calculate() {
		int charge[] = {5000,10000,15000,3000};
		for(int i=0;i<team_count;i++) 
			sum = sum + count[i]*charge[i];
		if(membership==1) sum=(int)(sum*0.9);
		else if(membership==2) sum = (int)(sum*0.8);
		return this.sum;
	}
	public void printFee() {
		String member [] = {"초등학생","청소년","일반인","경로대상"};
		System.out.println();
		System.out.printf("오늘 총 방문자 수는 %d명 입니다.\n", total_count);
		for(int i=0;i<member.length;i++) {
			System.out.printf(member[i]+" 수는 %d명 입니다.\n",v_count[i]);
		}
		System.out.println();
		System.out.printf("총 입장료는 %d원 입니다.\n",total_sum);
	}
}
