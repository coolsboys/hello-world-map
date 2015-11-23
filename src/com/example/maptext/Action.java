package com.example.maptext;
import java.util.HashMap;
import java.util.Map;


public class Action implements Actions{
	private Map<String,Object> result = new HashMap<String,Object>();
	public void addResult(String key,Object value) {
		result.put(key, value);
	}

	public Map<String,Object> getResult() {
		return this.result;
	}
}
