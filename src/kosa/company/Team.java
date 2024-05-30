package kosa.company;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String id;
	private String name;
	private Role role;
	private List<Role> roles;

	public Team() {
	}

	public Team(String id, String name) {
		this.id = id;
		this.name = name;
		roles = new ArrayList<Role>();
	}

	public void addRole(Role role) {
		roles.add(role);
		role.addTeam(this);
	}

	public void print() {
		System.out.println("ÆÀ ¹øÈ£: " + id);
		System.out.println("ÆÀ ÀÌ¸§: " + name);
		for (Role r : roles) {
			r.print();
		}
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
