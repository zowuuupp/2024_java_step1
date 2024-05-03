package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team = new TeamGroup();
		
		team.init();
		team.Disp();
		
		System.out.println();
		TeamMember t = new TeamMember();
		t.setmName("박영도");
		System.out.println("팀장이름 : "+t.getmName());
		t.setmPhone("010-xxxx-xxxx");
		System.out.println("팀장번호 : "+t.getmPhone());
		t.setsName("이석준");
		System.out.println("부팀장이름 : "+t.getsName());
		
		
		
	}

}
