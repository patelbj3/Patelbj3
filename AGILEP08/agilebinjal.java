package Agilep08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class agilebinjal

{

	public static void main(String[] args) 
	
	{
	
		// TODO Auto-generated method stub
		String line,name="",city=" ",state=" ",country=" ";
		String[] lineParts;


		System.out.println("***********************************************");
		System.out.println("              Userstory 5                      ");
		System.out.println("***********************************************");

		
		
		

		try

		{	
		
			
			FileReader d1 = new FileReader("TEAM 3 NEW.ged");
			BufferedReader fbuf = new BufferedReader(d1);
			BufferedReader br1 = fbuf;
			boolean flag=false,flag1=false;
			String code="",temp;
			String []code_matrix;
			String []date;
			String []names;
			String date1="";
	
			while ((line = br1.readLine()) != null)
		
	
			{
	
				lineParts = line.trim().split(" ");
				if(lineParts.length>2)
				
				{
        
        	
					if(lineParts[2].equalsIgnoreCase("FAM")) 
					
					{
						temp=lineParts[1];
						line = br1.readLine();
						lineParts = line.trim().split(" ");
            	
						if(lineParts[1].equalsIgnoreCase("MARR")) 
                
						{
								//System.out.println(" hiee");
							if(code!="")
								code=code+"/"+temp;
            		
							else
								code=temp;
                
							line = br1.readLine();
							lineParts = line.trim().split(" ");
							if(lineParts[2].equalsIgnoreCase("BEF")||lineParts[2].equalsIgnoreCase("AFT")){
                
								if(date1!="")
									date1=date1+" "+lineParts[3]+"/"+lineParts[4]+"/"+lineParts[5];
                
								else
									date1=lineParts[3]+"/"+lineParts[4]+"/"+lineParts[5];
                
          
							}
        
							else
               
							{
								if(date1!="")
									date1=date1+" "+lineParts[2]+"/"+lineParts[3]+"/"+lineParts[4];
                        
								else
                        	date1=lineParts[2]+"/"+lineParts[3]+"/"+lineParts[4];
                
							}
                
						}
     	
            
					}
	
				}
	
			}
	
			code_matrix = code.trim().split("/");
	date = date1.trim().split(" ");
	//for(int i=0;i<date.length;i++)
		//System.out.println(" date "+date[i]);
	
	
	for(int i=0;code_matrix.length>i;i++)
	
	{//System.out.println("code_matrix "+code_matrix[i]);
		FileReader d2 = new FileReader("TEAM 3 NEW.ged");
		BufferedReader fbuf1 = new BufferedReader(d2);
		//System.out.println("i "+i);
		//System.out.println(" dates "+date[i]);
		String temp2="";
		//System.out.println("code checked "+code_matrix[i]);
		name="";

		
		
		while ((line = fbuf1.readLine()) != null)
	
	{
	lineParts = line.trim().split(" ");
	//name="";
	
	if(lineParts[1].equalsIgnoreCase("GIVN")) 
    
	{
		 temp2=lineParts[2];
		 //System.out.println("temp2"+temp2);
		 
    }
	 //System.out.println("lineParts[1].equalsIgnoreCase(FAMS))"+(lineParts[1].equalsIgnoreCase("FAMS")));
	
	if(lineParts[1].equalsIgnoreCase("FAMS")) {
		// System.out.println("entered to check "+lineParts[2]);
	
		if(code_matrix[i].equalsIgnoreCase(lineParts[2]))
	 
		{
		 flag=true;
		// System.out.println("temp in "+temp2);
		 if(name!="")
		     	name=name+"&"+temp2;
				 else 
					 name=temp2;
		}
	 
	}
	
	if(lineParts.length>2)
	 if(lineParts[2].equalsIgnoreCase("INDI")) 
         
     {
		 temp2="";
		 
     }
	
	}
//System.out.println("name s "+name);
names=name.trim().split("&");
if(names.length>1)
System.out.println(name+" were married on "+date[i]);
	}
	
	//System.out.println("codee"+code);
	
}
     
	catch(IOException ioe)

	{

		System.out.println("Error is :"+ioe.getMessage());

	}

		
		
		





		System.out.println("*******************************************");
		System.out.println("             Userstory 6                   ");
		System.out.println("*******************************************");





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
        		
					System.out.println(" The occupation of "+name+" is "+nname);
       
				}
        	
				flag=true;
        	
				flag1=false;
		
			}
       
			if(lineParts[2].equalsIgnoreCase("{geni:occupation}")) 
        
			{
        	
				nname=lineParts[3];
        	
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
