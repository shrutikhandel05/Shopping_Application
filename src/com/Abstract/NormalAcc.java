package com.Abstract;

import com.Abstract.ShopAcc;

abstract public class NormalAcc extends ShopAcc {
	private final float deliveryCharges;
	int accNo;
	String accNm;
	float charges;
	public NormalAcc(int accNo, String accNm,float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
		
	}

	@Override
	public void bookProducts(float deliveryCharges)
	{
	
		System.out.println("Delivery Charges:"+deliveryCharges);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + "]";
	}
}
	