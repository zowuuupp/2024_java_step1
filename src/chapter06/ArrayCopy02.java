package chapter06;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//깊은 복사
		Book[] bookArray1 = new Book[3]; //선언
		Book bookArray2[] = new Book[3];
		
		bookArray1[0]=new Book("데미안", "헤르만 헤세");
		bookArray1[1]=new Book("빨간머리  앤", "몽고메리");
		bookArray1[2]=new Book("백설공주", "그림형제");
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		System.out.println("========bookArray1 원본========");
		for (int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		System.out.println("========bookArray2 원본========");
		for (int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		//bookArray1 배열요소를 새로 생성한(다른 곳을 바라보고 있다) bookArray2 배열 인스턴스에 복사
		for (int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			//bookArray2[i].setBookname() 을 써야 하는데 ()안에는 bookname이 들어와야 한다.
			//이때 bookArray1[i}.getBookname은 메서드에 의해 bookname을 불러온다.
			//즉, bookArray1[i]에 들어있는 bookname을 그대로 끌어와서 bookArray2[i]에 집어넣는 것이다.
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		System.out.println("========bookArray2 복사========");
		for (int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		System.out.println();
		//======================================================================
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		System.out.println("========bookArray1 원본변경========");
		for (int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		System.out.println("========bookArray2 복사본변경========");
		for (int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		//bookArray1이 바뀐다고 해도 bookArray2가 바뀌지 않는다. 이미 바라보는  방향이 다르다.
		
	}

}
