package binjal;

import java.io.IOException;

public class main_final 

{

public static void main(String[] args) throws IOException 
	
	{
		main b1=new main();
		b1.readFile("/Users/Sahajanand/Desktop/binjal.ged");
		b1.unbornpeople("/Users/Sahajanand/Desktop/binjal.ged");
		b1.deathafter150year("/Users/Sahajanand/Desktop/binjal.ged");
		b1.deathbeforeBirth("/Users/Sahajanand/Desktop/binjal.ged");
		b1.birthBeforeDeath("/Users/Sahajanand/Desktop/binjal.ged");
		b1.famicount("/Users/Sahajanand/Desktop/binjal.ged");
		b1.invalid_deathdate("/Users/Sahajanand/Desktop/binjal.ged");

}
	
}
