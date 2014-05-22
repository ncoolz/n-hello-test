package com.navercorp.nhelloworld.library.helloworld;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {

	HelloWorld helloWorld;

	@Before
	public void setUp() {
		helloWorld = new HelloWorld();
	}
	
	@Test
	public void testGetHelloMethodShouldReturnHello() {
		// Given
		String hello = helloWorld.getHello();
		// Then
		assertEquals(hello, "Hello");
	}
	
	@Test
	public void testGetWorldMethodShouldReturnWorld() {
		// Given
		String world = helloWorld.getWorld();
		// Then
		assertEquals(world, "World");
	}
	
	@Test
	public void testGetCommaMethodShouldReturnComma() {
		// Given
		String comma = helloWorld.getComma();
		// Then
		assertEquals(comma, ",");
	}
}
