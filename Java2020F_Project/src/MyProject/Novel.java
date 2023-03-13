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
		return String.format("[ ������ȣ: %s ]\n- ����: %s\n- ����: %s\n- �ǸŰ���: %s\n- �帣: %s\n- ����: %.1f\n" , no, title, author, price, genre, rating);
	 }
}
