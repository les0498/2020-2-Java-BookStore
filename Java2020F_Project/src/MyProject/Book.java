package MyProject;

public class Book {
	
	 String no,title,author,price;
	 static int count = 0;
	 
	 public void Book(String no, String title, String author, String price) { 
		 this.no = no;
		 this.title = title;
		 this.author = author;
		 this.price = price; 
		
	 }
	 
	 public String No() { 
		 return no; 
	 }
}
	 
