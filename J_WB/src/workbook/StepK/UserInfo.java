package workbook.StepK;

import java.util.Scanner;

public class UserInfo {
	String ID[];
	String password[];
	
	public UserInfo(int num) {
		ID = new String[num];
		password = new String[num];
	}
	void input(int n) {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.printf("%d�� �л��� ���̵�, ��й�ȣ�� �Է��Ͻÿ� --> ",i+1);
			ID[i] = s.next();
			password[i] = s.next();
		}
	}
	void print(int index) {
		System.out.println("==============================");
		System.out.println("��ϵ� �л� ����� ������ �����ϴ�.");
		System.out.println("------------------------------");
		System.out.println("��ȣ\t���̵�\t��й�ȣ");
		for(int i=0;i<index;i++) {
			System.out.printf("%d\t"+ID[i]+"\t"+password[i]+"\n",i+1);
		}
	}
}
