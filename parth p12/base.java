package binjal;

import java.util.ArrayList;
import java.util.List;

public class base {
	
	 public List<individual> members = new ArrayList<individual>();
	 public List<family> families = new ArrayList<family>();
	 static int count=0; 
	 
	 public String getData(String[] parseLine)
	 {
	  String values = "";
	  for(int i=2; i < parseLine.length; i++)
	  	{
		  values = values + " " + parseLine[i];
	  	}
	  return values.trim();
	 }
	 
	 public String getId(String privateId){
	  return privateId.replace("@", "");
	 }

}
