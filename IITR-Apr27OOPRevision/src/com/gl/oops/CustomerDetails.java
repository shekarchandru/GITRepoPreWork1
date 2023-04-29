package com.gl.oops;

public class CustomerDetails {
	
	String customerID;
	String customerName;
	String customerAddress;
	String customerPhone;
	
	
	public CustomerDetails() {
		super();
	}
	public CustomerDetails(String customerID, String customerName, String customerAddress, String customerPhone) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerPhone=" + customerPhone + "]";
	}
	
	

}
