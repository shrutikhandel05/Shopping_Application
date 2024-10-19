package com.Abstract;

abstract public class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	public ShopAcc(int accNo, String accNm, float charges) {

		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	
	 public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getCharges() {
		return charges;
	}


	public void setCharges(float charges) {
		this.charges = charges;
	}


	public void bookProducts(float charges)
	{
		System.out.println("Products are booked and charges are:"+charges);
	}
	public void items(float charges)
	{
		System.out.println("Items are delivered and charges are:"+charges);
	}
	
	
	//tostring method to return values using object
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	

}

