package com.lightswitch;

public class LightSwitch {
	LightState state;
	int level = 0;
	public int getLevel() { return level; }
	public void dim() {
		if(state == LightState.ON && level > 1)	level--;
	}
	
	public LightSwitch() {
		state = LightState.OFF;
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
	
}
