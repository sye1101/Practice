package com.lightswitch;

public class LightSwitch {
	LightState state;
	int level = 0;
	PowerPlug plug;
	int temp;
	
	public int getLevel() { return level; }
	public void dim() {
		if(state == LightState.ON && level > 1)	level--;
	}
	
	public LightSwitch() {
		state = LightState.OFF;
		plug = PowerPlug.ON;
	}
	
	public LightState control() {
		if(state == LightState.ON)	{
			state = LightState.OFF;
			level = 0;
		}
		else {
			state = LightState.ON;
			level = 3;
		}
		return state;
	}
	
	public int power() {
		
		if(plug == PowerPlug.OFF) {
			plug = PowerPlug.ON;
			state = LightState.ON;
			level = temp;
		}
		else {
			plug = PowerPlug.OFF;
			state = LightState.OFF;
			temp = level;
			level = 0;
		}
		
		return level;
	}
	
}
