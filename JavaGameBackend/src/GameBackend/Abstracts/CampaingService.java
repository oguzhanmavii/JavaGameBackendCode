package GameBackend.Abstracts;

import GameBackend.Entities.Campaing;
import GameBackend.Entities.Product;

public interface CampaingService
{
	public void add(Campaing campaing, Product product);
	public void update(Campaing campaing,Product product);
	public void remove(Campaing campaing,Product product);
}
