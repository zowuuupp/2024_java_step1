package chapter06;

public class TeamGroup {
	
	//멤버변수
	private TeamMember[] member = new TeamMember[6];
	
	//기본생성자
	
	//초기화 메소드
	
	public void init() {
		member[0]=new TeamMember("박영도","남성");
		member[1]=new TeamMember("이석준","남성");
		member[2]=new TeamMember("이진건","남성");
		member[3]=new TeamMember("송예림","여성");
		member[4]=new TeamMember("최서희","여성");
		member[5]=new TeamMember("임도영","남성");
	}
	
	//출력 메소드
	public void Disp() {
		for(int i=0; i<member.length;i++) {
			System.out.print("성명 : "+member[i].getName());
			System.out.println(", 성별 : "+(member[i].getGender()));
		}
	}
	

}
