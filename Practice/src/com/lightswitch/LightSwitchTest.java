package com.lightswitch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LightSwitchTest {

	@Test
	public void testSwitch() {
		LightSwitch s = new LightSwitch();
		
		assertEquals(LightState.ON, s.control());
		assertEquals(LightState.OFF, s.control());
		assertEquals(LightState.ON, s.control());
		
	}
	
	@Test
	public void testDimmer() {
		LightSwitch s = new LightSwitch();
		
		assertEquals(0, s.getLevel());
		s.dim();
		assertEquals(0, s.getLevel());
		s.control();
		assertEquals(3, s.getLevel());
		s.dim();
		assertEquals(2, s.getLevel());
		s.dim();
		assertEquals(1, s.getLevel());
		s.dim();
		assertEquals(1, s.getLevel());
		
	}
	

}
