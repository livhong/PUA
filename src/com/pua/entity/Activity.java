package com.pua.entity;

public class Activity {

	int pid;
	int jetton;
	int money;
	int bet;
	int action;
	
	public Activity(){}
	
	public Activity(int pid, int jetton, int money, int bet, int action){
		this.action = action;
		this.jetton = jetton;
		this.money = money;
		this.pid = pid;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getJetton() {
		return jetton;
	}
	public void setJetton(int jetton) {
		this.jetton = jetton;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}
	
	
	
}
