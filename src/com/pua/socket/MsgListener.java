package com.pua.socket;

import java.util.ArrayList;

import com.pua.entity.Card;
import com.pua.entity.Rank;
import com.pua.entity.RoundManager;
import com.pua.entity.TableManager;

public interface MsgListener {

	public void onGetSeat(TableManager tm);
	
	public void onGameOver();
	
	public void onBlind();
	
	public void onGetCards(Card c1, Card c2);
	
	public void onInquire(RoundManager rm);
	
	public void onFlop(Card c1, Card c2, Card c3);
	
	public void onTurn(Card c1);
	
	public void onRiver(Card c1);
	
	public void onShowdown(ArrayList<Card> commons, ArrayList<Rank> ranks);
	
	public void onPotwin();
	
	public void onNotify();
	
}
