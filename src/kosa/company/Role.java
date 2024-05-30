package kosa.company;

import java.util.ArrayList;
import java.util.List;

public class Role {
	private String id;
	private String name;
	private Member member;
	private List<Team> teams;
	private List<Member> members;
	
	public Role() {}

	public Role(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		teams= new ArrayList<Team>();
		members = new ArrayList<Member>();
	}
	
	public void addTeam(Team team) {
		teams.add(team);
	}
	
	public void addMember(Member member) {
		members.add(member);
		
	}
	
	public void print() {
		System.out.println("팀에 속한 직위 번호: " + id);
		System.out.println("팀에 속한 직위: " + name);
		System.out.println("====== 팀 직원들 ======");
		for(Member m : members) {
			m.print();
		}
		System.out.println("======================");
//		member.print();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
