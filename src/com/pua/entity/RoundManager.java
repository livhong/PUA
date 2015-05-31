package com.pua.entity;

import java.util.ArrayList;

public class RoundManager {

	Activity mine;
	ArrayList<Activity> actions = new ArrayList();
	int totalPot;
	
	public void add(Activity ac){
		actions.add(ac);
	}
	
	public void setMyself(int pid, int jetton, int money, int bet, int action){
		mine = new Activity(pid, jetton, money,bet,action);
	}
	
	public Activity getMyself(){
		return mine;
	}

	public int getTotalPot() {
		return totalPot;
	}

	public void setTotalPot(int totalPot) {
		this.totalPot = totalPot;
	}
	
	
	
}
