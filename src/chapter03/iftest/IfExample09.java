package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		// 데이터셋
		String ID="soldesk";
		int PW=240119;
		
		//고객
		String id=JOptionPane.showInputDialog("아이디를 입력하세요.");
		int pass=Integer.parseInt(JOptionPane.showInputDialog("패스워드를 입력하세요.")); // JOptionPane.showInputDialog 은 String이다. 이거를 그냥 (int)로는 못 바꾼다. 자료형과 자료형이 아니고 class와 자료형이다.
		
		if(ID.equals(id)) {
			//비밀번호
			if(PW==pass) { //equals 는 비교하는 두 경우가 전부 String이어야한다.
				System.out.println(ID+"님 환영합니다."); 
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("일치하는 아이디가 없습니다.");
		}
		
		

	}

}
