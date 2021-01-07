package com.qa.main;

public class Results {
	private int biology;
	private int chemistry;
	private int physics;
	private String name;

	public Results(int biology, int chemistry, int physics, String name) {
		this.biology = biology;
		this.chemistry = chemistry;
		this.physics = physics;
		this.name = name;
	}
	
	public int getBiology() {
		return biology;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}
	
	
}
