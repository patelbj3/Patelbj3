package binjal;

public class individual {
	

	 private String identifier;
	 private String name;
	 private String givenName;
	 private String surName;
	 private char sex; 
	 private char deceased;
	 private String birthDate;
	 private String deathDate;
	 private int age;
	 private String FAMC;// {FAMILY_CHILD} Identifies the family in which an individual appears as a child.
	 private String CHIL;
	 private String PLAC;
	 private String MARNM;
	 private String Occupation;
	 private String blog;
	 
	 
	 
	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getMARNM() {
		return MARNM;
	}

	public void setMARNM(String mARNM) {
		this.MARNM = mARNM;
	}

	/* public String getWeddingDate() {
		return weddingDate;
	}

	public void setWeddingDate(String weddingDate) {
		this.weddingDate = weddingDate;
	}
*/
	public String getIdentifier() {
		  return identifier;
		 }
		 
		  public void setIdentifier(String identifier) {
		  this.identifier = identifier;
		 }
		 public String getName() {
		  return name;
		 }
		 public void setName(String name) {
		  this.name = name;
		 }
		 public String getGivenName() {
		  return givenName;
		 }
		 public void setGivenName(String givenName) {
		  this.givenName = givenName;
		 }
		 public String getSurName() {
		  return surName;
		 }
		 public void setSurName(String surName) {
		  this.surName = surName;
		 }
		 public String getFAMC() {
		  return FAMC;
		 }
		 public void setFAMC(String FAMC) {
		  this.FAMC = FAMC;
		 }
		  public String getChil() {
		  return CHIL;
		 }
		 public void setChil(String CHIL) {
		  this.CHIL = CHIL;
		 }
		 public char getSex() {
		  return sex;
		 }
		 public void setSex(char sex) {
		  this.sex = sex;
		 }
		 public String getBirthDate() {
		  return birthDate;
		 }
		 public void setBirthDate(String birthDate) {
		  this.birthDate = birthDate;
		 }
		 public String getDeathDate() {
		  return deathDate;
		 }
		 public void setDeathDate(String deathDate) {
		  this.deathDate = deathDate;
		 }
		 public char getDeceased() {
			  return deceased;
			 }
			 public void setDeceased(char deceased) {
			  this.deceased = deceased;
			 }		 
		 public int getAge() {
			  return age;
		 }
		 public void setAge(int age) {
			  this.age = age;
		 }

		public String getCHIL() {
			return CHIL;
		}

		public void setCHIL(String cHIL) {
			CHIL = cHIL;
		}

		public String getPLAC() {
			return PLAC;
		}

		public void setPLAC(String pLAC) {
			this.PLAC = pLAC;
		}	


}
