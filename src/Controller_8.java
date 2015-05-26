
public class Controller_8 {
	//这是8人桌的决策
	//涉及随机的时候，small%约10%，medium%约30%，large%约50%
	public static void peflop(){
		int raiseCount =Status.peflopRaiseCount();
		//没有体现下注额度，感觉以log2(pot/blind)来计算raiseCount，相当于自己raise自己call
		String type =Analyser.peflopType();
		
		//TODO 这里如果位置极好，对手过牌，则random几率直接peflopRaise("aggressive");
		
		switch (type) {
		case "s5"://QQ+ AK
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
		case "s4"://TT+ AT+ KQ
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
		case "s3"://55+ A7+ K9+ QJ
			switch (raiseCount) {
			case 2:
			case 1:
				Action.peflopCall("passive");
				// small% Action.peflopCall("aggressive");
				break;
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCheckOrFold();
				break;
			}
			break;
		case "s2"://65-JT
			switch (raiseCount) {
			case 2:
				Action.peflopCheckOrFold();
				// small% Action.peflopCall("passive");
				break;
			case 1:
				Action.peflopCall("passive");
				// medium% Action.peflopCheckOrFold();
				break;
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCheckOrFold();
				break;
			}
			break;
		case "s1"://22+ A2+ K4+ Q6+ J8+
			switch (raiseCount) {
			case 1:
				Action.peflopCheckOrFold();
				// small% Action.peflopCall("passive");
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
				Action.call("aggressive");
				// small% Action.call("passive");
				break;
			case 1:
				Action.raise("aggressive");
				// small% Action.call("aggressive");
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
			switch (raiseCount) {
			case 1:
			case 0:
				Action.call("passive");
				break;
			default:
				Action.checkOrFold();
				break;
			}
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
