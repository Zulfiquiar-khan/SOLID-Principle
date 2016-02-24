package com.zak.isp.example.good;


public class Main {

	public static void main(String[] args) {
		
		IClock icClock=new SimpleClock();
		System.out.println(icClock.getTime());
		
		IAlarm iaAlarm=new AlarmClock();
		iaAlarm.setAlarm(10);
		iaAlarm.startAlarm();
		System.out.println("Alarm completed");
	}

}
