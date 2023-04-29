package com.gl.oops;

public class Citizen {

		String aadharCardNo;
		String citizenName;
		String citizenAddress;
		int age;
		
		public Citizen() {
			super();
		}

		public Citizen(String aadharCardNo, String citizenName, String citizenAddress, int age) {
			super();
			this.aadharCardNo = aadharCardNo;
			this.citizenName = citizenName;
			this.citizenAddress = citizenAddress;
			this.age = age;
		}

		public String getAadharCardNo() {
			return aadharCardNo;
		}

		public void setAadharCardNo(String aadharCardNo) {
			this.aadharCardNo = aadharCardNo;
		}

		public String getCitizenName() {
			return citizenName;
		}

		public void setCitizenName(String citizenName) {
			this.citizenName = citizenName;
		}

		public String getCitizenAddress() {
			return citizenAddress;
		}

		public void setCitizenAddress(String citizenAddress) {
			this.citizenAddress = citizenAddress;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Citizen [aadharCardNo=" + aadharCardNo + ", citizenName=" + citizenName + ", citizenAddress="
					+ citizenAddress + ", age=" + age + "]";
		}
		
		
}
