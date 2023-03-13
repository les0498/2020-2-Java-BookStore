package MyProject;

public class Novel extends Book {
	String genre;
	float rating; 
	
	public Novel(String no, String title, String author, String price, String genre2, float rating2) {
		this.no = no;
		 this.title = title;
		 this.author = author;
		 this.price = price; 
		 this.genre = genre2;
		 this.rating = rating2;  
	}
	
	public String No(){
		return no;
	}
	
	public String sInform() { 
		return String.format("[ 관리번호: %s ]\n- 제목: %s\n- 저자: %s\n- 판매가격: %s\n- 장르: %s\n- 평점: %.1f\n" , no, title, author, price, genre, rating);
	 }
}
