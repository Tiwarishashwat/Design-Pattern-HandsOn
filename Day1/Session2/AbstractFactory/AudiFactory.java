package com.st.abstractfactorypattern.day1;

public class AudiFactory extends Factory{

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadLight() {
		return new AudiHeadlight();
	}
	
}
