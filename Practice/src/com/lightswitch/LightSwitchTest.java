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
	
	@Test
	public void testPower() {
		LightSwitch s = new LightSwitch();
		
		assertEquals(0, s.getLevel());	// 초기 상태
		s.control();					// 전구 ON
		assertEquals(3, s.getLevel());	
		s.dim();						// 밝기 다운
		assertEquals(2, s.getLevel());
		s.power();						// 전원 OFF
		assertEquals(0, s.getLevel());	
		s.power();						// 전원 ON ( 밝기 이전 상태로 복원 )
		assertEquals(2, s.getLevel());	 
		
	}

}
