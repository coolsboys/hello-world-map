package com.example.maptext;

import java.util.Random; 
public class RandomNumberUtil { 
   private final static String NUM_CHAR = "0123456789"; 
   private static int charLen = NUM_CHAR.length(); 


   /** 
    * ����ϵͳʱ����ָ��λ��������� 
    * @param randomNumberDigit �������λ�� 
    *  @return  ��õ������ 
    */ 
   public static String getRandomNumber(int randomNumberDigit) { 
      long seed = System.currentTimeMillis();// ���ϵͳʱ�䣬��Ϊ��������������� 
      StringBuffer sb = new StringBuffer();// װ�����ɵ������ 
      Random random = new Random(seed);// ����������������� 
      for (int i = 0; i < randomNumberDigit; i++) { 
         sb.append(NUM_CHAR.charAt(random.nextInt(charLen))); 
      } 


      return sb.toString(); 
   } 

   public static void main(String[] args) { 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
      System.out.println(getRandomNumber(32)); 
   } 
} 