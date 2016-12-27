
public class ElectoralHonest implements IElectoralElectionStrategy{

	public int[] calculateElectoral(State[] states)
	{
		//reset
		electoralVotes[0] = 0;
		electoralVotes[1] = 0;

		for(int i = 0; i < states.length; i++)
		{
			if(states[i].getpopularDemocrat() > states[i].getpopularRepublican())
			{
				electoralVotes[0] += states[i].getNumElectoralVotes();
			}
			else
			{
				electoralVotes[1] += states[i].getNumElectoralVotes();
			}
		}
		return electoralVotes;
	}
}
