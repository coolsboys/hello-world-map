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
     * 根据系统时间获得指定位数的随机数
     * 
     * @return 获得的随机数
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
        System.out.println("格式化后的日期：" + dateNowStr);
        
        SimpleDateFormat sdw = new SimpleDateFormat("yyyy-MM-dd"); 
        dateNowStr = sdw.format(d);  
        System.out.println("格式化后的日期：" + dateNowStr);
        
        if ("2015-07-22".compareTo("2015-06-23")<0) {
        	System.out.println("小于");
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
		
		System.out.println("格式化后结果为：" + format.format(pcPrice));

        
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        System.out.println("随机数" + getRandom());
        
        
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("uuid", null);
        System.out.println(""+map1.get("uuid"));
        
        System.out.println(Integer.valueOf("1"));
	}
	
	public static String getRandom() {
		 
        Long seed = System.currentTimeMillis();// 获得系统时间，作为生成随机数的种子
 
        StringBuffer sb = new StringBuffer();// 装载生成的随机数
 
        Random random = new Random(seed);// 调用种子生成随机数
 
        for (int i = 0; i < 20; i++) {
 
            sb.append(numberChar.charAt(random.nextInt(numberChar.length())));
        }
 
        return sb.toString();
 
    }
}
