package GameBackend.Entities;

import GameBackend.Abstracts.Entity;

public class Campaing implements Entity
{

	private int id;
	
	private int discount;
	
	private String campaingName;
	
	
	public Campaing() //Constructor Yapıcı Method.
	{
		
	}
	
	
	
	public Campaing(int id,int discount,String campaingName)
	{
		this.id=id;
		this.discount=discount;
		this.campaingName=campaingName;
	}
	
	public String getCampaingName()
	{
		return campaingName;
	}
	
	public void setCampaingName(String campaingName) {
		this.campaingName=campaingName;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getDiscount()
	{
		return discount;
	}
	
	public void setDiscount(int discount)
	{
		this.discount=discount;
	}
	
	
	
}
