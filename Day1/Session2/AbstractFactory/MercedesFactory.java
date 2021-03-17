package com.st.abstractfactorypattern.day1;

public class MercedesFactory extends Factory{

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

	@Override
	public Headlight makeHeadLight() {
		return new MercedesHeadlight();
	}
	
}
