package chapter06;

public class Book {
	
	//�������=�ʵ�
	public String bookname;
	public String author;
	
	
	//�޼ҵ�
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
	//������
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//�޸� Ȯ�� + ��������濡 �ʱ�ȭ
	public Book(String bookname, String author) { 
		this.bookname=bookname;
		this.author=author;
	}
	//�����ε��� ���� ���¿����� �����ڸ� �� ��� �⺻���� �����Ǵ� �������� �����ִ�. �׷��� BookMain�� ���� ���� ���.
	//�׷��� �̹� �����ε��� �� ���¿��� �����ڸ� ����� �Ǹ� BookMain�� ������ ���. �Ժη� ����� �� �ȴ�.
	//������ �����ε��� �ؼ� �ݵ�� �����ڸ� ����Ʈ ����� �Ѵ�.

	//����� ���� �޼ҵ�
	public void showBookinfo() {
		System.out.println("å�̸�: " + bookname+"| ����: " + author );
	}
	
	
	
}
