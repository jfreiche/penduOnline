package fr.freiche.perso.pendu.model;

import fr.freiche.perso.pendu.constants.Constants;

public class Player {

	private String name;
	private int globalScore = 0;
	private int remainingsTries = Constants.TRIES_NUMBER;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGlobalScore() {
		return globalScore;
	}
	public void setGlobalScore(int globalScore) {
		this.globalScore = globalScore;
	}
	public int getRemainingsTries() {
		return remainingsTries;
	}
	public void setRemainingsTries(int remainingsTries) {
		this.remainingsTries = remainingsTries;
	}
	
}
