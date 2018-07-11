package com.teamsankya.calculater.calculater;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class DivitionJUnitTest2 {
	@Test
	public void addIntTest()
	{
		Divition divition = new  Divition();
		int sum = Divition.divition(10,20);
		//Assert.assertEquals(30, sum);
		TestCase.assertEquals(0.5, sum);
	}
	
	@Test
	public void addLongTest()
	{
		Divition divition = new  Divition();
		long sum = Divition.divition(100000l, 200000l);
		Assert.assertEquals(0.5, sum);
	}

	
	@Test
	public void addFloatTest()
	{
		Divition divition = new  Divition();
		float sum = Divition.divition(110.50f, 120.30f);
		TestCase.assertEquals(0.918536f, sum);
	}

	
	@Test
	public void addDoubleTest()
	{
		Divition divition = new  Divition();
		double sum = Divition.divition(100.00000,200.00000);
		TestCase.assertEquals(0.5, sum);
	}

	
	@Test
	public void addByteTest()
	{
		Divition divition = new  Divition();
		byte sum = (byte) Divition.divition(1, 2);
		Assert.assertEquals(0.5, sum);
	}


}
