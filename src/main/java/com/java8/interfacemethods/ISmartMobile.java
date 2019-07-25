package com.java8.interfacemethods;

//Once interfact is defined you are not allowed to change till 1.7v.
public interface ISmartMobile {

	void enableWifi();
	public abstract void enableGps();
	default void enableMobileData(){
		System.out.println("This is dummy implementation");
	}
}
