

import GameBackend.Abstracts.BaseCampaingManager;
import GameBackend.Abstracts.BaseGamerManager;
import GameBackend.Adapters.MernisServiceAdapter;
import GameBackend.Concrete.SaleManager;
import GameBackend.Concrete.UserManager;
import GameBackend.Entities.Campaing;
import GameBackend.Entities.Gamer;
import GameBackend.Entities.Product;

public class Main {
//Bu kimlik dogrulamasi Türk vatandasi olanlara aittir
	public static void main(String[] args) {
		BaseGamerManager user=new UserManager(new MernisServiceAdapter());
		Gamer gamer=new Gamer(1,"Oğuzhan","Mavi",1998,"29114253430","trrt");
		Product product=new Product(1,156.12,"Lichess","Bu bir oyun");
		user.register(gamer);
		user.update(gamer);
		user.remove(gamer);
		
		BaseCampaingManager campaignManager=new BaseCampaingManager();
		SaleManager sale=new SaleManager();
		campaignManager.add(new Campaing(1,15,"Eylül 15"), product);
		sale.sale(gamer, product);
		campaignManager.update(new Campaing(1,5,"Ekim 10"),product);
		sale.sale(gamer, product);
		campaignManager.remove(new Campaing(1,0,"Aralık 6"), product);
		sale.sale(gamer, product);
	}

}