package com.pua.socket;

import java.util.ArrayList;

import com.pua.entity.Card;
import com.pua.entity.Player;
import com.pua.entity.Rank;
import com.pua.entity.RoundManager;
import com.pua.entity.TableManager;

public class Receiver {

	Connector con;
	boolean running = true;
	MsgListener listener;
	
	public Receiver(Connector connector, MsgListener listener){
		con = connector;
		this.listener = listener;
		startReceive();
	}
	
	public void startReceive(){
		new Thread(){
			public void run(){
				while(running){
					String msg = con.getLine();
					if(msg.startsWith(Constants.SEAT_INFO_BEGIN)){
						TableManager tm = new TableManager();
						getSeatMsg(tm);
						listener.onGetSeat(tm);
					}else if(msg.startsWith(Constants.GAME_OVER)){
						listener.onGameOver();
					}else if(msg.startsWith(Constants.BLIND_MSG_BEGIN)){
						//If no big blind, pid2 and bet2 are both -1;
						
						listener.onBlind(pid1, bet1, pid2, bet2);
					}else if(msg.startsWith(Constants.HOLD_CARDS_MSG_BEGIN)){
						Card c1 = new Card();
						Card c2 = new Card();
						getCard(c1, c2);
						listener.onGetCards(c1, c2);
					}else if(msg.startsWith(Constants.INQUIRE_MSG_BEGIN)){
						RoundManager rm = new RoundManager();
						getInquireMsg(rm);
						listener.onInquire(rm);
					}else if(msg.startsWith(Constants.FLOP_MSG_BEGIN)){
						Card c1 = new Card();
						Card c2 = new Card();
						Card c3 = new Card();
						getFlop(c1, c2, c3);
						listener.onFlop(c1,c2,c3);
					}else if(msg.startsWith(Constants.TURN_MSG_BEGIN)){
						Card c1 = new Card();
						getTurn(c1);
						listener.onTurn(c1);
					}else if(msg.startsWith(Constants.RIVER_MSG_BEGIN)){
						Card c1 = new Card();
						getRiver(c1);
						listener.onRiver(c1);
					}else if(msg.startsWith(Constants.SHOWDOWN_MSG_BEGIN)){
						ArrayList<Card> commons = new ArrayList();
						ArrayList<Rank> ranks = new ArrayList();
						getShowdown(commons, ranks);
						listener.onShowdown(commons, ranks);
					}else if(msg.startsWith(Constants.POT_WIN_MSG_BEGIN)){
						
					}else if(msg.startsWith(Constants.NOTIFY_MSG_BEGIN)){
						
					}
				}
			}
		}.start();
	}
	
	public void getSeatMsg(TableManager tm){
		
	}
	
	public void getCard(Card c1, Card c2){
		
	}
	
	public void getInquireMsg(RoundManager rm){
		
	}
	
	public void getFlop(Card c1, Card c2, Card c3){
		
	}
	
	public void getTurn(Card c1){
		
	}
	
	public void getRiver(Card c1){
		
	}
	
	public void getShowdown(ArrayList<Card> commons, ArrayList<Rank> ranks){
		
	}
	
	public void toStop(){
		this.running = false;
	}
	
}
