    
    import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
 
	public class Agile
	{
		
				public static String line = null;
				public static int female;
				public static int male;
				
					public static void female(BufferedReader br) throws IOException
						
					{
						
							BufferedReader br1 = br;
							while ((line = br1.readLine()) != null)
					
							{
							
								if (  (line.contains("SEX") && line.contains("F")))
									female = female +1;	
	
								if (  (line.contains("SEX") && line.contains("M")))
									male = male +1;
				
							}
							
							System.out.println("Total number of female in family are :"+female);
							System.out.println("Total number of male in family are :"+male);
							
							if(male<female)
							
							{
							
							System.out.println("The number of females in the family is more");

							}	

							else if(male>female)
							
							{
								
								System.out.println("Total number of male in family are more");
							
							}	
							
							else
	
								System.out.println("The number of male and female in the family are same");
					
							}
					
						
					public static void main(String[] args)
					
					{
					
						try
						
						{
								
							FileReader d1 = new FileReader("TEAM3.ged");
							
							BufferedReader fbuf = new BufferedReader(d1);
							
							female(fbuf);
							
						}
						
						catch(IOException ioe)
						
						{

							System.out.println("Error is :"+ioe.getMessage());
						
						}
		
					}
		}
		



