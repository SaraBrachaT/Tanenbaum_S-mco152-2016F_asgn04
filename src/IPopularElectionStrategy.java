public interface IPopularElectionStrategy {

	int[] demVotes = new int[5];
	int[] repVotes = new int[5];
	
	public abstract int[] calculateDemocratic(State[] states);
	public abstract int[] calculateRepublican(State[] states);
}
