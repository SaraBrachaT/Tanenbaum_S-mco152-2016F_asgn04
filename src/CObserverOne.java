import java.util.Observable;

public class CObserverOne extends AObserver{
	
	public CObserverOne(State[] state, Observable obs)
	{
		super(state);
		elecStrat = new ElectoralRepublicanOne();
		popStrat = new PopularRepublican();	
		obs.addObserver(this);
	}
	
}
