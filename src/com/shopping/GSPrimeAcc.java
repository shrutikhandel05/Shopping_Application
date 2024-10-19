package com.shopping;

import com.Abstract.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	static final private float Charges=10;
	int accNo;
	String accNm;
	float charges;
	boolean isPrime;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
		this.isPrime=isPrime;
		
	}
    @Override
	public void bookProducts(float charges)
	{
    	System.out.println("Dear prime user,your charges are:"+(charges+Charges));
	}

	
	@Override
	public String toString() {
		return "PRIME_ACCOUNT [Account No=" + accNo + ",Account Name=" + accNm + ", Total Charges=" + charges + ", isPrime=" + isPrime
				+ "]";
	}
	

}
