

import java.util.Observable;

public class ElectionData extends Observable{

	private int popularDemocrat,
				popularRepublican,
				numElectoralVotes;
	private State[] states;
	
	public ElectionData(State[] state)
	{
		states = state;
	}
	
	public void dataChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setVotingData(State[] state)
	{
		states = state;
		for(int i = 0; i < states.length; i++)
		{
			this.popularDemocrat = states[i].getpopularDemocrat();
			this.popularRepublican = states[i].getpopularRepublican();
			this.numElectoralVotes = states[i].getNumElectoralVotes();
		}
		dataChanged();
	}
	
	//the observers will pull (since the data will change constantly on the night of the election; a push will constantly be pushing)
	public int getPopularDemocrat()
	{
		return this.popularDemocrat;
	}
	
	public int getPopularRepublican()
	{
		return this.popularRepublican;
	}
	
	public int getNumElectoralVotes()
	{
		return this.numElectoralVotes;
	}
	
}
