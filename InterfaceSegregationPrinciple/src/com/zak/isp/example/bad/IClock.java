package com.zak.isp.example.bad;

import java.util.Date;

public interface IClock {
	public Date getTime();
	public void setTime(long time);
	public void setAlarm(long offset);
	public void startAlarm();
}
