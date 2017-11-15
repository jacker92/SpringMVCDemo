package com.s1700306.service;

public class Calculator {
	
	public long add(long i1, long i2) {
		return i1+i2;
	}

	public long multiplicate(long i1, long i2) {
		return i1*i2;
	}
	
	public double division (long i1, long i2) {
		if (i2 == 0) {
			return 0;
		} 
		return Math.round((double)i1/i2*100)/100d;
	}

	public long substraction(long i1, long i2) {
		return i1-i2;
	}
	
	public boolean isNumber(String s) {
		try {
			long number = Long.parseLong(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
