package com.teamsankya.calculater.calculater;

import org.junit.Assert;
import org.junit.Test;

import com.sun.org.apache.xml.internal.utils.SuballocatedByteVector;

import junit.framework.TestCase;


public class SubstrectionJUnitTest {
	@Test
	public void addIntTest()
	{
		Substrction substrction = new  Substrction();
		int sum = Substrction.substraction(10,20);
		//Assert.assertEquals(30, sum);
		TestCase.assertEquals(-10, sum);
	}
	
	@Test
	public void addLongTest()
	{
		Substrction substrction = new  Substrction();
		long sum = Substrction.substraction(100000l, 200000l);
		Assert.assertEquals(-100000l, sum);
	}

	
	@Test
	public void addFloatTest()
	{
		Substrction substrction = new  Substrction();
		float sum = Substrction.substraction(110.50f, 120.30f);
		TestCase.assertEquals(-110.20f, sum);
	}

	
	@Test
	public void addDoubleTest()
	{
		Substrction substrction = new  Substrction();
		double sum = Substrction.substraction(100.00000,200.00000);
		TestCase.assertEquals(100.00000, sum);
	}

	
	@Test
	public void addByteTest()
	{
		Substrction substrction = new  Substrction();
		byte sum = (byte) Substrction.substraction(1, 2);
		Assert.assertEquals(1, sum);
	}


}
