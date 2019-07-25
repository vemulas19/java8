package com.java8.interfacemethods;

public class SamsungSmartMobile implements ISmartMobile {

	@Override
	public void enableWifi() {
		System.out.println("Samsung wifi");
	}

	@Override
	public void enableGps() {
		System.out.println("Samsung Gps");
	}


}
