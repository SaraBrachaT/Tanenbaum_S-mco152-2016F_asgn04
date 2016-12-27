import java.time.LocalDateTime;
import java.util.Observable;
import java.util.Observer;

public abstract class AObserver implements Observer{
	
	IElectoralElectionStrategy elecStrat;
	IPopularElectionStrategy popStrat;
	String message = "Note: These reports are observational and, at times, innacurate \nThe current time is ";
	private State[] states;
	private int electoralVotes;
	private int democraticVotes;
	private int republicanVotes;
	
	public AObserver(State[] state) 
	{
		states = state;	
	}
	public String getPopularAssessment()
	{
		StringBuilder sb = new StringBuilder();
		int sumDem = 0;
		int sumRep = 0;
		sb.append("\nThe popular vote is assessed to stand as follows");
		for(int i = 0; i < states.length; i++){
			sb.append("\n\tIn state ");
			sb.append(states[i].getStateName());
			sb.append(" the democratic vote is at ");
			sb.append(popStrat.calculateDemocratic(states)[i]);
			sb.append(" and the republican vote is at ");
			sb.append(popStrat.calculateRepublican(states)[i]);
			sumDem += popStrat.calculateDemocratic(states)[i];
			sumRep += popStrat.calculateRepublican(states)[i];
		}
		
		sb.append("\nThe total Democratic vote is trending at ");
		sb.append(sumDem);
		sb.append("\nThe total Republican vote is trending at ");
		sb.append(sumRep);
		return sb.toString();
	}
	
	public String getElectoralPrediction()
	{
		int[] elecVotes = elecStrat.calculateElectoral(states);
		if(elecVotes[0] == elecVotes[1])
		{
			return "\n\nThe winner of the electoral vote cannot be determined";
		}
		else if(elecVotes[0] > elecVotes[1])
		{
			return "\n\nThe Democrats are winning the electoral vote"; 
		}
		else{
			return "\n\nThe Republicans are winning the electoral vote";
		}
	}
	
	public void update(Observable observable, Object stateObject) //don't use stateObject, used for push
	{
		if (observable instanceof ElectionData)
		{
			ElectionData electionData = (ElectionData) observable;
			this.electoralVotes = electionData.getNumElectoralVotes();
			this.democraticVotes = electionData.getPopularDemocrat();
			this.republicanVotes = electionData.getPopularRepublican();
			display();
		}
	}
	
	public String getMessage()
	{
		return "\n" + message + LocalDateTime.now();
	}
	
	public void display()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(getPopularAssessment());
		sb.append(getElectoralPrediction());
		sb.append(getMessage());
		
		System.out.println(sb.toString());
	}
	
}
