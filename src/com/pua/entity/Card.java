package com.pua.entity;

public class Card {
	/* 
	 * ���� Spade S
	 * ���� Heart H
	 * �ݻ� Club C
	 * ��Ƭ Diamond D
	 */
	private String flower;
	private int value;
	
	public Card(){
		
	}
	
	public Card(String flower, String value){
		
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
