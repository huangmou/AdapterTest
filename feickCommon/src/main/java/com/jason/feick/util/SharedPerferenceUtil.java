package com.jason.feick.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPerferenceUtil {
	
	public static void setSystemConfig(Context context, String preferenceName, String key, String value){
		SharedPreferences sp = context.getSharedPreferences(preferenceName,  Context.MODE_APPEND);
		sp.edit().putString(key, String.valueOf(value)).commit();
	}
	public static String getSystemConfig(Context context, String preferenceName, String key){
		SharedPreferences sp = context.getSharedPreferences(preferenceName,  Context.MODE_APPEND);
		return sp.getString(key, "");
	}

}
