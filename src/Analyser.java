
public class Analyser {

	public static String peflopType() {
		// TODO Auto-generated method stub
		// 在Status得到我的手牌，计算得出我的手牌强度
		// s5		QQ+ AK
		// s4		TT+ AT+ KQ
		// s3		55+ A7+ K9+ QJ
		// s2		43-JT
		// s1		22+ A2+ K4+ Q6+ J8+
		// medium	有AKQ T+T+ J4+ T6+
		// weak		弱
		return null;
	}

	public static String flopType() {
		// TODO Auto-generated method stub
		// 在Status得到我的手牌，计算得出我的手牌强度
		// s5		已经做成的同花顺，四条，葫芦，同花（分大小），顺子（分大小），三条，两对（分大小），共对+对（分大小）
		//				s5细分？
		// s4		超对，顶对大踢（顶对大不大）
		// s3		带对听牌
		// s2		顶对小踢（顶对大不大），中对大踢，其他对
		//				s2细分？
		// s1		听牌
		// medium	两高张，后门听
		// weak		弱
		return null;
	}
	
	public static String turnType() {
		// TODO Auto-generated method stub
		// 在Status得到我的手牌，计算得出我的手牌强度
		// s5		已经做成的同花顺，四条，葫芦，同花（分大小），顺子（分大小），三条，两对（分大小），共对+对（分大小）
		//				s5细分？
		// s4		超对，顶对大踢（顶对大不大）
		// s3		带对听牌
		// s2		顶对小踢（顶对大不大），中对大踢，其他对 //XXX （这些牌只有一条街价值，有一定摊牌价值，干面call）
		//				s2细分？
		// s1		听牌
		// medium	两高张
		// weak		弱
		return null;
	}
	
	public static String riverType() {
		// TODO Auto-generated method stub
		// 在Status得到我的手牌，计算得出我的手牌强度
		// s5		已经做成的同花顺，四条，葫芦//XXX（分大小，小的虽然还是可以摊牌但是要控池），同花（分大小），顺子（分大小），三条，两对（分大小），共对+对（分大小）
		//				s5细分？
		// s4		超对，顶对大踢（顶对大不大）//XXX（对面跟两条街了，甚至对面aggressive、re-raise，控池）
		// s3		//XXX 带对听牌下降到s2
		// s2		顶对小踢（顶对大不大），中对大踢，其他对//XXX （这些牌只有一条街价值，有一定摊牌价值，干面call）
		//				s2细分？
		// s1		//XXX 听牌如果在湿面（其他听牌中了），对手passive，可以下注
		// medium	两高张
		// weak		弱
		return null;
	}

}
