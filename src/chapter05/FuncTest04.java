package chapter05;

import javax.swing.JOptionPane;

public class FuncTest04 {
	
	public static void Display(String A[]) {
		
		String res=""; //�󹮼�
		for (int i=0; i<A.length;i++) {
			
			res+=A[i]+" ";
		}
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "�迭�� ��Ұ�\n\n"+res);
	}
	
	public static void main(String[] args) {
		String str[]= {"Java", "Oracle", "JSP", "HTML5", "CSS", "SpringBoot"};
		Display(str);
		
		FuncTest05 ch=new FuncTest05();
		ch.channel="";
		
		
	}

}
