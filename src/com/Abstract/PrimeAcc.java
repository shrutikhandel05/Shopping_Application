package com.Abstract;

import com.Abstract.ShopAcc;

abstract public  class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	static final float delivery_charges=0 ;
    int accNo;
    String accNm;
    float charges;
    

	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
		
		
	}
	//in this class we override only one method i.e bookProducts()
	@Override
	public void bookProducts(float charges)
	{
	System.out.println("Delivery Charges:"+delivery_charges);	
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	

	

	
	

}
