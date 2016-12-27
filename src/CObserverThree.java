import java.util.Observable;

public class CObserverThree extends AObserver{
	
	public CObserverThree(State[] state, Observable obs)
	{
		super(state);
		elecStrat = new ElectoralRepublicanTwo();
		popStrat = new PopularDemocrat();	
		obs.addObserver(this);
	}

}
