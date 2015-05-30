
public class Status {
	int playerNumber;// 此时还在打的人数
	int totalPot;
	int preTotalPot;//之前的Pot
	int playerChecked;//过牌的人数
	int myBet;//没有就是0
	int raiseNumber=(totalPot-myBet)/playerNumber;
	String hisAttitude;//aggressive和passive两种、、playerNumber=1的时候设置一下
	//raise 说明aggressive call说明passive
	
	//我的筹码量之类的，关于我的都要
	
	public static int peflopRaiseCount() {
		// TODO Auto-generated method stub
		// return log3(raiseNumber/Blind);四舍五入
		return 0;
	}

	public static int raiseCount() {
		// TODO Auto-generated method stub
		// return log3(raiseNumber/Pot*9);四舍五入
		return 0;
	}

	public static void setMyAttitude(String attitude) {
		// TODO Auto-generated method stub
		
	}
	
	static int outs;
	
	public static void setOuts(int _outs) {
		outs=_outs;
	}

	public static boolean canCall() {
		// TODO Auto-generated method stub
		// 从outs算rate
		// 根据场上的pot和跟注量计算是否该call
		return false;
	}
	
	

}
