
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Agile3

{

	public static void main(String[] args)
	
	{
	
		// TODO Auto-generated method stub

		Date d1=new Date();

		/*Date d2=new Date(2014,02,01);
System.out.println("value is "+(d1.getTime()));
System.out.println("value in year"+d1.getYear());
long test=d1.getTime();
long test2=d2.getTime();
System.out.println("test "+test);
System.out.println("test2 "+test2);
System.out.println("value in year"+d2.getYear());
long test3=(test2-test)/(365*86457402);
System.out.println(" output :"+test3);*/


       //TODO Auto-generated method stub
		
		String line,name="";
		String[] lineParts;
		int diff, year;
		Date d2;
		try
		
		{
	
			
			FileReader f1 = new FileReader("TEAM3.ged");
			
			BufferedReader fbuf = new BufferedReader(f1);
			
			BufferedReader br1 = fbuf;

			int mon=0;
			boolean flag=false;
			while ((line = br1.readLine()) != null)
	
			{
				lineParts = line.trim().split(" ");
				if(lineParts.length>2)
				
				{
					
					 if(lineParts[2].equalsIgnoreCase("INDI")) 
			    
					 {
			         
						 flag=false;
			            	
			            	name="";	
			            	
			            }
					 
				}
				
				if(lineParts[1].equalsIgnoreCase("GIVN"))
	            	name=lineParts[2];
				
	            
					 if(lineParts[1].equalsIgnoreCase("BIRT")) 
			    
					 {
						 
						 //System.out.println("entered birth");
						 line = br1.readLine();
						 lineParts = line.trim().split(" ");
						 int i=0,j=0;
					
						 if(lineParts[1].equalsIgnoreCase("DATE"))
						 
						 {
							// System.out.println("name="+name);
							// System.out.println("entered Date"+lineParts[3]);
							 //System.out.println("entered check"+lineParts[2]);
						
							 if(lineParts[2].equalsIgnoreCase("AFT")||lineParts[2].equalsIgnoreCase("BEF"))
								 {i=4;
								 j=5;
								 }
							 
							 else {
								 i=3;
								 j=4;
							 }
							 
							 if(lineParts[i]=="JAN") mon=1;
							 else if(lineParts[i]=="FEB") mon=2;
							 else if(lineParts[i]=="MAR") mon=3;
							 else if(lineParts[i]=="APR") mon=4;
							 else if(lineParts[i]=="MAY") mon=5;
							 else if(lineParts[i]=="JUN") mon=6;
							 else if(lineParts[i]=="JUL") mon=7;
							 else if(lineParts[i].equalsIgnoreCase("AUG")) mon=8;
							 else if(lineParts[i]=="SEP") mon=9;
							 else if(lineParts[i]=="OCT") mon=10;
							 else if(lineParts[i]=="NOV") mon=11;
							 else if(lineParts[i]=="DEC") mon=12;
							
							 // System.out.println("month "+lineParts[i]);
							// System.out.println("mon "+mon);
							 
							 year=Integer.parseInt(lineParts[j]);
							
							 // System.out.println("entered year Date"+year);
							// System.out.println("year "+year);
							 
							 diff=d1.getYear()- (year-1900);
							 
							 //System.out.println("diff"+diff);
							 
							 if(diff>=18) flag=true;
							 else if(diff==17)
							 
							 {
							
								 if(mon<d1.getMonth()) flag=true;
							 
							 }
						 
						 }
						 
						 if(flag)
			            
						 {
			            
							 System.out.println(name+" is above 18 years.");
			            		flag=false;
			            	
						 }
			            
					 }
					 
			}
		
		}
				
			catch(IOException ioe)
			
			{

				System.out.println("Error is :"+ioe.getMessage());
			
			}

		}

}
