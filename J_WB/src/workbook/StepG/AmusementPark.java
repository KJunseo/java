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
		System.out.printf("���� �湮�� �� ���� �Է��ϼ���. ");
		this.team_count = s.nextInt();
		for(int i=0;i<team_count;i++) {
			System.out.printf("%d���� �ο���(�ʵ��л�, û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ���. ", i+1);
			for(int j=0;j<count.length;j++) {
				this.count[j] = s.nextInt();
				total_count = total_count + count[j];
				v_count[j] = v_count[j]+count[j];
			}
			System.out.printf("%d���� ����ī�� ����(ī�����: 0, �Ϲݵ��: 1, VIP���: 2)�� �Է��ϼ���.",i+1);
			this.membership = s.nextInt();
			sum = calculate();
			System.out.printf("%d���� ������ %d�� �Դϴ�.\n", i+1,sum);
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
		String member [] = {"�ʵ��л�","û�ҳ�","�Ϲ���","��δ��"};
		System.out.println();
		System.out.printf("���� �� �湮�� ���� %d�� �Դϴ�.\n", total_count);
		for(int i=0;i<member.length;i++) {
			System.out.printf(member[i]+" ���� %d�� �Դϴ�.\n",v_count[i]);
		}
		System.out.println();
		System.out.printf("�� ������ %d�� �Դϴ�.\n",total_sum);
	}
}
