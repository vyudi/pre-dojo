package br.com.vitor.model;

public class Weapon {
	private String name;
	private int killed;
	
	public Weapon() {
		super();
		this.killed = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKilled() {
		return killed;
	}
	public void setKilled(int killed) {
		this.killed = killed;
	}
	
	public void addKilled(int killed){
		this.killed += killed;
	}
}
