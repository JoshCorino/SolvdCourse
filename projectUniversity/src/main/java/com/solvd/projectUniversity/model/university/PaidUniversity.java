
package com.solvd.projectUniversity.model.university;

import com.solvd.projectUniversity.exceptions.PriceZeroException;

public class PaidUniversity extends University{
	
	private double quota;
	
	public PaidUniversity(String name,double quota) throws PriceZeroException {
		super(name);
		this.setQuota(quota);
	}


	/**
	 * @return the quota
	 */
	public double getQuota() {
		return quota;
	}

	/**
	 * @param quota the quota to set
	 */
	public void setQuota(double quota) throws PriceZeroException{
		
		if(quota==0) 
			throw new PriceZeroException();
		else
			this.quota = quota;
	}
}
