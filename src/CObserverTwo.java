import java.util.Observable;

public class CObserverTwo extends AObserver{

	public CObserverTwo(State[] state, Observable obs)
	{
		super(state);
		elecStrat = new ElectoralDemocratOne();
		popStrat = new PopularDemocrat();	
		obs.addObserver(this);
	}

}
