package br.com.vitor;

import java.util.ArrayList;

import br.com.vitor.controller.MatchController;
import br.com.vitor.model.Match;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Match> partidas = new ArrayList<Match>();
		MatchController mc = new MatchController();
		partidas = mc.createRanking();
		for(Match mt : partidas){
			
			System.out.println(mc.createStringRanking(mt));
		}
	}

}
