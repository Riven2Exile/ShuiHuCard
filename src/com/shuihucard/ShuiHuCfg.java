/*******
 * 	ˮ䰿�����
 */

package com.shuihucard;


public class ShuiHuCfg {
	
	private ShuiHuCfg()
	{
		System.out.println("ShuiHuCfg instance Init");
		Init();
	}
	
	String[] m_strName;
	
	public final static ShuiHuCfg getInstance(){
		final ShuiHuCfg Instan = new ShuiHuCfg();
		return Instan;
	}
	
	public int getSize(){
		return m_strName.length;
	}
	
	public String GetName(int nIndex){
		if (nIndex < 0 || nIndex >= m_strName.length )
		{
			return "";
		}
		
		return m_strName[nIndex];
	}
	
 	boolean Init(){
		m_strName = new String[109];
		
		m_strName[1] = "�����塤�ν�";
		m_strName[2] = "�����롤¬����";
		m_strName[3] = "�Ƕ��ǡ�����";
		m_strName[4] = "������������ʤ";
		m_strName[5] = "�󵶡���ʤ";
		m_strName[6] = "����ͷ���ֳ�";
		m_strName[7] = "����������";
		m_strName[8] = "˫�ޡ�������";
		m_strName[9] = "С��㡤����";
		m_strName[10] = "С���硤���";
		
		m_strName[11] = "�������Ӧ";
		m_strName[12] = "���׹�������";
		m_strName[13] = "�����С�³����";
		m_strName[14] = "���ߡ�����";
		m_strName[15] = "˫ǹ������ƽ";
		m_strName[16] = "û���������";
		m_strName[17] = "�����ޡ���־";
		m_strName[18] = "��ǹ�֡�����";
		m_strName[19] = "���ȷ桤����";
		m_strName[20] = "����̫��������";
		
		m_strName[21] = "�෢������";
		m_strName[22] = "�����硤����";
		m_strName[23] = "��������ʷ��";
		m_strName[24] = "û�������º�";
		m_strName[25] = "��Ợ���׺�";
		m_strName[26] = "�콭�����";
		m_strName[27] = "����̫�ꡤ��С��";
		m_strName[28] = "��������ź�";
		m_strName[29] = "�������ɡ���С��";
		m_strName[30] = "�����������˳";
		
		m_strName[31] = "�����ޡ���С��";
		m_strName[32] = "������������";
		m_strName[33] = "ƴ�����ɡ�ʯ��";
		m_strName[34] = "��ͷ�ߡ�����";
		m_strName[35] = "˫βЫ���ⱦ";
		m_strName[36] = "���ӡ�����";
		m_strName[37] = "�����ʦ������";
		m_strName[38] = "����ɽ������";
		m_strName[39] = "��ξ�١�����";
		m_strName[40] = "��������";
		
		m_strName[41] = "��ľ����˼��";
		m_strName[42] = "��ʤ��������";
		m_strName[43] = "��Ŀ������^";
		m_strName[44] = "ʥˮ�������ӹ�";
		m_strName[45] = "��𽫡�κ����";
		m_strName[46] = "ʥ������������";
		m_strName[47] = "�����Ŀ������";
		m_strName[48] = "Ħ�ƽ�ᡤŷ��";
		m_strName[49] = "�����⥡��˷�";
		m_strName[50] = "��ë������˳";
		
		m_strName[51] = "�����ӡ�����";
		m_strName[52] = "�����ס�����";
		m_strName[53] = "�����ӡ�����";
		m_strName[54] = "С�º����";
		m_strName[55] = "���ʹ󡤹�ʢ";
		m_strName[56] = "��ҽ������ȫ";
		m_strName[57] = "���ײ����ʸ���";
		m_strName[58] = "���Ż�����Ӣ";
		m_strName[59] = "һ���ࡤ������";
		m_strName[60] = "ɥ���񡤱���";
		
		m_strName[61] = "����ħ��������";
		m_strName[62] = "ëͷ�ǡ�����";
		m_strName[63] = "�����ǡ�����";
		m_strName[64] = "�˱���߸�����";
		m_strName[65] = "�����ʥ������";
		m_strName[66] = "��۽�������";
		m_strName[67] = "�����ɡ�����";
		m_strName[68] = "�����ԡ�ͯ��";
		m_strName[69] = "�����ס�ͯ��";
		m_strName[70] = "��ᦸ͡��Ͽ�";
		
		m_strName[71] = "ͨ��Գ���";
		m_strName[72] = "���������´�";
		m_strName[73] = "�׻��ߡ��";
		m_strName[74] = "�����ɾ���֣����";
		m_strName[75] = "��β�ꡤ������";
		m_strName[76] = "�����ӡ�����";
		m_strName[77] = "�����ӡ��ֺ�";
		m_strName[78] = "���������";
		m_strName[79] = "�м�����������";
		m_strName[80] = "С�������´�";
		
		m_strName[81] = "�ٵ�������";
		m_strName[82] = "�����ա�����";
		m_strName[83] = "�����졤��Ǩ";
		m_strName[84] = "����桤Ѧ��";
		m_strName[85] = "���۱롤ʩ��";
		m_strName[86] = "С��������ͨ";
		m_strName[87] = "�򻢽�������";
		m_strName[88] = "������������";
		m_strName[89] = "��Ǯ���ӡ���¡";
		m_strName[90] = "������������";
		
		m_strName[91] = "����������Ԩ";
		m_strName[92] = "Ц�滢���츻";
		m_strName[93] = "���غ��ɡ����";
		m_strName[94] = "���۲����̸�";
		m_strName[95] = "һ֦��������";
		m_strName[96] = "�����й١�����";
		m_strName[97] = "���ۻ�������";
		m_strName[98] = "û��Ŀ����ͦ";
		m_strName[99] = "ʯ������ʯ��";
		m_strName[100] = "Сξ�١�����";
		
		m_strName[101] = "ĸ��桤�˴�ɩ";
		m_strName[102] = "��԰�ӡ�����";
		m_strName[103] = "ĸҹ�桤�����";
		m_strName[104] = "�����š�������";
		m_strName[105] = "�յ���������";
		m_strName[106] = "�����󡤰�ʤ";
		m_strName[107] = "�����顤ʱǨ";
		m_strName[108] = "��ëȮ���ξ�ס";
		
		return true;
	}
}
