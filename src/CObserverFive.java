import java.util.Observable;

public class CObserverFive extends AObserver{
	
	public CObserverFive(State[] state, Observable obs)
	{
		super(state);
		elecStrat = new ElectoralHonest();
		popStrat = new PopularHonest();	
		obs.addObserver(this);
	}

}
