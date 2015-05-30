
public class Controller_8 {
	static double random_s=.1;
	double random_m=.3;
	double random_l=.5;
	//����8�����ľ���
	//�漰�����ʱ��small%Լ10%��medium%Լ30%��large%Լ50%
	//�٣��漰�����ʱ������ҵ�attitude��aggressive�ģ�������passive�ģ�������raise
	//����ҵ�attitude��passive�ģ�������aggressive�ģ�������fold
	//�١��漰�����ʱ��������ֽ�����peflop��raise��������fold������peflop�ø��õ��ƽ�������raise
	//�٣�����׶�����ʱֻ������raise
	public static void peflop(){
		int raiseCount =Status.peflopRaiseCount();
		//û��������ע��ȣ��о���log2(pot/blind)������raiseCount���൱���Լ�raise�Լ�call
		String type =Analyser.peflopType();
		
		//TODO �������λ�ü��ã����ֹ��ƣ���random����ֱ��peflopRaise("aggressive");
		
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
			// medium	��AKQ T+T+ J4+ J2s+ T6+ T8s+
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
			// s1		����
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
		//������flop����
	}
	public static void river(){
		//������flop����
	}
}
