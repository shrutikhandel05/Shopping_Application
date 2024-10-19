package com.shopping;

import com.Abstract.ShopFactory;

public class GSShopFactory extends ShopFactory {

	int accNo;
	String accNm;
	float charges;
	boolean isSalaried;
	float deliveryCharges;
	
	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isSalaried) {
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo, accNm, charges, isSalaried);
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalacc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsnormal=new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return gsnormal;
	}

}
