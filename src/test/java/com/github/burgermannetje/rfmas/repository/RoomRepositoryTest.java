package com.github.burgermannetje.rfmas.repository;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RoomRepositoryTest {
	@Rule
	public ExpectedException exception = ExpectedException.none(); 
	@Test
	public void test() {
		RoomRepository repo = new RoomRepository();		
//		repo.add(new Room("01.10", "Room with a view", 12, "Beamer"));
	}

}
