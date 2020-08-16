package fr.freiche.perso.pendu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiPenduController {

	@RequestMapping("/createGame")
	public void createGame(String playerName) {
		
		//Create Game 
		//Create player
		
		//Reponse OK KO ?
		
	}
	
	public void leaveGame(int idGame, String playerName) {
		
	}
	
	
	public void choseWord(int idGame, int idPlayer, String mot) {
		//Verifier Game et player OK
		//verifier mot dans dico
		//ajout mot dans bdd si ok
		//session?
	}
	
	public void choseLetter(int idGame, int idPlayer, char letter) {
		
	}
	
}
