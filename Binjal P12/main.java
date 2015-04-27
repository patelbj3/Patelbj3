package binjal;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;


public class main extends read

{
	public void birthBeforeDeath(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			individual indi = members.get(i);
			String dDate = indi.getDeathDate();
			if(dDate != null)
			{
				String bYear = indi.getBirthDate();
				String deathyear[] = dDate.split(" ");
				String year[] = bYear.split(" ");
				if (Integer.parseInt(deathyear[2]) < Integer.parseInt(year[2]))
				{
					System.out.println("birth before death for " + indi.getGivenName() +" "+ indi.getSurName());
				}	
			}
		}
	}
	
	public void deathbeforeBirth(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			individual indi = members.get(i);
			String dDate = indi.getDeathDate();
			if(dDate != null)
			{
				String bYear = indi.getBirthDate();
				String dYear[] = dDate.split(" ");
				String year[] = bYear.split(" ");
				if (Integer.parseInt(dYear[2]) > Integer.parseInt(year[2]))
				{
					System.out.println("death happen before birth for " + indi.getGivenName() +" "+ indi.getSurName());
				}
			}
		}
	}
	
	public void deathafter150year(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			
			 individual indi = members.get(i);
			 String bYear = indi.getBirthDate();
			 
			 String dYear=indi.getDeathDate();
			 
			if(dYear != null && bYear!=null)
			{
				String year[] = bYear.split(" ");
				String year1[]=dYear.split(" ");
				int x = Integer.parseInt(year[2]);
			 int y = Integer.parseInt(year1[2]);
			 int z=y-x;
			 if(z>150)
			 {
			 System.out.println("death after 150 year of birth , not possible "+ indi.getGivenName()+ " "+ indi.getSurName() + " " +y );
			 }		 
		}}
	}
	
	public void invalid_deathdate(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			 individual indi = members.get(i);
			 String dYear = indi.getDeathDate();
			 if(dYear != null)
			 {
			 String year[] = dYear.split(" ");
			 int x = Integer.parseInt(year[2]);
			 if(x>2015)
			 System.out.println("invalid deathdate " +indi.getGivenName() +" "+ indi.getSurName()+" is in year "+ x);			 
		}}
	}
	
	public void unbornpeople(String file)
	{
		for(int i=0; i < members.size(); i++)
		{
			 individual indi = members.get(i);
			 String bYear = indi.getBirthDate();
			 String year[] = bYear.split(" ");
			 int x = Integer.parseInt(year[2]);
			 if(x>2015)
			 {
			 System.out.println("unborn people " +indi.getGivenName() +" "+ indi.getSurName());			 
		}
	}
	}
	
	public void famicount(String file)
	{
		int fami=families.size();
		System.out.println("Total number of families are :"+fami);
	}
	
	
}