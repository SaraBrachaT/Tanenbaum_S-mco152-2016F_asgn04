

public class PopularHonest implements IPopularElectionStrategy {

	public int[] calculateDemocratic(State[] states) {
		
		for(int i = 0; i < states.length; i++)
		{
			demVotes[i] = states[i].getpopularDemocrat();
		}
		return demVotes;
	}

	public int[] calculateRepublican(State[] states) {

		for(int i = 0; i < states.length; i++)
		{
			repVotes[i] = states[i].getpopularRepublican();
		}
		return repVotes;
	}
}
