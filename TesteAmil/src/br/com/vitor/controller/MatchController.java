package br.com.vitor.controller;

import java.io.BufferedReader;
import java.util.ArrayList;

import br.com.vitor.model.Match;
import br.com.vitor.model.Player;
import br.com.vitor.utils.ReadLog;

public class MatchController {

	public ArrayList<Match> createRanking(){
		ArrayList<Match> matches = new ArrayList<Match>();
		ArrayList<Player> players = new ArrayList<Player>();
		ReadLog readLog = new ReadLog();
		PlayerController pc = new PlayerController();
		BufferedReader log = readLog.read("C://log.txt");
		try {
			String line = null;//log.readLine();
			String [] lineArr;
			Match match = new Match();
		    while ((line = log.readLine()) != null) {
		    	lineArr = line.split(" - ");
		    	if(lineArr[1].contains("<WORLD>")){
		    		
		    	}else if (lineArr[1].contains("New match")){	
		    		lineArr = lineArr[1].split(" ");
		    		
		    		match = new Match();
		    		players = new ArrayList<Player>();
		    		match.setName(lineArr[2]);
		    		
		    	}else if (lineArr[1].contains("Match")){
		    		match.setPlayers(players);
		    		matches.add(match);
		    	}else{
		    		players = pc.lineOrganizer(players, lineArr[1]);                 
		    	}
		    }
		    readLog.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	    return matches;
	}
	
	public String createStringRanking(Match match){
		String ranking = "Partida =>" + match.getName() + " \n";
		
		for(Player pl : match.getPlayers()){
			ranking += "Player : <<<<<<" + pl.getName() + ">>>>>>> Morreu = " + pl.getDeaths() + " vez(es) e Matou " + pl.getKilled() + " vez(es) \n";
		}
		
		return ranking;
	}
	
}
