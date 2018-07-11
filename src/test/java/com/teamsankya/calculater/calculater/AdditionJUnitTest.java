package com.teamsankya.calculater.calculater;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class AdditionJUnitTest {
	@Test
	public void addIntTest()
	{
		Addition addition = new  Addition();
		int sum = addition.addition(10,20);
		//Assert.assertEquals(30, sum);
		TestCase.assertEquals(30, sum);
	}
	
	@Test
	public void addLongTest()
	{
		Addition addition = new  Addition();
		long sum = Addition.addition(100000l, 200000l);
		Assert.assertEquals(300000, sum);
	}

	
	@Test
	public void addFloatTest()
	{
		Addition addition = new  Addition();
		float sum = Addition.addition(110.50f, 120.30f);
		TestCase.assertEquals(230.80f, sum);
	}

	
	@Test
	public void addDoubleTest()
	{
		Addition addition = new  Addition();
		double sum = addition.addition(100.00000,200.00000);
		TestCase.assertEquals(300.00000, sum);
	}

	
	@Test
	public void addByteTest()
	{
		Addition addition = new  Addition();
		byte sum = (byte) Addition.addition(1, 2);
		Assert.assertEquals(3, sum);
	}


}
