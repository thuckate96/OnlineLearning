/**
 * 
 */
package com.onlinelearning.utitils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author ThucVV
 * @since 18-07-2018
 * 
 */
public class ApiJsonUtil {
	
	/**
	 * 
	 * @param jsonObj is json object
	 * @param member is the member of json object
	 * @return value of member String from json object
	 */
	public static String getJsonString(JsonObject jsonObj, String member) { 
		return jsonObj.get(member).getAsString();
	}
	
	/**
	 * 
	 * @param jsonObj is json object
	 * @param member is the member of json
	 * @return Integer value of member json
	 * 
	 */
	public static Integer getJsonInteger(JsonObject jsonObj, String member){ 
		return jsonObj.get(member).getAsInt();
	}
	
	/**
	 * 
	 * @param jsonObj is the json object 
	 * @param member is the member of json object
	 * @return value double of member from json object
	 */
	public static Double getJsonDouble(JsonObject jsonObj, String member) {
		
		return jsonObj.get(member).getAsDouble();
	}
	
	/**
	 * 
	 * @param jsonObj is the json object
	 * @param member is the member of json object
	 * @return float value of member from json object
	 */
	public static Float getJsonFloat(JsonObject jsonObj, String member) {
		
		return jsonObj.get(member).getAsFloat();
	}
	
	/**
	 * 
	 * @param jsonObj is the json object
	 * @param member is the member of json object
	 * @return boolean value of member from json object
	 */
	public static boolean getJsonBoolean(JsonObject jsonObj, String member) {
		
		return jsonObj.get(member).getAsBoolean();
	}
	
	/**
	 * 
	 * @param jsonObj is the json object 
	 * @param member is the member of json object
	 * @return character value of member from json object
	 */
	public static Character getJsonCharacter(JsonObject jsonObj, String member) {
		
		return jsonObj.get(member).getAsCharacter();
	}
	
	/**
	 * 
	 * @param jsonObj is the json object
	 * @param member is the member of json object
	 * @return json array of member from json object
	 */
	public static JsonArray getJsonArray(JsonObject jsonObj, String member) {
		
		return jsonObj.get(member).getAsJsonArray();
	}
	
	/**
	 * 
	 * @param json is json string data 
	 * @return json object from json string data 
	 */
	public static JsonObject createJsonObject(String json) {
		return new Gson().fromJson(json, JsonObject.class);
	}
	
	/**
	 * 
	 * @param strJson is the json object
	 * @param member is the member of json object
	 * @return json object from parent json object
	 */
	public static JsonObject getJsonObject(String strJson, String member){
		
		JsonObject json = null;
		try {
			if(0 != strJson.length() && null != strJson) {
				json = createJsonObject(strJson);
			}
			if(null != json) {
				json = json.getAsJsonObject(member);
			}
		} catch (Exception e) {
			json = null;
		} 
		return json;
	}
	
	/**
	 * 
	 * @param strJson js the json object 
	 * @return json object
	 */
	public static JsonObject getJsonObject(String strJson) {
		
		JsonObject json = null;
		try {
			if(0 != strJson.length() && null != strJson) {
				json = createJsonObject(strJson);
			}
			
		} catch (Exception e) {
			json = null;
		}
		
		return json;
	}
}
