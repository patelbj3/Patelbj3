
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Agile1

{

	public static void main(String[] args) 
	
	{
	
		// TODO Auto-generated method stub
		String line,name="";
		String[] lineParts;
		try
		
		{	
			
			FileReader d1 = new FileReader("TEAM3.ged");
			
			BufferedReader fbuf = new BufferedReader(d1);
			
			BufferedReader br1 = fbuf;
		
			int count=0;
			boolean flag=false;
			while ((line = br1.readLine()) != null)
	
			{
			
				lineParts = line.trim().split(" ");
				if(lineParts.length>2){
	            if(lineParts[2].equalsIgnoreCase("INDI")) 
	            
	            {
	            
	            	if(flag)
	            	
	            	{
	            	
	            		System.out.println(name+" has "+count+" children.");
	            	
	            	}
	            	
	            	flag=true;
	            	
	            	count=0;
	            	name="";	
	            	
	            }
	            
	            if(lineParts[1].equalsIgnoreCase("FAMS"))
	            
	            {
	            
	            	count++;
	            
	            }
	            
	            if(lineParts[1].equalsIgnoreCase("GIVN"))
	            
	            	name=lineParts[2];
				
				}
	            
			}
			
		}
			
		
		
		catch(IOException ioe)
		
		{

			System.out.println("Error is :"+ioe.getMessage());
		
		}

	}

}
