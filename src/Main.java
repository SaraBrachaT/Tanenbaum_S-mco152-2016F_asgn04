
public class Main {

	public static void main(String[] args) {
		
		State newYork = new State("New York", 29);
		State maine = new State("Maine", 4);
		State alabama = new State("Alabama", 9);
		State alaska = new State("Alaska", 3); 
		State california = new State("California", 55);
		
		State[] states = new State[]{newYork, maine, alabama, alaska, california};

		ElectionData observable = new ElectionData(states);
		
		new CObserverFive(states, observable);
		new CObserverFour(states, observable);
		new CObserverThree(states, observable);
		new CObserverTwo(states, observable);
		new CObserverOne(states, observable);

		newYork.addPopularDemocraticVotes(50);
		newYork.addPopularRepublicanVotes(25);
		
		maine.addPopularDemocraticVotes(17);
		maine.addPopularRepublicanVotes(80);
		
		alabama.addPopularDemocraticVotes(8);
		alabama.addPopularRepublicanVotes(18);
		
		alaska.addPopularDemocraticVotes(64);
		alaska.addPopularRepublicanVotes(46);
		
		california.addPopularDemocraticVotes(100);
		california.addPopularRepublicanVotes(295);
		
		observable.setVotingData(states);
		
		newYork.addPopularDemocraticVotes(501);
		newYork.addPopularRepublicanVotes(215);
		
		maine.addPopularDemocraticVotes(171);
		maine.addPopularRepublicanVotes(801);
		
		alabama.addPopularDemocraticVotes(81);
		alabama.addPopularRepublicanVotes(181);
		
		alaska.addPopularDemocraticVotes(641);
		alaska.addPopularRepublicanVotes(461);
		
		california.addPopularDemocraticVotes(1100);
		california.addPopularRepublicanVotes(1295);
		
		observable.setVotingData(states);
		
		newYork.addPopularDemocraticVotes(506);
		newYork.addPopularRepublicanVotes(255);
		
		maine.addPopularDemocraticVotes(174);
		maine.addPopularRepublicanVotes(800);
		
		alabama.addPopularDemocraticVotes(821);
		alabama.addPopularRepublicanVotes(118);
		
		alaska.addPopularDemocraticVotes(614);
		alaska.addPopularRepublicanVotes(406);
		
		california.addPopularDemocraticVotes(10);
		california.addPopularRepublicanVotes(25);
		
		observable.setVotingData(states);
	}
}
