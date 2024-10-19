package com.Abstract;

import com.Abstract.NormalAcc;
import com.Abstract.PrimeAcc;

abstract public class ShopFactory {

	int accNo;
	String accNm;
	float charges;
	boolean isPrime;
	
	abstract public PrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrime);
	abstract public NormalAcc getNewNormalacc(int accNo,String accNm,float charges,float deliveryCharges);
}
