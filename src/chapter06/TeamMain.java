package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team = new TeamGroup();
		
		team.init();
		team.Disp();
		
		System.out.println();
		TeamMember t = new TeamMember();
		t.setmName("�ڿ���");
		System.out.println("�����̸� : "+t.getmName());
		t.setmPhone("010-xxxx-xxxx");
		System.out.println("�����ȣ : "+t.getmPhone());
		t.setsName("�̼���");
		System.out.println("�������̸� : "+t.getsName());
		
		
		
	}

}
