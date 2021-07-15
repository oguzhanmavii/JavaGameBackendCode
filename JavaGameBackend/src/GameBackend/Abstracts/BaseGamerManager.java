package GameBackend.Abstracts;

import GameBackend.Entities.Gamer;

public class BaseGamerManager  implements GamerService
{
	@Override
	public void register(Gamer gamer)
	{
		System.out.println("Yeni oyuncu kay�t oldu :"+gamer.getUserName());
		
	}
	@Override
	public void update(Gamer gamer)
	{
		
		System.out.println("Bilgileriniz g�ncellendi"+gamer.getUserName());
		
	}

	@Override
	public void remove(Gamer gamer)
	{
		
		System.out.println("Oyuncu hesab�n�z sildiniz"+gamer.getUserName());
		
	}	
}
