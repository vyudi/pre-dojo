package br.com.vitor.model;

import java.util.ArrayList;

public class Match {
	private String name;
	private ArrayList<Player> players;
	
	public Match() {
		super();
		players = new ArrayList<Player>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	public void addPlayer(Player player){
		this.players.add(player);
	}
}
