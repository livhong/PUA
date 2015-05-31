package com.pua.socket;

public class Constants {

	
	//标号信息
	public static String BUTTON = "button";
	public static String BLIND = "blind";
	public static String SMALL_BLIND = "small blind";
	public static String BIG_BLIND = "big blind";
	public static String JETTON = "jetton";
	public static String MONEY = "money";
	public static String BET = "bet";
	public static String COLOR = "color";
	public static String POINT = "point";
	
	
	//行动消息
	public static String CHECK = "check";
	public static String CALL = "call";
	public static String RAISE = "raise";
	public static String ALL_IN = "all_in";
	public static String FOLD = "fold";
	
	//行动消息的代号
	public static int ID_BLIND = 0x1;
	public static int ID_CHECK = 0x2;
	public static int ID_CALL = 0x3;
	public static int ID_RAISE = 0x4;
	public static int ID_ALL_IN = 0x5;
	public static int ID_FOLD = 0x6;
	
	
	//花色
	public static String SPADES = "SPADES";
	public static String HEARTS = "HEARTS";
	public static String CLUBS = "CLUBS";
	public static String DIAMONDS = "DIAMONDS";
	//牌种
	public static String HIGH_CARD = "HIGH_CARD";
	public static String ONE_PAIR = "ONE_PAIR";
	public static String TWO_PAIR = "TWO_PAIR";
	public static String THREE_OF_A_KIND = "THREE_OF_A_KIND";
	public static String STRAIGHT = "STRAIGHT";
	public static String FLUSH = "FLUSH";
	public static String FULL_HOUSE = "FULL_HOUSE";
	public static String FOUR_OF_A_KIND = "FULL_OF_A_KIND";
	public static String STRAIGHT_FLUSH = "STRAIGHT_FLUSH";
	
	
	//消息开始/结束标志
	public static String REG_MSG = "reg";
	public static String SEAT_INFO_BEGIN = "seat/";
	public static String SEAT_INFO_END = "/seat";
	public static String GAME_OVER = "game-over";
	public static String BLIND_MSG_BEGIN = "blind/";
	public static String BLIND_MSG_END = "/blind";
	public static String HOLD_CARDS_MSG_BEGIN = "hold/";
	public static String HOLD_CARDS_MSG_END = "/hold";	
	public static String INQUIRE_MSG_BEGIN = "inquire/";
	public static String INQUERE_MSG_END = "/inquire";
	public static String FLOP_MSG_BEGIN = "flop/";
	public static String FLOP_MSG_END = "/flop";
	public static String TURN_MSG_BEGIN = "turn/";
	public static String TURN_MSG_END = "/turn";
	public static String RIVER_MSG_BEGIN = "river/";
	public static String RIVER_MSG_END = "/river";
	public static String SHOWDOWN_MSG_BEGIN = "showdown/";
	public static String SHOWDOWN_MSG_COMMON_BEGIN = "common/";
	public static String SHOWDOWM_MSG_COMMON_END = "/common";
	public static String SHOWDOWN_MSG_END = "/showdown";
	public static String POT_WIN_MSG_BEGIN = "pot-win/";
	public static String POT_WIN_MSG_END = "/pot-msg";
	
	public static String NOTIFY_MSG_BEGIN = "notify/";
	public static String NOTIFY_MSG_TOTAL_POT = "total pot";
	public static String NOTIFY_MSG_END = "/notify";
	
	
	
}
