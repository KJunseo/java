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
			System.out.printf("1)�л���� 2)�������� 3)���� 4)����Ʈ 5)�̸��˻� 6)���л�����Ʈ 7)�ּҰ˻� 8)���� ==> ");
			int select = s.nextInt();
			System.out.println("----------------------------------------------------------");
			switch(select) {
			case 1:
				enroll();
				st.add(student);
				total_num++;
				System.out.printf("�� %d���� ��ϵǾ����ϴ�.\n", total_num);
				break;
			case 2:
				edit();
				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 3:
				delete();
				break;
			case 4:
				show();
				System.out.printf("�� %d���� ��ϵǾ����ϴ�.\n", total_num);
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
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
		}
	}
	void enroll() {
		System.out.printf("�л��̸�, �й�, ������ �Է��ϼ���: ");
		name = s.next();
		id = s.nextInt();
		gender = s.next();
		System.out.printf("�ּҸ� �Է��ϼ���: ");
		s.nextLine();
		address = s.nextLine();
		System.out.printf("��ȭ��ȣ�� �Է��ϼ���: ");
		phone = s.nextInt();
		System.out.printf("���л� �Դϱ�?(Y/N) ");
		go_back = s.next();
		student = new Student(name, id, gender, address, phone, go_back);
	}
	void show() {
		System.out.printf("��ȣ\t�̸�\t   �й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
			System.out.println();
		}
	}
	void edit() {
		show();
		System.out.printf("==> �����Ͻ� ��ȣ�� �Է��ϼ���: ");
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
		System.out.printf("==> �����Ͻ� ��ȣ�� �Է��ϼ���: ");
		int num = s.nextInt();
		System.out.printf("������ �����Ͻðڽ��ϱ�?(Y/N) ");
		String ans = s.next();
		if(ans.equalsIgnoreCase("y")) {
			st.remove(st.get(num-1));
			System.out.println("�����Ǿ����ϴ�.");
		}
		total_num--;
	}
	void checkReturn() {
		int returning=0;
		System.out.printf("��ȣ\t�̸�\t   �й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			if(st.get(i).returning.equalsIgnoreCase("y")) {
				returning++;
				System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
				System.out.println();
			}
		}
		System.out.printf("���л��� %d�� �Դϴ�.\n", returning);
	}
	void search_name() {
		System.out.printf("�˻��Ͻ� �̸��� �Է��ϼ���: ");
		String search = s.next();
		System.out.println("�˻��Ǿ����ϴ�.\n");
		System.out.printf("��ȣ\t�̸�\t   �й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			if(st.get(i).name.indexOf(search)>-1) {
				System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
				System.out.println();
			}
		}
	}
	void search_address() {
		System.out.printf("�˻��Ͻ� �ּҸ� �Է��ϼ���: ");
		s.nextLine();
		String search = s.nextLine();
		System.out.printf("��ȣ\t�̸�\t   �й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�\n");
		for(int i=0;i<st.size();i++) {
			if(st.get(i).address.indexOf(search)>-1) {
				System.out.printf("%d\t"+st.get(i).name + "\t  %d\t" + st.get(i).gender + "\t" + st.get(i).address + "\t%d\t" + st.get(i).returning,i+1,st.get(i).ID,st.get(i).phone_num);  
				System.out.println();
			}
		}
	}
}
