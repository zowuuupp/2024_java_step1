package chapter06;

public class TeamGroup {
	
	//�������
	private TeamMember[] member = new TeamMember[6];
	
	//�⺻������
	
	//�ʱ�ȭ �޼ҵ�
	
	public void init() {
		member[0]=new TeamMember("�ڿ���","����");
		member[1]=new TeamMember("�̼���","����");
		member[2]=new TeamMember("������","����");
		member[3]=new TeamMember("�ۿ���","����");
		member[4]=new TeamMember("�ּ���","����");
		member[5]=new TeamMember("�ӵ���","����");
	}
	
	//��� �޼ҵ�
	public void Disp() {
		for(int i=0; i<member.length;i++) {
			System.out.print("���� : "+member[i].getName());
			System.out.println(", ���� : "+(member[i].getGender()));
		}
	}
	

}
