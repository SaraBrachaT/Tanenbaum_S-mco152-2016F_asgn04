import java.util.Observable;

public class CObserverFour extends AObserver{

	
	public CObserverFour(State[] state, Observable obs)
	{
		super(state);
		elecStrat = new ElectoralHonest();
		popStrat = new PopularDemocrat();
		obs.addObserver(this);
	}

}
