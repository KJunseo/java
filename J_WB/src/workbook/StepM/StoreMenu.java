package workbook.StepM;

import java.io.*;
import java.util.*;

public class StoreMenu {
	Scanner s = new Scanner(System.in);
	ArrayList<MenuPan> m = new ArrayList<MenuPan>();
	
	public StoreMenu() {
		while(true) {
			System.out.printf("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			int select = s.nextInt();
			System.out.println("--------------------------------------");
			switch(select) {
			case 1:
				addMenu();
				System.out.println("입력되었습니다.");
				break;
			case 2:
				edit();
				System.out.println("수정되었습니다.");
				break;
			case 3:
				delete();
				System.out.println("삭제되었습니다.");
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
					System.out.println("텍스트 파일로 저장하였습니다.");
				}catch(IOException e)
				{
					System.out.println("에러입니다.");
				}
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	void addMenu() {
		System.out.printf("메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();
		MenuPan menu = new MenuPan(name,origin,price);
		m.add(menu);
	}
	void edit() {
		show();
		System.out.printf("==>수정할 번호를 입력하세요.: ");
		int num = s.nextInt();
		System.out.printf("==>메뉴의 메뉴명, 원산지, 가격을 입력하시오. ");
		m.get(num-1).menu_name = s.next();
		m.get(num-1).origin = s.next();
		m.get(num-1).price = s.nextInt();
	}
	void delete() {
		show();
		System.out.printf("==>삭제할 번호를 입력하시오: ");
		int num = s.nextInt();
		m.remove(m.get(num-1));
	}
	void show() {
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		for(int i=0;i<m.size();i++) {
			System.out.printf("%d\t"+m.get(i).menu_name+"\t"+m.get(i).origin+"\t%d\n",i+1,m.get(i).price);
		}
	}
	void total() {
		System.out.printf("%d개의 메뉴가 등록되어 있습니다.\n",m.size());
	}
	void save_text() throws IOException {
		PrintWriter pw = new PrintWriter("out.txt");
		String list = "메뉴번호\t메뉴이름\t원산지\t1인분가격\r\n";
		pw.write(list);
		pw.println("-----------------------------------------------------");
		for(int i=0;i<m.size();i++) {
			pw.write((i+1)+"\t\t"+m.get(i).menu_name+"\t\t"+m.get(i).origin+"\t"+m.get(i).price+"\r\n");
		}
		pw.close();
	}
}
