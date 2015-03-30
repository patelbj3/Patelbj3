package parth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class agileparth {
	
	

		public static void main(String[] args) 
		
		{
		
			// TODO Auto-generated method stub
			String line,name="",city=" ",state=" ",country=" ";
			String[] lineParts;
			

			System.out.println("*******************************************");
			System.out.println("            Userstory 3             ");
			

			
			
			

			try


			{	
		
				FileReader d1 = new FileReader("TEAM 3 NEW.ged");
				BufferedReader fbuf = new BufferedReader(d1);
				BufferedReader br1 = fbuf;
				boolean flag=false,flag1=false;
		
				while ((line = br1.readLine()) != null)
			
				{
		
					lineParts = line.trim().split(" ");
					if(lineParts.length>2)
					{
	        
						if(lineParts[2].equalsIgnoreCase("INDI")&&flag1==true) 
	        
	        
						{
	        	
							if(flag)
	    
								System.out.println(" "+name+" is residing in country "+state);
	        	
							flag=true;
	        	
							flag1=false;
	        
						}
			
					}
	       
					if(lineParts[1].equalsIgnoreCase("GIVN")) 
	        
					{
	        	
						name=lineParts[2];
	        
					}
	        
					if(lineParts[1].equalsIgnoreCase("RESI")) 
	        
					{
	           
						line=br1.readLine();
				
						lineParts = line.trim().split(" ");
				
						if(lineParts[1].equalsIgnoreCase("ADDR")) 
				
						{
							line=br1.readLine();
							line=br1.readLine();
							line=br1.readLine();
							lineParts = line.trim().split(" ");
					
							if(lineParts[1].equalsIgnoreCase("CTRY")) 
							
							{
								state=lineParts[2];
								flag1=true;
							}
						
						}

	        
					}
			
				}
		
			
			}

			catch(IOException ioe)


			{

				System.out.println("Error is :"+ioe.getMessage());

			}
			
			System.out.println("***********************************************");
			System.out.println("              Userstory 4                  ");
			



			try

			{	
				
				
				FileReader d1 = new FileReader("TEAM 3 NEW.ged");
				BufferedReader fbuf = new BufferedReader(d1);
				BufferedReader br1 = fbuf;
				boolean flag=false,flag1=false;
			String nname="";
				while ((line = br1.readLine()) != null)
					
				{
				
					lineParts = line.trim().split(" ");
					if(lineParts.length>2){
			        if(lineParts[2].equalsIgnoreCase("INDI")) 
			    
			        {
			        	if(flag1&&flag)
			        	{
			        		System.out.println(" The nickname of "+name+" is "+nname);
			        }
			        	flag=true;
			        	flag1=false;
					}
			        if(lineParts[1].equalsIgnoreCase("NICK")) 
			        
			        {
			        	nname=lineParts[2];
			        	flag1=true;
			        }
			        
			        if(lineParts[1].equalsIgnoreCase("GIVN")) 
			        
			        {
			        	name=lineParts[2];
			        	//flag1=true;
			        }
					
				
					}
				
				}

			}

			catch(Exception e)

			{
					

			}

		}
}

