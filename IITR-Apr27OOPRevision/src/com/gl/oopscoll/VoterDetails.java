package com.gl.oopscoll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class VoterDetails {

	HashMap <String,Citizen> citizens = new HashMap<String,Citizen>();
	TreeMap <String,Citizen> citizenT = new TreeMap<String,Citizen>();
	public void populateHashMap()
	{
		citizens.put("C003", new Citizen("C003","Kiran","Mysore",26));
		citizens.put("C001", new Citizen("C001","Harsha","Bangalore",46));
		citizens.put("C004", new Citizen("C004","Sunitha","Dharwad",42));
		citizens.put("C002", new Citizen("C002","Madan","Mangalore",36));
		
		Citizen citizen1 = new Citizen("C005","Milan","Hubli",40);
		citizens.put("C005", citizen1);
		
	}
	public void populateTreeMap()
	{
		citizenT.put("C003", new Citizen("C003","Kiran","Mysore",26));
		citizenT.put("C001", new Citizen("C001","Harsha","Bangalore",46));
		citizenT.put("C004", new Citizen("C004","Sunitha","Dharwad",42));
		citizenT.put("C002", new Citizen("C002","Madan","Mangalore",36));
	}
	public void viewCitizens()
	{
		Set <String>  citizenKeys = citizens.keySet();
		Iterator <String> citizenIter = citizenKeys.iterator();
		Citizen myCitizen = new Citizen();
		while(citizenIter.hasNext())
		{
			String citiKey = citizenIter.next();
			myCitizen = citizens.get(citiKey);
			System.out.println(myCitizen);
		}
	}
	public void viewCitizenT()
	{
		Set <String>  citizenKeys = citizenT.keySet();
		Iterator <String> citizenIter = citizenKeys.iterator();
		Citizen myCitizen = new Citizen();
		while(citizenIter.hasNext())
		{
			String citiKey = citizenIter.next();
			myCitizen = citizens.get(citiKey);
			System.out.println(myCitizen);
		}
	}
	public Citizen getCitizenById(String citizenId)
	{
		Set <String>  citizenKeys = citizens.keySet();
		Iterator <String> citizenIter = citizenKeys.iterator();
		Citizen myCitizen = new Citizen();
		while(citizenIter.hasNext())
		{
			String citiKey = citizenIter.next();
			myCitizen = citizens.get(citiKey);
					if(myCitizen.getCitizenId().equals(citizenId))
					{
						break;
					}
		}
		return myCitizen;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoterDetails vDetails = new VoterDetails();
		vDetails.populateHashMap();
		
		Citizen citizen = vDetails.getCitizenById("C004");
		System.out.println("The Citizen for the Id C003" + citizen);
		System.out.println("--------------------");
		vDetails.viewCitizens();
		System.out.println("--------------------");
		vDetails.populateTreeMap();
		vDetails.viewCitizenT();
	}

}
