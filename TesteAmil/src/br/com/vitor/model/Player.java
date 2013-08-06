package br.com.vitor.model;

import java.util.ArrayList;

public class Player {
	private String name;
	private int deaths;
	private int killed;
	private ArrayList<Weapon> weapons;
	
	public Player() {
		super();
		this.deaths = 0;
		this.killed = 0;
		this.weapons = new ArrayList<Weapon>();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getKilled() {
		return killed;
	}
	public void setKilled(int killed) {
		this.killed = killed;
	}
	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}
	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}
	
	public void addWeapon(Weapon weapon){
		this.weapons.add(weapon);
	}
	
	public void addKilled(int killed){
		this.killed += killed;
	}
	
	public void addDeaths(int deaths) {
		this.deaths += deaths;
	}
	
	public Weapon getPreferredWeapon(){
		Weapon preferred = new Weapon();
		preferred.setKilled(0);
		for(Weapon w : weapons){
			if(w.getKilled()>preferred.getKilled()){
				preferred = w;
			}
		}
		
		return preferred;
	}
}

