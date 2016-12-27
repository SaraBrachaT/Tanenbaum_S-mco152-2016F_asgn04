

public class ElectoralRepublicanTwo implements IElectoralElectionStrategy{

	public int[] calculateElectoral(State[] states) {
		State smallDemLead = states[0];
		//reset
		electoralVotes[0] = 0;
		electoralVotes[1] = 0;

		for(int i = 0; i < states.length; i++)
		{
			if(states[i].getpopularDemocrat() - states[i].getpopularRepublican() > 0 && states[i].getpopularDemocrat() - states[i].getpopularRepublican() < smallDemLead.getpopularDemocrat() - smallDemLead.getpopularRepublican())
			{
				smallDemLead= states[i];
			}
		}
		
		for(int j = 0; j < states.length; j++)
		{
			if(states[j].equals(smallDemLead))
			{
				electoralVotes[0] += states[j].getNumElectoralVotes()/2;
				electoralVotes[1] += states[j].getNumElectoralVotes()/2 + states[j].getNumElectoralVotes() % 2;
			}
			else{
				if(states[j].getpopularDemocrat() > states[j].getpopularRepublican())
				{
					electoralVotes[0] += states[j].getNumElectoralVotes();
				}
				else
				{
					electoralVotes[1] += states[j].getNumElectoralVotes();
				}
			}
		}
		return electoralVotes;
	}

	
}
