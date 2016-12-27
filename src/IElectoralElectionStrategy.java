
public interface IElectoralElectionStrategy {

	int[] electoralVotes = new int[2]; //totalDem, totalRep
	public abstract int[] calculateElectoral(State[] states);	
}
