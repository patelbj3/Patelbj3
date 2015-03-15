
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Agile4 

{

	public static void main(String[] args)
	
	{
	
		// TODO Auto-generated method stub
		String line,name="",surname="";
		String[] lineParts;
		try
		
		{			
		
			FileReader d1 = new FileReader("TEAM3.ged");
			
			BufferedReader fbuf = new BufferedReader(d1);
			
			BufferedReader br1 = fbuf;
			
			while ((line = br1.readLine()) != null)
				
			{
			
				lineParts = line.trim().split(" ");
				
				if(lineParts[1].equalsIgnoreCase("GIVN"))
				
				{
		        
					name=lineParts[2];
				 
				}
				
				if(lineParts[1].equalsIgnoreCase("SURN"))
				
				{
		        
					System.out.println(" Person with name "+name+" has surname "+lineParts[2]);
				 
				}
					
			}
		
		}
		
		catch(Exception e )
		
		{
		
		}
		
	}
}
