package com.jason.feick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.jason.feick.util.LogUtil;

public class LogActivity extends IntrusionActivity {
	protected String tag = this.getClass().getSimpleName();

	private static long lastClickTime;

	public static boolean isFastDoubleClick() {
		long time = System.currentTimeMillis();
		long timeD = time - lastClickTime;
		if (0 < timeD && timeD < 5000) {
			return true;
		}
		lastClickTime = time;
		return false;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtil.Log(tag, "onCreate()");
	}

	@Override
	protected void onDestroy() {
		LogUtil.Log(tag, "onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		LogUtil.Log(tag, "onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		LogUtil.Log(tag, "onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		LogUtil.Log(tag, "onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {

		LogUtil.Log(tag, "onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		LogUtil.Log(tag, "onStop()");
		super.onStop();
	}

}
