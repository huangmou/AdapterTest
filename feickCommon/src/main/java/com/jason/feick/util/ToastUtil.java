package com.jason.feick.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtil
{
  private final String TAG = getClass().getSimpleName();
  private static ToastUtil toastUtil;
  private Toast toast = null;
  private Activity context;
  private Timer timer;
  private ToHideTimerTask task;
  private Object obj;
  private final int what_toHide = 0;

  private Handler handler = new Handler()
  {
    public void handleMessage(Message msg) {
      ToastUtil.this.myHide();
    }
  };

  private ToastUtil(Activity context)
  {
    this.context = context;
    this.toast = Toast.makeText(this.context.getApplicationContext(), "Toast", 1);
    try
    {
      Field field = this.toast.getClass().getDeclaredField("mTN");
      field.setAccessible(true);
      this.obj = field.get(this.toast);
    } catch (Exception e) {
      Log.w(this.TAG, "init error");
    }

    this.timer = new Timer();
  }

  public static ToastUtil initToast(Activity context)
  {
    if (toastUtil == null) {
      toastUtil = new ToastUtil(context);
    }
    return toastUtil;
  }

  public Toast getToast()
  {
    return this.toast;
  }

  public void showToast(String msg)
  {
    if (this.toast != null) {
      this.toast.setText(msg);
    }
    showToast();
  }
  
  public void setGravity(int gravity, int xOffset, int yOffset){
	  this.toast.setGravity(gravity, xOffset, yOffset);
  }

  void showToast() {
    if (this.toast != null)
      if (Build.VERSION.SDK_INT >= 14) {
        if (this.toast != null) {
          this.toast.setDuration(1);
//          this.toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, DisplayUtil.getScreenHeight(context));
          this.toast.show();
        }
      }
      else myShow();
  }

  public void showToast(int resId)
  {
    showToast(this.context.getResources().getString(resId));
  }

  public void hideToast()
  {
    if (Build.VERSION.SDK_INT >= 14) {
      if (this.toast != null)
        this.toast.cancel();
    }
    else
      myHide();
  }

  private void myShow()
  {
    try
    {
      Method method = this.obj.getClass().getDeclaredMethod("show", null);

      method.invoke(this.obj, null);
      if (this.task != null) {
        this.task.cancel();
      }
      this.task = new ToHideTimerTask();
      this.timer.schedule(this.task, 3000L);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void myHide()
  {
    try
    {
      Method method = this.obj.getClass().getDeclaredMethod("hide", null);
      method.invoke(this.obj, null);
    }
    catch (Exception localException) {
    }
  }

  private class ToHideTimerTask extends TimerTask {
    private ToHideTimerTask() {
    }

    public void run() {
      ToastUtil.this.handler.sendEmptyMessage(0);
    }
  }
}