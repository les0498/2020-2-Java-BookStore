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
			default: System.out.println("잘못 입력하셨습니다."); break;
			}
		}
		System.out.println("종료 되었습니다.");
	}
	int menu() { 
		System.out.print("\n번호 입력 (1-추가, 2-검색, 3-삭제, 4-책의 수 출력, 0-종료): ");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}
	void addBook() { 
		String no;
		System.out.println("## 추가할 책 정보 입력 ##");
		System.out.print(">> 관리 번호: ");
		no = scan.nextLine(); 
		
		String title;
		System.out.print(">> 제목: ");
		title = scan.nextLine();
		
		String author;
		System.out.print(">> 저자: ");
		author = scan.nextLine(); 
		
		String price;
		System.out.print(">> 가격 (정수): ");
		price = scan.nextLine(); 
		
		String genre; 
		System.out.print(">> 장르 : "); 
	    genre = scan.nextLine();
		
	    float rating;
	    System.out.print(">> 평점 (실수): ");
	    rating = scan.nextFloat(); 
	    
	    System.out.println("추가 되었습니다.");
	    Novel novel = new Novel(no, title, author, price, genre, rating);
	    map.put(no, novel); 
	}
	
	void search() { 
		String no;
		System.out.println("## 도서 검색  ##");
		System.out.print(">> 관리 번호를 입력하세요: ");
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
		System.out.println("## 도서 삭제 ##");
		System.out.print(">> 관리 번호를 입력하세요: ");
		no = scan.nextLine();
		if(map.containsKey(no)) { 
			map.remove(no);
			System.out.println("선택하신 도서가 삭제되었습니다.");
		}
		else { 
			printErrMsg(no);
		}
		
	}
	void printBookCounts() { 
		 Book.count = map.size(); 
		System.out.println("현재 총 입력된 책은 " + map.size() +" 입니다."); 
	}
    
	void printErrMsg(Object key) { 
		if ((key == null)) { 
	      System.out.println("잘못 입력하셨습니다."); 
	 }
	}
		
	void printErrMsg(String no) { 
		System.out.println( no  + " 에 해당하는 도서를 찾을 수 없습니다 (x_x)..");
	}

}
