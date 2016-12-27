
public class State {

	private int popularDemocrat,
				popularRepublican,
				numElectoralVotes;
	private String name;
	
	public State(String name, int electoral)
	{
		this.name = name; 
		this.popularDemocrat = 0;
		this.popularRepublican = 0;
		this.numElectoralVotes = electoral;
	}
	
	public void addPopularDemocraticVotes(int votes)
	{
		this.popularDemocrat += votes;
	}

	public void addPopularRepublicanVotes(int votes)
	{
		this.popularRepublican += votes;
	}
	
	public Integer getpopularDemocrat()
	{
		return this.popularDemocrat;
	}
	
	public Integer getpopularRepublican()
	{
		return popularRepublican;
	}
	public Integer getNumElectoralVotes()
	{
		return numElectoralVotes;
	}
	public String getStateName()
	{
		return this.name;
	}
}
