import java.util.ArrayList;

import com.pua.entity.Card;


public class Analyser {
	
	
	public static String peflopType(ArrayList<Card> inhand) { // 2
		
		//XXX ��status�õ�����n��169/n�������ǱȽ�ǿ�ģ����Դ�database������
		//��Щ�Ƶķֳ�3�ݼӵ�s5,s4,s3,Ȼ��������Ĳ�©������ֻ�������������Ƿ��̫���Ʋ��õ��ģ�
		
		
		// TODO Auto-generated method stub
		// ��Status�õ��ҵ����ƣ�����ó��ҵ�����ǿ��
		// s5		QQ+ AK AJs+
		// s4		TT+ AJ+ A9s+ KQs
		// s3		55+ A9+ A7s+ KQ KTs+ QJs
		// s2		65s-JTs
		// s1		22+ A4+ A2s+ K6+ K4s+ Q8+ Q6s+ JT+ J8s+
		// medium	��AKQ T+T+ J4+ J2s+ T6+ T8s+
		// weak		��
		return null;
	}

	//S5 ͬ��˳����������«��ͬ����˳�ӣ�����������
	//S4 ���ԣ�����һ�� �ȹ�������������Ƹ���
	//   ���ԣ�����һ�� �͹�������������һ�ԣ�
	//   ���ߣ�����һ�ű������Ҫ�����
	//S3  ���ƣ���˳�� + ��ͬ��
	//   ���ţ����������Ʊȹ���������ƴ�
	//   ����������Ҫ���Ų�������
	public static String flopType() { // 2 + 3
		// TODO Auto-generated method stub
		// ��Status�õ��ҵ����ƣ�����ó��ҵ�����ǿ��
		// s5		�Ѿ����ɵ�ͬ��˳����������«��ͬ�����ִ�С����˳�ӣ��ִ�С�������������ԣ��ִ�С��������+�ԣ��ִ�С��
		//				s5ϸ�֣�
		// s4		���ԣ����Դ��ߣ����Դ󲻴�
		// s3		��������
		// s2		һ��
		// s1		����
		int outs = 0;
		//��������Ҫ�������ƶ��е�����
		Status.setOuts(outs);//����2����1.5outs
		// medium	�����ţ�������
		// weak		��
		return null;
	}
	
	public static String turnType() { // 2 + 4
		// TODO Auto-generated method stub
		// ��Status�õ��ҵ����ƣ�����ó��ҵ�����ǿ��
		// s5		�Ѿ����ɵ�ͬ��˳����������«��ͬ�����ִ�С����˳�ӣ��ִ�С�������������ԣ��ִ�С��������+�ԣ��ִ�С��
		//				s5ϸ�֣�
		// s4		���ԣ����Դ��ߣ����Դ󲻴�
		// s3		��������
		// s2		����С�ߣ����Դ󲻴󣩣��жԴ��ߣ������� //XXX ����Щ��ֻ��һ���ּ�ֵ����һ��̯�Ƽ�ֵ������call��
		//				s2ϸ�֣�
		// s1		����
		// medium	������
		// weak		��
		return null;
	}
	
	public static String riverType() { // 2 + 5
		// TODO Auto-generated method stub
		// ��Status�õ��ҵ����ƣ�����ó��ҵ�����ǿ��
		// s5		�Ѿ����ɵ�ͬ��˳����������«//XXX���ִ�С��С����Ȼ���ǿ���̯�Ƶ���Ҫ�سأ���ͬ�����ִ�С����˳�ӣ��ִ�С�������������ԣ��ִ�С��������+�ԣ��ִ�С��
		//				s5ϸ�֣�
		// s4		���ԣ����Դ��ߣ����Դ󲻴�//XXX��������������ˣ���������aggressive��re-raise���سأ�
		// s3		//XXX ���������½���s2
		// s2		����С�ߣ����Դ󲻴󣩣��жԴ��ߣ�������//XXX ����Щ��ֻ��һ���ּ�ֵ����һ��̯�Ƽ�ֵ������call��
		//				s2ϸ�֣�
		// s1		//XXX ���������ʪ�棨�����������ˣ�������passive��������ע
		// medium	������
		// weak		��
		return null;
	}

}
