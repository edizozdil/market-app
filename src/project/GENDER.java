package project;

public enum GENDER 
{

	MALE("male"),FEMALE("female"),NOT_SPECIFIED("not specified");
	
	private String gender;
	private GENDER(String gender) 
	{
		this.gender=gender;
	}
	public String toString() {
		return this.gender;
	}
}
