package com.example.maptext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDeepTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		List<String> list = new ArrayList<String>();
		list.add("first");
        map.put( "key1", 1);
        map.put("list", list);
        String s = "11111";
        map.put("s", s);
        map.put("ss", s);
        
        Map<String,Object> mapFirst = new HashMap<String,Object>();
        mapFirst.putAll(map); //Éî¿½±´
        
        System. out.println(mapFirst);

        map.put( "key2", 2);
        list.add("secned");
        
        s = "22222";
        
        System. out.println(map); 
        System. out.println(mapFirst); 
	}

}
