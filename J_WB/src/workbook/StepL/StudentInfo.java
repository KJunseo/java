package workbook.StepL;

import java.util.*;

public class StudentInfo {
	Scanner s = new Scanner(System.in);
	ArrayList<Student> st = new ArrayList<Student>();
	
	int total_num = 0;
	String name;
	int id;
	String gender;
	String address;
	int phone;
	String go_back;
	Student student;
	
	public StudentInfo() {
		while(true) {
			System.out.println("----------------------------------------------------------");
			System.out.printf("1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
			int select = s.nextInt();
			System.out.println("----------------------------------------------------------");
			switch(select) {
			case 1:
				enroll();
				st.add(student);
				total_num++;
				System.out.printf("총 %d명이 등록되었습니다.\n", total_num);
				break;
			case 2:
				edit();
				System.out.println("수정되었습니다.");
				break;
			case 3:
				delete();
				break;
			case 4:
				show();
				System.out.printf("총 %d명이 등록되었습니다.\n", total_num);
				break;
			case 5:
				search_name();
				break;
			case 6:
				checkReturn();
				break;
			case 7:
				search_address();
				break;
			case 8:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	void enroll() {
		System.out.printf("학생이름, 학번, 성별을 입력하세요: ");
		name = s.next();
		id = s.nextInt();
		gender = s.next();
		System.out.printf("주소를 입력하세요: ");
		s.nextLine();
		address = s.nextLine();
		System.out.printf("전화번호를 입력하세요: ");
		phone = s.nextInt();
		System.out.printf("복학생 입니까?(Y/N) ");
		go_back = s.next();
		student = new Student(name, id, gender, address, phone, go_back);
	}
	void show() {
		System.out.printf("번호\t이름\t   학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
			System.out.println();
		}
	}
	void edit() {
		show();
		System.out.printf("==> 수정하실 번호를 입력하세요: ");
		int choice = s.nextInt();
		enroll();
		st.get(choice-1).name = name;
		st.get(choice-1).ID = id;
		st.get(choice-1).gender = gender;
		st.get(choice-1).address = address;
		st.get(choice-1).phone_num = phone;
		st.get(choice-1).returning = go_back;
	}
	void delete() {
		System.out.printf("==> 삭제하실 번호를 입력하세요: ");
		int num = s.nextInt();
		System.out.printf("정말로 삭제하시겠습니까?(Y/N) ");
		String ans = s.next();
		if(ans.equalsIgnoreCase("y")) {
			st.remove(st.get(num-1));
			System.out.println("삭제되었습니다.");
		}
		total_num--;
	}
	void checkReturn() {
		int returning=0;
		System.out.printf("번호\t이름\t   학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			if(st.get(i).returning.equalsIgnoreCase("y")) {
				returning++;
				System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
				System.out.println();
			}
		}
		System.out.printf("복학생은 %d명 입니다.\n", returning);
	}
	void search_name() {
		System.out.printf("검색하실 이름을 입력하세요: ");
		String search = s.next();
		System.out.println("검색되었습니다.\n");
		System.out.printf("번호\t이름\t   학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			if(st.get(i).name.indexOf(search)>-1) {
				System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
				System.out.println();
			}
		}
	}
	void search_address() {
		System.out.printf("검색하실 주소를 입력하세요: ");
		s.nextLine();
		String search = s.nextLine();
		System.out.printf("번호\t이름\t   학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
		for(int i=0;i<st.size();i++) {
			if(st.get(i).address.indexOf(search)>-1) {
				System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
				System.out.println();
			}
		}
	}
}
