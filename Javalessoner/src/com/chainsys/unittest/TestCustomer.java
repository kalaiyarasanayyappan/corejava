package com.chainsys.unittest;

import com.chainsys.Arrays.customer;

public class TestCustomer 
{
	public static void main(String[] args) 
	{
		customer c1=new customer();		
		//c1.setCustomerID(123);
		c1.setName("Tom "+(char)91);
		c1.setAddress("Some where in India");
		c1.setCity("Chennai");
		c1.setMobileNo(9888444411d);
		
		c1.echo();
		c1.placeOrder();
		c1.getFeedback();		
	}
}
