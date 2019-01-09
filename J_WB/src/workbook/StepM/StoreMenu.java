package workbook.StepM;

import java.io.*;
import java.util.*;

public class StoreMenu {
	Scanner s = new Scanner(System.in);
	ArrayList<MenuPan> m = new ArrayList<MenuPan>();
	
	public StoreMenu() {
		while(true) {
			System.out.printf("1)�߰� 2)���� 3)���� 4)����Ʈ 5)�Ѱ��� 6)���� ==> ");
			int select = s.nextInt();
			System.out.println("--------------------------------------");
			switch(select) {
			case 1:
				addMenu();
				System.out.println("�ԷµǾ����ϴ�.");
				break;
			case 2:
				edit();
				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 3:
				delete();
				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 4:
				show();
				break;
			case 5:
				total();
				break;
			case 6:
				try {
					save_text();
					System.out.println("�ؽ�Ʈ ���Ϸ� �����Ͽ����ϴ�.");
				}catch(IOException e)
				{
					System.out.println("�����Դϴ�.");
				}
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
		}
	}
	void addMenu() {
		System.out.printf("�޴��� �޴���, ������, ������ �Է��Ͻÿ�. ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();
		MenuPan menu = new MenuPan(name,origin,price);
		m.add(menu);
	}
	void edit() {
		show();
		System.out.printf("==>������ ��ȣ�� �Է��ϼ���.: ");
		int num = s.nextInt();
		System.out.printf("==>�޴��� �޴���, ������, ������ �Է��Ͻÿ�. ");
		m.get(num-1).menu_name = s.next();
		m.get(num-1).origin = s.next();
		m.get(num-1).price = s.nextInt();
	}
	void delete() {
		show();
		System.out.printf("==>������ ��ȣ�� �Է��Ͻÿ�: ");
		int num = s.nextInt();
		m.remove(m.get(num-1));
	}
	void show() {
		System.out.println("�޴���ȣ\t�޴��̸�\t������\t1�κа���");
		for(int i=0;i<m.size();i++) {
			System.out.printf("%d\t"+m.get(i).menu_name+"\t"+m.get(i).origin+"\t%d\n",i+1,m.get(i).price);
		}
	}
	void total() {
		System.out.printf("%d���� �޴��� ��ϵǾ� �ֽ��ϴ�.\n",m.size());
	}
	void save_text() throws IOException {
		PrintWriter pw = new PrintWriter("out.txt");
		String list = "�޴���ȣ\t�޴��̸�\t������\t1�κа���\r\n";
		pw.write(list);
		pw.println("-----------------------------------------------------");
		for(int i=0;i<m.size();i++) {
			pw.write((i+1)+"\t\t"+m.get(i).menu_name+"\t\t"+m.get(i).origin+"\t"+m.get(i).price+"\r\n");
		}
		pw.close();
	}
}
