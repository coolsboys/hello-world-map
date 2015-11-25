package com.example.maptext;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {
	private static Actions action = new Action();
	
	public static final String numberChar = "0123456789";
	 
    /**
     * ����ϵͳʱ����ָ��λ���������
     * 
     * @return ��õ������
     */
    
	
	public static void main(String[] args) {
		Map<String,Object> sub = new HashMap<String,Object>();
		sub.put("aa", "aaa");
		action.addResult("a", sub);
		Map<String, Object> map = (Map<String, Object>) action.getResult().get("a");
		String s =  (String)map.get("aa") == "aaa"?"yes":"no";
		System.out.println(s);
		s = map.containsKey("aaa")?(String)map.get("aa"):"don't have";
		System.out.println(s);
		
		Date d = new Date();  
        System.out.println(d);  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);  
        System.out.println("��ʽ��������ڣ�" + dateNowStr);
        
        SimpleDateFormat sdw = new SimpleDateFormat("yyyy-MM-dd"); 
        dateNowStr = sdw.format(d);  
        System.out.println("��ʽ��������ڣ�" + dateNowStr);
        
        if ("2015-07-22".compareTo("2015-06-23")<0) {
        	System.out.println("С��");
        }
        if ("2015-06-23".compareTo("2015-06-23")==0) {
        	System.out.println("==");
        }
        
        double pcPrice = 0.01;
		pcPrice = pcPrice < 0.00000001 ? 0.00 : pcPrice;
		DecimalFormat format = new DecimalFormat("###0.##");
		if (pcPrice == 0.0099999999999999999) {
			System.out.println("xiangdeng a a a !");
		}
		
		System.out.println("��ʽ������Ϊ��" + format.format(pcPrice));

        
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        System.out.println("�����" + getRandom());
        
        
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("uuid", null);
        System.out.println(""+map1.get("uuid"));
        
        System.out.println(Integer.valueOf("1"));
	}
	
	public static String getRandom() {
		 
        Long seed = System.currentTimeMillis();// ���ϵͳʱ�䣬��Ϊ���������������
 
        StringBuffer sb = new StringBuffer();// װ�����ɵ������
 
        Random random = new Random(seed);// �����������������
 
        for (int i = 0; i < 20; i++) {
 
            sb.append(numberChar.charAt(random.nextInt(numberChar.length())));
        }
 
        return sb.toString();
 
    }
}
