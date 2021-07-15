package GameBackend.Abstracts;

import GameBackend.Entities.Campaing;
import GameBackend.Entities.Product;

public class BaseCampaingManager  implements CampaingService
{

	@Override
	public void add(Campaing campaing,Product product)
	{
		product.setLastPrice(product.getPrice()-(product.getPrice()*campaing.getDiscount()/100));
		System.out.println("Kampanya eklendi: "+campaing.getCampaingName());
	}

	@Override
	public void update(Campaing campaing, Product product)
	{
		product.setLastPrice(product.getPrice()-(product.getPrice()*campaing.getDiscount()/100));
		System.out.println("Kampanya güncellendi: "+campaing.getCampaingName());
	}
	@Override
	public void remove(Campaing campaing, Product product)
	{
		
		product.setLastPrice(product.getPrice());
		System.out.println("Kampanya silindi: "+campaing.getCampaingName());
		
		
	}
}
