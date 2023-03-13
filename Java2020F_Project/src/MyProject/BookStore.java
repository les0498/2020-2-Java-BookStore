package MyProject;

import java.util.HashMap;
import java.util.Scanner;

import java.util.*; 

public class BookStore {
	Scanner scan = new Scanner(System.in);

	//HashMap
	HashMap<String, Book> map = new HashMap<String, Book>(); 
	public void input() { 
		int key = 0;
		while((key = menu())!=0) { 
			switch(key) { 
			case 1: addBook(); break;
			case 2: search(); break;
			case 3: removeBook(); break;
			case 4: printBookCounts(); break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
			}
		}
		System.out.println("���� �Ǿ����ϴ�.");
	}
	int menu() { 
		System.out.print("\n��ȣ �Է� (1-�߰�, 2-�˻�, 3-����, 4-å�� �� ���, 0-����): ");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}
	void addBook() { 
		String no;
		System.out.println("## �߰��� å ���� �Է� ##");
		System.out.print(">> ���� ��ȣ: ");
		no = scan.nextLine(); 
		
		String title;
		System.out.print(">> ����: ");
		title = scan.nextLine();
		
		String author;
		System.out.print(">> ����: ");
		author = scan.nextLine(); 
		
		String price;
		System.out.print(">> ���� (����): ");
		price = scan.nextLine(); 
		
		String genre; 
		System.out.print(">> �帣 : "); 
	    genre = scan.nextLine();
		
	    float rating;
	    System.out.print(">> ���� (�Ǽ�): ");
	    rating = scan.nextFloat(); 
	    
	    System.out.println("�߰� �Ǿ����ϴ�.");
	    Novel novel = new Novel(no, title, author, price, genre, rating);
	    map.put(no, novel); 
	}
	
	void search() { 
		String no;
		System.out.println("## ���� �˻�  ##");
		System.out.print(">> ���� ��ȣ�� �Է��ϼ���: ");
		no = scan.nextLine();
		if(map.containsKey(no)) { 
			Novel novel = (Novel) map.get(no); 
			System.out.println(novel.sInform());
		}
		else { 
			 printErrMsg(no);
		}
	  
	}
	void removeBook() { 
		String no; 
		System.out.println("## ���� ���� ##");
		System.out.print(">> ���� ��ȣ�� �Է��ϼ���: ");
		no = scan.nextLine();
		if(map.containsKey(no)) { 
			map.remove(no);
			System.out.println("�����Ͻ� ������ �����Ǿ����ϴ�.");
		}
		else { 
			printErrMsg(no);
		}
		
	}
	void printBookCounts() { 
		 Book.count = map.size(); 
		System.out.println("���� �� �Էµ� å�� " + map.size() +" �Դϴ�."); 
	}
    
	void printErrMsg(Object key) { 
		if ((key == null)) { 
	      System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
	 }
	}
		
	void printErrMsg(String no) { 
		System.out.println( no  + " �� �ش��ϴ� ������ ã�� �� �����ϴ� (x_x)..");
	}

}
