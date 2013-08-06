package br.com.vitor.test;

import java.util.ArrayList;

import org.junit.Test;

import br.com.vitor.controller.MatchController;
import br.com.vitor.model.Match;
import junit.framework.TestCase;

public class MatchControllerTest extends TestCase {

	@Test
	public void testCreateRanking() {
		ArrayList<Match> partidas = new ArrayList<Match>();
		MatchController mc = new MatchController();
		partidas = mc.createRanking();
		for(Match mt : partidas){
			
			System.out.println(mc.createStringRanking(mt));
		}
	}

	@Test
	public void testCreateStringRanking() {
		ArrayList<Match> partidas = new ArrayList<Match>();
		MatchController mc = new MatchController();
		partidas = mc.createRanking();
		for(Match mt : partidas){
			
			System.out.println(mc.createStringRanking(mt));
		}
	}

}
