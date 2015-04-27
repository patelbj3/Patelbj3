package binjal;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import week7.data;
import week7.group_family;
import week7.member;

public class read extends base{
	
	

	 public void readFile(String file) throws IOException 
	 {
		  FileInputStream file1 = null;
		  BufferedReader br = null;
		  
		  try 
		  {

			  file1 = new FileInputStream(file);
			  br = new BufferedReader(new InputStreamReader(file1));
			  System.out.println();
			  String line = null;
			  individual individual1 = null;
			  family fami = null;
			  boolean isIndOrFami = false;
			  while ((line = br.readLine())!=null)
			  {
				  String[] parseLine = (line.split("\\s+"));
				  int level = Integer.valueOf(parseLine[0]);
				  String tag = parseLine[1];
				  String values = (parseLine.length > 2) ? getData(parseLine) : null;
		    
				  if(level == 0)
				  {
					  if("INDI".equals(values))
					  {
						  individual1= new individual();
						  if(individual1!=null)
						  {
							  members.add(individual1);
							  individual1.setIdentifier(getId(tag));
							  isIndOrFami=true;
						  }
					  }
					  else if("FAM".equals(values))
					  {
						  fami=new family();
						  if(fami!=null)
						  {
							  families.add(fami);
							  fami.setFami_identifier(getId(tag));
							  isIndOrFami=true;
						  }
					  } 
					  else 
					  {
						  isIndOrFami=false;
					  }
				  }
		    
				  if(isIndOrFami)
				  {
					  if("NAME".equals(tag))
					  {
						  individual1.setName(values);
					  } 
					  else if("GIVN".equals(tag))
					  {
						  individual1.setGivenName(values);
					  }
					  else if("SURN".equals(tag))
					  {
						  individual1.setSurName(values);
					  } 
					  else if("HUSB".equals(tag))
					  {
						  fami.setHusband(getId(values));
					  } 
					  else if("WIFE".equals(tag))
					  {
						  fami.setWife(getId(values));
					  } 
					  else if("SEX".equals(tag))
					  {
						  individual1.setSex(values.charAt(0));
					  } 
					  else if("DEAT".equals(tag))
					  {  
						  individual1.setDeceased(values.charAt(0));
					  }
					  else if("FAMC".equals(tag))
					  {
						  String FAMC= getId(values);    
						  individual1.setFAMC(FAMC);
					  }
					  else if("CHIL".equals(tag))
					  {
						  String CHIL= getId(values);  
						  individual1.setChil(CHIL);
					  }
				  }
		      if(level == 1) 
		      {
		    	if("BIRT".equals(tag))
		    	{
		    		line = br.readLine();
		    		String[] nextLine = (line.split("\\s+"));
		    		if(nextLine[1].equals("DATE"))
		    		{
		    		   String BirthDate = nextLine[2]+" "+nextLine[3]+" "+nextLine[4];
		    		   int year = Calendar.getInstance().get(Calendar.YEAR);
		    		   int age = year - Integer.parseInt(nextLine[4]);
		    		   individual1.setAge(age);
		    		   individual1.setBirthDate(BirthDate);
		    		}	
				}
		    	else if("DEAT".equals(tag)) 
					{
						line = br.readLine();
			    		String[] nextLine = (line.split("\\s+"));
			    		if(nextLine[1].equals("DATE"))
			    		{
			    			String DeathDate = nextLine[2]+" "+nextLine[3]+" "+nextLine[4];
			  				individual1.setDeathDate(DeathDate);
			  				}
			    		}
			  			else if ("MARR".equals(tag))
			  			{
			  				line = br.readLine();
					    	String[] nextLine = (line.split("\\s+"));
					    	if(nextLine[1].equals("DATE"))
					    	{
					    			String weddingDate = nextLine[2]+" "+nextLine[3]+" "+nextLine[4];
					  				fami.setWeddingDate(weddingDate);
			  				}
			  			}
			  			else if("DIV".equals(tag)) 
						{
							line = br.readLine();
				    		String[] nextLine = (line.split("\\s+"));
				    		if(nextLine[1].equals("DATE"))
				    		{
				    			String DivorceDate = nextLine[2]+" "+nextLine[3]+" "+nextLine[4];
				  				fami.setDivorceDate(DivorceDate);
				  				}
				    		}
				  	
			  			else if("_SEPR".equals(tag)) 
						{
							line = br.readLine();
				    		String[] nextLine = (line.split("\\s+"));
				    		if(nextLine[1].equals("DATE"))
				    		{
				    			String seprateDate = nextLine[2]+" "+nextLine[3]+" "+nextLine[4];
				  				fami.setSeprateDate(seprateDate);
				  				}
				    		}
			  			else if("OCCU".equals(tag)) 
						{
							line = br.readLine();
							individual1.setOccupation(values);
				  	
				  	
				  	}}	
		      if(level == 2)
			    {

		  		  if("PLAC".equals(tag))
		  		  {
		  			  individual1.setPLAC(values);
		  		  }
		  		
			    }
		      
		      else if("WWW".equals(tag))
		  		  {
		    	  line = br.readLine();
					
		  			  individual1.setBlog(values);
		  		  }
		  		
		      }}
		  catch (FileNotFoundException e) 
		  {
		   Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, e);
		  } 
		  catch (IOException e) 
		  {
		   Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, e);
		  } 
		  finally 
		  {
		   try 
		   {
		    br.close();
		    file1.close();
		   } 
		   catch (IOException e) 
		   {
		    Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, e);
		   }
		  }
	 }

	 

}
