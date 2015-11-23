package com.example.maptext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Test {
	
	public static final String numberChar = "0123456789";
	
	private static SimpleDateFormat sdf = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hccid3sItems = {""};
		for (String s : hccid3sItems) {
			if (s.equals(" ")) {
				System.out.println("xxxxx");
			}
		}
		
		String ss = "0011";
		System.out.println(ss.matches("[0-9]+"));;
		
		System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        System.out.println(getRandom());
        
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid+":length="+uuid.length()); 
        
        Random random = new Random();;
        
        String s = "hjudwgohxzVu96krv/T6Hg==";
        //System.out.println(Math.abs(s.hashCode()));
        
        System.out.println("XXXX" + Math.abs(hash(s)));
        
        System.out.println(Math.abs(s.hashCode()) % 100);
        
        System.out.println(new Random().nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        
        
	}
	
	public static String getRandom() {
		
		String seed1 = getTimeStamp();
		
        Long seed = System.currentTimeMillis();// 获得系统时间，作为生成随机数的种子
        
        StringBuffer sb = new StringBuffer();// 装载生成的随机数
 
        Random random = new Random();// 调用种子生成随机数
 
        for (int i = 0; i < 32; i++) {
 
            sb.append(numberChar.charAt(random.nextInt(numberChar.length())));
        }
 
        sb.append(" " + seed);
        
        sb.append(" " + seed1);
        
        return sb.toString();
 
    }
	
    /**
     * 取得时间戳
     * @return
     */
    private static String getTimeStamp(){
        sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(new Date());
    }
    

	static public int hash(String data) {
		int seed = 31; // never change
		byte[] dataBytes = data.getBytes();
		return hash(dataBytes, 0, dataBytes.length, seed);
	}

	static public int hash(byte[] data, int offset, int length, int seed) {
		int m = 0x5bd1e995; // never change
		int r = 24;
		int h = seed ^ length;
		int len_4 = length >> 2;

		for (int i = 0; i < len_4; i++) {
			int i_4 = (i << 2) + offset;
			int k = data[i_4 + 3];
			k = k << 8;
			k = k | (data[i_4 + 2] & 0xff);
			k = k << 8;
			k = k | (data[i_4 + 1] & 0xff);
			k = k << 8;
			// noinspection PointlessArithmeticExpression
			k = k | (data[i_4 + 0] & 0xff);
			k *= m;
			k ^= k >>> r;
			k *= m;
			h *= m;
			h ^= k;
		}
		// avoid calculating modulo
		int len_m = len_4 << 2;
		int left = length - len_m;
		int i_m = len_m + offset;

		if (left != 0) {
			if (left >= 3) {
				h ^= data[i_m + 2] << 16;
			}
			if (left >= 2) {
				h ^= data[i_m + 1] << 8;
			}
			if (left >= 1) {
				h ^= data[i_m];
			}

			h *= m;
		}

		h ^= h >>> 13;
		h *= m;
		h ^= h >>> 15;

		return h;
	}

}
