package com.teamsankya.calculater.calculater;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class MultiplecationJUnitTest {
	@Test
	public void addIntTest()
	{
		Multiplection multiplection = new  Multiplection();
		int sum = Multiplection.multiplecation(10,20);
		//Assert.assertEquals(30, sum);
		TestCase.assertEquals(200, sum);
	}
	
	@Test
	public void addLongTest()
	{
		Multiplection multiplection = new  Multiplection();
		long sum = Multiplection.multiplecation(100000l, 200000l);
		Assert.assertEquals(300000, sum);
	}

	
	@Test
	public void addFloatTest()
	{
		Multiplection multiplection = new  Multiplection();
		float sum = Multiplection.multiplecation(110.50f, 120.30f);
		TestCase.assertEquals(13293.15f, sum);
	}

	
	@Test
	public void addDoubleTest()
	{
		Multiplection multiplection = new  Multiplection();
		double sum = Multiplection.multiplecation(100.00000,200.00000);
		TestCase.assertEquals(20000, sum);
	}

	
	@Test
	public void addByteTest()
	{
		Multiplection multiplection = new  Multiplection();
		byte sum = (byte) Multiplection.multiplecation(1, 2);
		Assert.assertEquals(2, sum);
	}


}
