package GameBackend.Abstracts;

import GameBackend.Entities.Gamer;

public class BaseGamerManager  implements GamerService
{
	@Override
	public void register(Gamer gamer)
	{
		System.out.println("Yeni oyuncu kayýt oldu :"+gamer.getUserName());
		
	}
	@Override
	public void update(Gamer gamer)
	{
		
		System.out.println("Bilgileriniz güncellendi"+gamer.getUserName());
		
	}

	@Override
	public void remove(Gamer gamer)
	{
		
		System.out.println("Oyuncu hesabýnýz sildiniz"+gamer.getUserName());
		
	}	
}
