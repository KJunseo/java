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
			System.out.printf("%d번 학생의 아이디, 비밀번호를 입력하시오 --> ",i+1);
			ID[i] = s.next();
			password[i] = s.next();
		}
	}
	void print(int index) {
		System.out.println("==============================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("------------------------------");
		System.out.println("번호\t아이디\t비밀번호");
		for(int i=0;i<index;i++) {
			System.out.printf("%d\t"+ID[i]+"\t"+password[i]+"\n",i+1);
		}
	}
}
