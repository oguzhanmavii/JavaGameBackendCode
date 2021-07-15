package GameBackend.Abstracts;

import GameBackend.Entities.Gamer;

public interface GamerService
{

	public void register(Gamer gamer);
	
	public void update(Gamer gamer);
	
	public void remove(Gamer gamer);
	
	
}
