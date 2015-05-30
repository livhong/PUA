
public class Controller_8 {
	static double random_s=.1;
	double random_m=.3;
	double random_l=.5;
	//这是8人桌的决策
	//涉及随机的时候，small%约10%，medium%约30%，large%约50%
	//再，涉及随机的时候，如果我的attitude是aggressive的，对手是passive的，则更多的raise
	//如果我的attitude是passive的，对手是aggressive的，则更多的fold
	//再。涉及随机的时候，如果对手紧，则peflop多raise，其他多fold，否则，peflop用更好的牌进，后面raise
	//再，后面阶段三人时只做隔离raise
	public static void peflop(){
		int raiseCount =Status.peflopRaiseCount();
		//没有体现下注额度，感觉以log2(pot/blind)来计算raiseCount，相当于自己raise自己call
		String type =Analyser.peflopType();
		
		//TODO 这里如果位置极好，对手过牌，则random几率直接peflopRaise("aggressive");
		
		switch (type) {
		case "s5":
			// s5		QQ+ AK AJs+
			switch (raiseCount) {
			case 1:
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCall("aggressive");
				break;
			}
			break;
		case "s4":
			// s4		TT+ AJ+ A9s+ KQs
			switch (raiseCount) {
			case 2:
				Action.peflopCall("aggressive");
				break;
			case 1:
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCall("passive");
				break;
			}
			break;
		case "s3":
		// s3		55+ A9+ A7s+ KQ KTs+ QJs
			switch (raiseCount) {
			case 2:
			case 1:
				if(Math.random()<random_s) Action.peflopCall("aggressive");
				else Action.peflopCall("passive");
				break;
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCheckOrFold();
				break;
			}
			break;
		case "s2":
			// s2		65s-JTs
			switch (raiseCount) {
			case 2:
				if(Math.random()<random_s) Action.peflopCall("passive");
				else Action.peflopCheckOrFold();
				break;
			case 1:
				if(Math.random()<random_s) Action.peflopCheckOrFold();
				else Action.peflopCall("passive");
				break;
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCheckOrFold();
				break;
			}
			break;
		case "s1":
			// s1		22+ A4+ A2s+ K6+ K4s+ Q8+ Q6s+ JT+ J8s+
			switch (raiseCount) {
			case 1:
				if(Math.random()<random_s)  Action.peflopCall("passive");
				else Action.peflopCheckOrFold();
				break;
			case 0:
				Action.peflopCall("passive");
				break;
			default:
				Action.peflopCheckOrFold();
				break;
			}
			break;
		case "mideum":
			// medium	有AKQ T+T+ J4+ J2s+ T6+ T8s+
		case "weak":
			Action.peflopCheckOrFold();
			break;
		default:
			break;
		}
	}
	public static void flop(){
		int raiseCount =Status.flopRaiseCount();
		String type =Analyser.flopType();
		
		//TODO 这里如果位置极好，对手过牌，则random几率直接flopRaise("aggressive");
		
		switch (type) {
		case "s5":
			// s5		已经做成的同花顺，四条，葫芦，同花（分大小），顺子（分大小），三条，两对（分大小），共对+对（分大小）
			//				s5细分？
			switch (raiseCount) {
			case 1:
			case 0:
				Action.raise("aggressive");
				break;
			default:
				Action.call("aggressive");
				break;
			}
			break;
		case "s4":
			// s4		超对，顶对大踢（顶对大不大）
			switch (raiseCount) {
			case 2:
				if(Math.random()<random_s) Action.call("passive");
				else Action.call("aggressive");
				break;
			case 1:
				if(Math.random()<random_s) Action.call("aggressive");
				else Action.raise("aggressive");
				break;
			case 0:
				Action.raise("aggressive");
				break;
			default:
				Action.call("passive");
				break;
			}
			break;
		case "s3":
			// s3		带对听牌
			switch (raiseCount) {
			case 2:
				Action.call("passive");
				break;
			case 1:
				Action.call("aggressive");
				break;
			case 0:
				Action.raise("aggressive");
				break;
			default:
				Action.checkOrFold();
				break;
			}
			break;
		case "s2":
			// s2		顶对小踢（顶对大不大），中对大踢，其他对
			//				s2细分？
			switch (raiseCount) {
			case 2:
				if(Math.random()<random_s) Action.call("passive");
				else Action.checkOrFold();
				break;
			case 1:
				Action.call("passive");
				break;
			case 0:
				Action.raise("aggressive");
				break;
			default:
				Action.checkOrFold();
				break;
			}
			break;
		case "s1":
			// s1		听牌
			if(Status.canCall())Action.call("passive");
			break;
		case "mideum":
		case "weak":
			Action.checkOrFold();
			break;
		default:
			break;
		}
	}
	public static void turn(){
		//大致与flop类似
	}
	public static void river(){
		//大致与flop类似
	}
}
