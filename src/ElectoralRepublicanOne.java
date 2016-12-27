

public class ElectoralRepublicanOne implements IElectoralElectionStrategy{

	public int[] calculateElectoral(State[] states) {
		//reset
		electoralVotes[0] = 0;
		electoralVotes[1] = 0;

		for(int i = 0; i < states.length; i++)
			{
				if(states[i].getStateName().equals("Maine")) //hardcoding state
				{
					electoralVotes[1] += states[i].getNumElectoralVotes();
				}
				else{ //assuming no tie cuz I don't know what to do then
					if(states[i].getpopularDemocrat() > states[i].getpopularRepublican())
					{
						electoralVotes[0] += states[i].getNumElectoralVotes();
					}
					else
					{
						electoralVotes[1] += states[i].getNumElectoralVotes();
					}
				}
			}
		return electoralVotes;
	}

}
