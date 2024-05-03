package chapter06;

public class Book {
	
	//멤버변수=필드
	public String bookname;
	public String author;
	
	
	//메소드
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	//생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//메모리 확보 + 멤버변수방에 초기화
	public Book(String bookname, String author) { 
		this.bookname=bookname;
		this.author=author;
	}
	//오버로딩이 없는 상태에서는 생성자를 안 적어도 기본으로 생략되는 느낌으로 적혀있다. 그러면 BookMain에 문제 없이 사용.
	//그러나 이미 오버로딩을 한 상태에서 생산자를 지우게 되면 BookMain에 오류가 뜬다. 함부로 지우면 안 된다.
	//생성자 오버로딩을 해서 반드시 생성자를 디폴트 해줘야 한다.

	//사용자 정의 메소드
	public void showBookinfo() {
		System.out.println("책이름: " + bookname+"| 저자: " + author );
	}
	
	
	
}
