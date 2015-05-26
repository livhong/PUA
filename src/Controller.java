
public class Controller {
	//这是8人桌的决策
	public static void peflop(){
		int raiseCount =Status.peflopRaiseCount();
		String type =Analyser.peflopType();
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
				Action.peflopCall("passive");
				break;
			case 1:
				Action.peflopCall("aggressive");
				break;
			case 0:
				Action.peflopRaise("aggressive");
				break;
			default:
				Action.peflopCheckOrFold();
				break;
			}
			break;
		case "s2"://43-JT
			switch (raiseCount) {
			case 1:
				Action.peflopCall("passive");
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
		
	}
	public static void turn(){
		
	}
	public static void river(){
		
	}
}
