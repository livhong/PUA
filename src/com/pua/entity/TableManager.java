package com.pua.entity;

import java.util.ArrayList;

public class TableManager {

	double smallBlind;
	int myIndex = -1;
	int myId = -1;
	ArrayList<Player> players = new ArrayList();
	
	public void add(Player p){
		players.add(p);
	}
	
	public int getMyIndexToButton(){
		if(myIndex==-1){
			for(int i = 0; i<players.size();i++){
				if(players.get(i).getPid()==myId){
					myIndex = i;
					return i;
				}
			}
		}else{
			return myIndex;
		}
		return -1;
	}
	
	public Player getPlayer(int index){
		return players.get(index);
	}
	
	public Player getButton(){
		return players.get(0);
	}
	
	public Player getSmall(){
		return players.get(1);
	}
	
	public Player getBig(){
		return players.get(2);
	}

	public double getSmallBlind() {
		return smallBlind;
	}

	public void setSmallBlind(double smallBlind) {
		this.smallBlind = smallBlind;
	}

	public int getMyIndex() {
		return myIndex;
	}

	public void setMyIndex(int myIndex) {
		this.myIndex = myIndex;
	}
	
	public int getSize(){
		return players.size();
	}

}
