/*******
 * 	水浒卡配置
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
		
		m_strName[1] = "呼保义·宋江";
		m_strName[2] = "玉麒麟·卢俊义";
		m_strName[3] = "智多星·吴用";
		m_strName[4] = "入云龙·公孙胜";
		m_strName[5] = "大刀·关胜";
		m_strName[6] = "豹子头·林冲";
		m_strName[7] = "霹雳火·秦明";
		m_strName[8] = "双鞭·呼延灼";
		m_strName[9] = "小李广·花容";
		m_strName[10] = "小旋风·柴进";
		
		m_strName[11] = "扑天雕·李应";
		m_strName[12] = "美髯公·朱仝";
		m_strName[13] = "花和尚·鲁智深";
		m_strName[14] = "行者·武松";
		m_strName[15] = "双枪将·董平";
		m_strName[16] = "没羽箭·张清";
		m_strName[17] = "青面兽·杨志";
		m_strName[18] = "金枪手·徐宁";
		m_strName[19] = "急先锋·索超";
		m_strName[20] = "神行太保·戴宗";
		
		m_strName[21] = "赤发鬼·刘唐";
		m_strName[22] = "黑旋风·李逵";
		m_strName[23] = "九纹龙·史进";
		m_strName[24] = "没遮拦·穆弘";
		m_strName[25] = "插翅虎·雷横";
		m_strName[26] = "混江龙·李俊";
		m_strName[27] = "立地太岁·阮小二";
		m_strName[28] = "船火儿·张横";
		m_strName[29] = "短命二郎·阮小五";
		m_strName[30] = "浪里白条·张顺";
		
		m_strName[31] = "活阎罗·阮小七";
		m_strName[32] = "病关索·杨雄";
		m_strName[33] = "拼命三郎·石秀";
		m_strName[34] = "两头蛇·解珍";
		m_strName[35] = "双尾蝎·解宝";
		m_strName[36] = "浪子·燕青";
		m_strName[37] = "神机军师·朱武";
		m_strName[38] = "镇三山·黄信";
		m_strName[39] = "病尉迟·孙立";
		m_strName[40] = "丑郡马·宣赞";
		
		m_strName[41] = "井木犴·郝思文";
		m_strName[42] = "百胜将·韩滔";
		m_strName[43] = "天目将·彭玘";
		m_strName[44] = "圣水将·单延圭";
		m_strName[45] = "神火将·魏定国";
		m_strName[46] = "圣手书生·萧让";
		m_strName[47] = "铁面孔目·裴宣";
		m_strName[48] = "摩云金翅·欧鹏";
		m_strName[49] = "火眼狻猊·邓飞";
		m_strName[50] = "锦毛虎·燕顺";
		
		m_strName[51] = "锦豹子·杨林";
		m_strName[52] = "轰天雷·凌振";
		m_strName[53] = "神算子·蒋敬";
		m_strName[54] = "小温侯·吕方";
		m_strName[55] = "赛仁贵·郭盛";
		m_strName[56] = "神医·安道全";
		m_strName[57] = "紫髯伯·皇甫瑞";
		m_strName[58] = "矮脚虎·王英";
		m_strName[59] = "一丈青·扈三娘";
		m_strName[60] = "丧门神·鲍旭";
		
		m_strName[61] = "混世魔王·樊瑞";
		m_strName[62] = "毛头星·孔明";
		m_strName[63] = "独火星·孔亮";
		m_strName[64] = "八臂哪吒·项充";
		m_strName[65] = "飞天大圣·李衮";
		m_strName[66] = "玉臂匠·金大坚";
		m_strName[67] = "铁笛仙·马麟";
		m_strName[68] = "出洞蛟·童威";
		m_strName[69] = "翻江蜃·童猛";
		m_strName[70] = "玉幡竿·孟康";
		
		m_strName[71] = "通臂猿·侯健";
		m_strName[72] = "跳涧虎·陈达";
		m_strName[73] = "白花蛇·杨春";
		m_strName[74] = "白面郎君·郑天寿";
		m_strName[75] = "九尾龟·陶宗旺";
		m_strName[76] = "铁扇子·宋清";
		m_strName[77] = "铁叫子·乐和";
		m_strName[78] = "花项虎·龚旺";
		m_strName[79] = "中箭虎·丁得孙";
		m_strName[80] = "小遮拦·穆春";
		
		m_strName[81] = "操刀鬼·曹正";
		m_strName[82] = "云里金刚·宋万";
		m_strName[83] = "摸着天·杜迁";
		m_strName[84] = "病大虫·薛永";
		m_strName[85] = "金眼彪·施恩";
		m_strName[86] = "小霸王·周通";
		m_strName[87] = "打虎将·李忠";
		m_strName[88] = "鬼脸儿·杜兴";
		m_strName[89] = "金钱豹子·汤隆";
		m_strName[90] = "独角龙·邹润";
		
		m_strName[91] = "出林龙·邹渊";
		m_strName[92] = "笑面虎·朱富";
		m_strName[93] = "旱地忽律·朱贵";
		m_strName[94] = "铁臂膊·蔡福";
		m_strName[95] = "一枝花·蔡庆";
		m_strName[96] = "催命判官·李立";
		m_strName[97] = "青眼虎·李云";
		m_strName[98] = "没面目·焦挺";
		m_strName[99] = "石将军·石勇";
		m_strName[100] = "小尉迟·孙新";
		
		m_strName[101] = "母大虫·顾大嫂";
		m_strName[102] = "菜园子·张青";
		m_strName[103] = "母夜叉·孙二娘";
		m_strName[104] = "活闪婆·王定六";
		m_strName[105] = "险道神·郁保四";
		m_strName[106] = "白日鼠·白胜";
		m_strName[107] = "鼓上蚤·时迁";
		m_strName[108] = "金毛犬·段景住";
		
		return true;
	}
}
