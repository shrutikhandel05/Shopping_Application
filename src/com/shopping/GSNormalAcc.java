package com.shopping;

import com.Abstract.NormalAcc;

public class GSNormalAcc extends NormalAcc{
    int accNo;
    String accNm;
    float charges;
    float deliveryCharges;
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
		this.deliveryCharges=deliveryCharges;
		
	}

	
	@Override
	public void bookProducts(float deliveryCharges)
	{
		System.out.println("Dear normal user,your total charge is:"+(deliveryCharges+charges));
	}

	@Override
	public String toString() {
		return "NORMAL_ACCOUNT [Account No=" + accNo + ", Account Name=" + accNm + ", Total Charges=" + charges + ", Delivery Charges="
				+ deliveryCharges + "]";
	}
	
	

}
