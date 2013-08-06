package br.com.vitor.controller;

import java.util.ArrayList;

import br.com.vitor.model.Player;
import br.com.vitor.model.Weapon;

public class PlayerController {
	private Weapon wp;
	private Player player;
	private ArrayList<Player> listPlayer;
	
	public PlayerController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Player> lineOrganizer(ArrayList<Player> players, String line){
		//0Roman 1killed 2Nick 3using 4M16
		String [] lineArr = line.split(" ");
		wp = new Weapon();
		player = new Player();
		boolean wpB = false;
		boolean plBK = true;//primeira vez que aparece como killed
		boolean plBD = true;//primeira vez que aparece como Death
		if(players.size()>0){
			for(Player pl : players){
				if(pl.getName().equals(lineArr[0])){
					pl.addKilled(1);
					plBK = false;
					for(Weapon we : pl.getWeapons()){
						if(we.getName().equals(lineArr[4])){
							we.addKilled(1);
							wpB = true;
						}
					}
					if(!wpB){
						wp = new Weapon();
						wp.setName(lineArr[4]);
						pl.addWeapon(wp);
					}
				}
				
				if(pl.getName().equals(lineArr[2])){
					pl.addDeaths(1);
					plBD = false;
				}
			}
		}else{
			players = addFirstLine(lineArr);
			plBD = false;
			plBK = false;
		}

		if(plBK){
			players.add(lineToPlayer(lineArr,true));
		}
		
		if(plBD){
			players.add(lineToPlayer(lineArr,false));
		}
		return players;
	}
	
	private Player lineToPlayer(String [] lineArr, boolean killed){
		player = new Player();
		if(killed){
			
			wp = new Weapon();
			wp.setName(lineArr[4]);
			player.setName(lineArr[0]);
			player.addKilled(1);
			player.addWeapon(wp);
			return player;
		}else{
			
			player.setName(lineArr[2]);
			player.addDeaths(1);
			return player;
		}
	}
	
	private ArrayList<Player> addFirstLine(String [] lineArr ){
		listPlayer = new ArrayList<Player>();

		wp = new Weapon();
		wp.setName(lineArr[4]);
		wp.addKilled(1);
		
		player = new Player();
		player.setName(lineArr[0]);
		player.addWeapon(wp);
		player.addKilled(1);
		listPlayer.add(player);
		
		player = new Player();
		player.setName(lineArr[2]);
		player.addDeaths(1);
		listPlayer.add(player);
		
		return listPlayer;
	}

}
