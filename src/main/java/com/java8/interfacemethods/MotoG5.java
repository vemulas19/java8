package com.java8.interfacemethods;

public class MotoG5 implements ISmartMobile {
	@Override
	public void enableWifi() {
		System.out.println("MotoG5 wifi");
	}

	@Override
	public void enableGps() {
		System.out.println("MotoG5 Gps");
	}
	
	@Override
	public void enableMobileData() {
		System.out.println("MotoG5 logic to enable Mobiledata!!");
	}
	
	public static void main(String[] args) {
		ISmartMobile ism = new MotoG5();
		ism.enableGps();
		ism.enableMobileData();
	}
}
