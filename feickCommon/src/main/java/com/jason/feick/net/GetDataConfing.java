/**
 * Copyright (c) 2013 An Yaming,  All Rights Reserved
 */
package com.jason.feick.net;



/**
 * 获取数据信息的配置信息
 * 
 * @author Jason
 * 
 */
public class GetDataConfing {
	/**
	 * 获取数据的服务器地址
	 */
	
	public static String url;
	
	/*{"method":"configure.get", "timestamp":"2014-12-20 17:15:23", "format":"json", "version":"1.0", "charset":"UTF-8", 
	"sign":"xxxxx", "sign_method":"md5", "app_key":"keyxxxxxxx", "app_session":"sessionxxxxxx",
	 "params":"{\"configure_key\":\"abcdefdfad\"}"}*/
	public static String  methodKey = "method";
	public static String  timestampKey = "timestamp";
	public static String  formatKey = "format";
	public static String  formatValue = "json";
	public static String  versionKey = "version";
	public static String  versionValue = "1.0";
	public static String  charsetKey = "charset";
	public static String  charsetValue = "UTF-8";
	public static String  signKey = "sign";
	public static String  sign_methodKey = "sign_method";
	public static String  sign_methodValue = "md5";
	public static String  app_keyKey = "app_key";
	public static String  app_keyValue = "c41041841691b85a37802ffef6e9c417";
	public static String  app_sessionKey = "app_session";
	public static String  app_sessionValue = "806ab23cd2e4f6390c8cf79014a3dbdf";
	public static String  paramsKey = "params";
	public static String  app_secretKey = "app_secret";
	public static String  app_secretValue = "f490c4de27b60dd17b8476dd185d7d32";
	
	public static void setAppConfig(String appKeyValue, String appSessionValue, String appSecretValue){
		app_keyValue = appKeyValue;
		app_sessionValue = appSessionValue;
		app_secretValue = appSecretValue;
	}
	
	public static void setUrl(int devMode){
		if (devMode == 2) {
//			线上地址
			url = "http://api.feichangkuai.com.cn/rest";
		} else if (devMode == 1) {
//			test
			url = "http://testapi.feichangkuai.com.cn/rest";
		}else if (devMode == 0) {
//			dev
			url = "http://192.168.1.36/rest";
		}
	}
	
	
	
}
