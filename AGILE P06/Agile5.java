
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Agile5

{

	public static void main(String[] args)
	
	{
	
		// TODO Auto-generated method stub
		String line,name="",phone_number="";
		String[] lineParts;
		boolean check=false;
		try
		
		{
				
			FileReader d1 = new FileReader("newexport-BloodTree.ged");
			
			BufferedReader fbuf = new BufferedReader(d1);
			
			BufferedReader br1 = fbuf;
			
			int count=0;
			boolean flag=false;
			while ((line = br1.readLine()) != null)
	
			{
			
				lineParts = line.trim().split(" ");
				if(lineParts.length>2)
				
				{
	            
					if( check) 
	                 {System.out.println("person "+name+" with phone contact "+phone_number+" is valid");}
				
					// name="";
				 
					check=false;
				
				}
				
				if(lineParts[1].equalsIgnoreCase("GIVN"))
				
				{
		        
					name=lineParts[2];
		            	//System.out.println("name"+name);
				 
				}
				
				if(lineParts[1].equalsIgnoreCase("PHON"))
				
				{
		        
					String ext,ext1,ext2;
		            	ext=lineParts[2];
		            	ext1=lineParts[3];
		            	ext2=lineParts[4];
		            	phone_number=ext+ext1+ext2;
		            
		            	if(ext.length()==4 &&ext1.length()==5&& ext2.length()==4) check=true;
		            	
		            	
				 }
			
			}
		
		}
		
		catch(Exception e )
		
		{}
	
	}

}
