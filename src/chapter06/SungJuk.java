package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//멤버변수=필드
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//생성자
	
	//메소드
	public void Sum() {
		int sum = java+oracle+spring;
		System.out.println("총 합계 : "+sum);
	}
	public void Avg() {
		double avg = (double)(java+oracle+spring) / 3 ;
		System.out.println("평균 : "+avg);
	}

	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk(); //SungJuk 클래스의 객체생성(rec)
		rec.std_num=JOptionPane.showInputDialog("학번");
		rec.std_name=JOptionPane.showInputDialog("성명");
		
		rec.java=Integer.parseInt(JOptionPane.showInputDialog("자바점수  입력"));
		rec.oracle=Integer.parseInt(JOptionPane.showInputDialog("오라클점수  입력"));
		rec.spring=Integer.parseInt(JOptionPane.showInputDialog("스프링점수  입력"));
		
		System.out.println("학번 - "+rec.std_num+" | 성명 - "+rec.std_name+"님의 성적입니다.");
		System.out.println("==========================================================");
		rec.Sum();
		rec.Avg();
		
		
	}

}
