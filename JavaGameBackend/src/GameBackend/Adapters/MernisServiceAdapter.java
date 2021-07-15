package GameBackend.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import GameBackend.Abstracts.PersonCheckService;
import GameBackend.Entities.Gamer;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer)
	{
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	}

}
