package Parth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P10 {

	
public static void main(String[] args) 
	
	{
	
		// TODO Auto-generated method stub
		String line,name="";
		String[] lineParts;
		
		System.out.println("*******************************************");
		System.out.println("           1.check if widow or not         ");
		System.out.println("*******************************************");

		
		
		
		
		
		try
		
		{	
		
			FileReader d1 = new FileReader("Team 3.ged");
			BufferedReader fbuf = new BufferedReader(d1);
			BufferedReader br1 = fbuf;
			boolean flag=false,flag1=false,flag2=false,flag_spouse=false;
			String gender="",spouseid="";
			String line_spouse,spousegender="";
			String [] lineParts_spouse;
			while ((line = br1.readLine()) != null)
				
			{
			
				lineParts = line.trim().split(" ");
				if(lineParts.length>2){
	            if(lineParts[2].equalsIgnoreCase("INDI")&&flag1==true) 
	            {
	            	
	            	name="";
	            	gender="";
	            	flag=false;
	            	spouseid="";
	            	flag1=false;
	            	flag2=false;
	            	spousegender="";
	            }
	          
				}
	            
				if(lineParts[1].equalsIgnoreCase("GIVN")) 
	            
				{
	            	name=lineParts[2];
	            }
				if(lineParts[1].equalsIgnoreCase("SEX"))
				{
					gender=lineParts[2];
					//System.out.println("inside gender"+gender);
				}
				if(lineParts[1].equalsIgnoreCase("DEAT"))
				{
					flag=true;
					//System.out.println("inside Deat");
					
				}
				if(lineParts[1].equalsIgnoreCase("FAMS"))
				{
					spouseid=lineParts[2];
					flag1=true;
					
				}
				if(flag==false && flag1==true && gender.equalsIgnoreCase("F") && (!spouseid.equalsIgnoreCase("")))
				{ flag1=false;
					//System.out.println(" inside to check for death spouse spouseid"+spouseid);
					/*System.out.print("inside FAMS");
					System.out.print(" gender "+gender);
					System.out.print("flag for deat"+flag);
					System.out.println(" spouse id"+spouseid);
					System.out.println("name "+name);*/
					try
					
					{	
					
						FileReader d2 = new FileReader("Team 3.ged");
						BufferedReader bread1 = new BufferedReader(d2);
						line_spouse = bread1.readLine();
						//while ((line_spouse = bread1.readLine()) != null )
						for(;line_spouse !=null;)	
						{
							//System.out.println(" inside for");
							lineParts_spouse = line_spouse.trim().split(" ");
							//System.out.println("inside while"+lineParts_spouse[1]);
							if(lineParts_spouse.length>2)
							{
							if(lineParts_spouse[2].equalsIgnoreCase("INDI")) 
				            {
				            	//System.out.println(" reseting the value ");
								spousegender="";
								flag_spouse=false;
				            	
				            }
							}
							if(lineParts_spouse.length>1)
							{
							if(lineParts_spouse[1].equalsIgnoreCase("SEX"))
							{ 
							
								spousegender=lineParts_spouse[2];
							}
							if(lineParts_spouse[1].equalsIgnoreCase("FAMS"))
							{
								//System.out.println("inside FAMS spouse id"+lineParts_spouse[2]);
								//System.out.println("inside FAMS ");
								if(spouseid.equalsIgnoreCase(lineParts_spouse[2])&& spousegender.equalsIgnoreCase("M") && flag_spouse)
								{
									//System.out.println("name in flag2"+name);
									flag2=true;
								 break;
								}
								
							}
							if(lineParts_spouse[1].equalsIgnoreCase("DEAT"))
							{
								flag_spouse=true;
								//System.out.println("found deat");
							}
							}
							//System.out.println(" flag2"+flag2);
							line_spouse = bread1.readLine();
							//System.out.println("(line_spouse = bread1.readLine()) != null "+(() != null));
					}
						if( flag2)
						 {
							 System.out.println(name+" is a widow");
							 //System.out.println(" gender"+gender);
							 flag2=false;
						 }
					}
					catch(Exception e)
					{
						
					}
				}
				 
			}
			
				
		}
        
		catch(IOException ioe)
		
		{

			System.out.println("Error is :"+ioe.getMessage());
		
		}
		
		
		System.out.println("*******************************************");
		System.out.println("  2.Display marriage date and divorce date ");
		System.out.println("*******************************************");

		
		try
		
		{	
		
			FileReader d1 = new FileReader("Team 3.ged");
			BufferedReader fbuf = new BufferedReader(d1);
			BufferedReader br1 = fbuf;
			boolean flag=false,flag1=false,flag2=false,flag_spouse=false;
			String mMonth="",MMonth="",code="";
			int dDay=0,yYear=0,DDay=0,YYear=0, mmon=0,dmon=0;
			String line_spouse,spousegender="";
			String [] lineParts_spouse;
			
			
			while ((line = br1.readLine()) != null)
				
			{
			
				lineParts = line.trim().split(" ");
			
	          
				
	            
				if(lineParts[1].equalsIgnoreCase("GIVN")) 
	            
				{
	            	name=lineParts[2];
	            }
				if(lineParts.length>2){
					if(lineParts[2].equalsIgnoreCase("FAM"))
				
				{
				     code=lineParts[1];
		             flag=false;
		             flag1=false;
		             flag2=false;
		             
					//System.out.println("inside gender"+gender);
				}
				}
				if(lineParts[1].equalsIgnoreCase("MARR"))
				{
					line = br1.readLine();
					lineParts = line.trim().split(" ");
					if(lineParts[2].equalsIgnoreCase("BEF") || lineParts[2].equalsIgnoreCase("AFT"))
					{
						dDay=Integer.parseInt(lineParts[3]);
						mMonth=lineParts[4];
						yYear=Integer.parseInt(lineParts[5]);
					}
					else{
					dDay=Integer.parseInt(lineParts[2]);
					mMonth=lineParts[3];
					yYear=Integer.parseInt(lineParts[4]);
					}
					
					flag1=true;
					
				}
				if(lineParts[1].equalsIgnoreCase("DIV"))
				{
					line = br1.readLine();
					lineParts = line.trim().split(" ");
					if(lineParts[2].equalsIgnoreCase("BEF") || lineParts[2].equalsIgnoreCase("AFT"))
					{
						DDay=Integer.parseInt(lineParts[3]);
						
						MMonth=lineParts[4];
						YYear=Integer.parseInt(lineParts[5]);
					}
					else
					{
						DDay=Integer.parseInt(lineParts[2]);
					
					MMonth=lineParts[3];
					YYear=Integer.parseInt(lineParts[4]);
				}
					
					flag2=true;
					
				}
				
				if(flag1==true && flag2==true )
				{ 
					//System.out.println("Marr date"+dDay+" "+mmon+" "+yYear);
					//System.out.println("DIV date"+DDay+" "+dmon+" "+YYear);
					
				  flag1=false;
				  flag2=false;
			//	System.out.println("enter inner for "+code);
					try
					
					{	
					
						FileReader d2 = new FileReader("Team 3.ged");
						BufferedReader bread1 = new BufferedReader(d2);
						line_spouse = bread1.readLine();
						for(;line_spouse !=null;)	
						{
							lineParts_spouse = line_spouse.trim().split(" ");
							if(lineParts_spouse.length>2)
							{
							if(lineParts_spouse[2].equalsIgnoreCase("INDI")) 
				            {
				            
								name="";
				            	
				            }
							}
							if(lineParts_spouse[1].equalsIgnoreCase("GIVN")) 
					            
							{
				            	name=lineParts_spouse[2];
				            }
							if(lineParts_spouse.length>1)
							{
							
							if(lineParts_spouse[1].equalsIgnoreCase("FAMS"))
							{
								//System.out.println(" name = "+name);
								if(code.equalsIgnoreCase(lineParts_spouse[2]))
							{
									//System.out.println("name="+name);
									flag_spouse=true;
									break;
							}
								
							}
							
							}
							line_spouse = bread1.readLine();
					}
						if(flag_spouse)
						{
							System.out.println(name+" marriage date "+dDay+" "+mMonth+" "+yYear+"divorce date "+DDay+" "+MMonth+" "+YYear);
							name="";
							flag_spouse=false;
						}
					}
					catch(Exception e)
					{
						
					}}
				}
				 
			
			
				
		}
        
		catch(IOException ioe)
		
		{

			System.out.println("Error is :"+ioe.getMessage());
		
		}
	}
}


