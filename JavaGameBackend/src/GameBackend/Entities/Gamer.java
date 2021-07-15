package GameBackend.Entities;

import GameBackend.Abstracts.Entity;

public class Gamer implements Entity
{

	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityID;
	private String userName;
		
	public Gamer() //Constructor Yapýcý Method.
	{
		
	}
	
	public Gamer(int id, String firstName,String lastName,
			int yearOfBirth,String nationalityID,String userName)
	{
	
		super();
		this.userName=userName;
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearOfBirth=yearOfBirth;
		this.nationalityID=nationalityID;
	
	}
    	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public int getYearOfBirth()
	{
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth)
	{
		this.yearOfBirth=yearOfBirth;
	}
	
	public String getNationalityID()
	{
		return nationalityID;
	}
	
	public void setNationalityID(String nationalitID)
	{
		this.nationalityID= nationalitID;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}