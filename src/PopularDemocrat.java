

public class PopularDemocrat implements IPopularElectionStrategy {

	public int[] calculateDemocratic(State[] states) {
	
		for(int i = 0; i < states.length; i++)
		{
			demVotes[i] = states[i].getpopularDemocrat();
		}
		return demVotes;
	}

	public int[] calculateRepublican(State[] states) {
		
		State largestRep = states[0];
		for(int i = 0; i < states.length; i++)
		{
			if(states[i].getpopularRepublican() > largestRep.getpopularRepublican())
			{
				largestRep = states[i];
			}
		}
		for(int i = 0; i < states.length; i++)
		{
			if(largestRep.getStateName().equals(states[i].getStateName()))
			{
				repVotes[i] = 0;
			}
			else{
				repVotes[i] = states[i].getpopularRepublican();
			}
		}
		return repVotes;
	}

	
}
