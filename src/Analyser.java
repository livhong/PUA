
public class Analyser {
	
	
	public static String peflopType() {
		
		//XXX 从status得到人数n，169/n的手牌是比较强的，可以从database拿数据
		//这些牌的分成3份加到s5,s4,s3,然后按照下面的补漏，牌力只升不降（对于是否打太多牌不用担心）
		
		
		// TODO Auto-generated method stub
		// 在Status得到我的手牌，计算得出我的手牌强度
		// s5		QQ+ AK AJs+
		// s4		TT+ AJ+ A9s+ KQs
		// s3		55+ A9+ A7s+ KQ KTs+ QJs
		// s2		65s-JTs
		// s1		22+ A4+ A2s+ K6+ K4s+ Q8+ Q6s+ JT+ J8s+
		// medium	有AKQ T+T+ J4+ J2s+ T6+ T8s+
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
