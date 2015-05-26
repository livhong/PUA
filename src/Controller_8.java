
public class Controller_8 {
	//����8�����ľ���
	//�漰�����ʱ��small%Լ10%��medium%Լ30%��large%Լ50%
	public static void peflop(){
		int raiseCount =Status.peflopRaiseCount();
		//û��������ע��ȣ��о���log2(pot/blind)������raiseCount���൱���Լ�raise�Լ�call
		String type =Analyser.peflopType();
		
		//TODO �������λ�ü��ã����ֹ��ƣ���random����ֱ��peflopRaise("aggressive");
		
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
		
		//TODO �������λ�ü��ã����ֹ��ƣ���random����ֱ��flopRaise("aggressive");
		
		switch (type) {
		case "s5":
			// s5		�Ѿ����ɵ�ͬ��˳����������«��ͬ�����ִ�С����˳�ӣ��ִ�С�������������ԣ��ִ�С��������+�ԣ��ִ�С��
			//				s5ϸ�֣�
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
			// s4		���ԣ����Դ��ߣ����Դ󲻴�
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
			// s3		��������
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
			// s2		����С�ߣ����Դ󲻴󣩣��жԴ��ߣ�������
			//				s2ϸ�֣�
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
			// s1		����
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
		//������flop����
	}
	public static void river(){
		//������flop����
	}
}
