
public class Status {
	int playerNumber;// ��ʱ���ڴ������
	int totalPot;
	int preTotalPot;//֮ǰ��Pot
	int playerChecked;//���Ƶ�����
	int myBet;//û�о���0
	int raiseNumber=(totalPot-myBet)/playerNumber;
	String hisAttitude;//aggressive��passive���֡���playerNumber=1��ʱ������һ��
	//raise ˵��aggressive call˵��passive
	
	//�ҵĳ�����֮��ģ������ҵĶ�Ҫ
	
	public static int peflopRaiseCount() {
		// TODO Auto-generated method stub
		// return log3(raiseNumber/Blind);��������
		return 0;
	}

	public static int raiseCount() {
		// TODO Auto-generated method stub
		// return log3(raiseNumber/Pot*9);��������
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
		// ��outs��rate
		// ���ݳ��ϵ�pot�͸�ע�������Ƿ��call
		return false;
	}
	
	

}
