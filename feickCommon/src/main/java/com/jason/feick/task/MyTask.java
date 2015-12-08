package com.jason.feick.task;

import java.util.HashMap;

import android.content.Context;

import com.jason.feick.net.GetData;
import com.jason.feick.net.GetDataConfing;
import com.jason.feick.net.GetData.ResponseCallBack;
import com.jason.feick.util.LogUtil;

public class MyTask extends Thread {

	protected ResponseCallBack callBack;
	protected HashMap<String, Object> par;
	protected String use;
	protected String function;
	protected int mark;
	protected GetData getData;
	
	public MyTask(Context context,ResponseCallBack callBack1,  HashMap<String, Object> parm, String function, String usage, int mark) {
		super();
		callBack = callBack1;
		par = parm;
		use = usage;
		this.function = function;
		this.mark = mark;
		this.getData = new GetData(context);
	}
	
	

	@Override
	public void run() {
		getData.doPost(callBack, GetDataConfing.url, par,null,function, mark);
		super.run();
	}



	@Override
	public String toString() {
		return "Thread: "+getFunction();
	}

	public void log(){
		LogUtil.Log(function, "MyTask [callBack=" + callBack + ", par=" + par + ", use=" + use
				+ ", function=" + function + ", mark=" + mark + ", getData="
				+ getData + "]");
	}


	public ResponseCallBack getCallBack() {
		return callBack;
	}

	public void setCallBack(ResponseCallBack callBack) {
		this.callBack = callBack;
	}

	public HashMap<String, Object> getPar() {
		return par;
	}

	public void setPar(HashMap<String, Object> par) {
		this.par = par;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public GetData getGetData() {
		return getData;
	}

	public void setGetData(GetData getData) {
		this.getData = getData;
	}
	
	
 

}
