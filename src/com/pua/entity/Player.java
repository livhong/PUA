package com.pua.entity;

public class Player {

	int pid;
	int jetton;
	int money;
	
	public Player(int pid, int jetton, int money){
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
	
}
