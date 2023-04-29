package com.gl.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class CitizenManipulator {

	HashMap <String,Citizen> citizens = new HashMap<String,Citizen>();
	TreeMap <String,Citizen> citizenTMap = new TreeMap<String,Citizen>();
	public void populateHashMap()
	{
		citizens.put("C001",new Citizen("C001","Kiran Kumar","Bangalore",42));
		citizens.put("C002",new Citizen("C002","Kishan Kumar","Mangalore",43));
		citizens.put("C003",new Citizen("C003","Suman Kumar","Bangalore",44));
		citizens.put("C004",new Citizen("C004","Harish Kumar","Mysore",45));
		
	}
	public void populateTreeMap()
	{
		citizenTMap.put("C002",new Citizen("C002","Kishan Kumar","Mangalore",43));
		citizenTMap.put("C001",new Citizen("C001","Kiran Kumar","Bangalore",42));
		citizenTMap.put("C004",new Citizen("C004","Harish Kumar","Mysore",45));
		citizenTMap.put("C003",new Citizen("C003","Suman Kumar","Bangalore",44));
		
	}
	public void fetchTreeMapCitizens()
	{
		Set <String> citizenKeys = citizenTMap.keySet();
		Iterator <String> citizenKeysIter = citizenKeys.iterator();
		while(citizenKeysIter.hasNext())
		{
			String citizenKey = citizenKeysIter.next();
			System.out.println(citizenKey);
		}
	}
	public Citizen getCitizenByAadhar(String aadhar)
	{
		Set <String> citizenKeys = citizens.keySet();
		Iterator <String> keyIter = citizenKeys.iterator();
		boolean flag = false;
		Citizen citizenFound =new Citizen();
		while(keyIter.hasNext())
		{
			String citizenKey = keyIter.next();
			if(citizenKey.equals(aadhar))
			{
				citizenFound = citizens.get(citizenKey);
				flag = true;
				break;
				
			}
		}
		return citizenFound;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aadharNo = "C100";
		CitizenManipulator citizenMani = new CitizenManipulator();
		citizenMani.populateHashMap();
		Citizen citizen =  citizenMani.getCitizenByAadhar(aadharNo);
		if(citizen.aadharCardNo != null)
		{	
			System.out.println("Citizen found "+citizen);
		}
		else
		{
			System.out.println("Citizen Not Found...");
		}
		citizenMani.populateTreeMap();
		citizenMani.fetchTreeMapCitizens();
	}

}
