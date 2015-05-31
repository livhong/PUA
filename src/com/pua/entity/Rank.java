package com.pua.entity;

public class Rank {

	int pid;
	Card c1;
	Card c2;
	String nutHand;
	
	public Rank(int pid, Card c1, Card c2, String nutHand){
		this.c1 = c1;
		this.c2 = c2;
		this.nutHand = nutHand;
		this.pid = pid;
	}

	public int getPid() {
		return pid;
	}

	public Card getC1() {
		return c1;
	}

	public Card getC2() {
		return c2;
	}

	public String getNutHand() {
		return nutHand;
	}
	
}
