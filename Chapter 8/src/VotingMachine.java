/* Create a VotingMachine class that can be used for a simple election.
 * 
 * Methods to clear the machine state, to vote for a Democrat, to vote 
 * for a Republican, and to get tallies for both parties.
 */
public class VotingMachine {
	int demVotes;
	int repVotes;
	
	public VotingMachine() {
		this.demVotes = 0;
		this.repVotes = 0;
	}
	
	public void voteDemocrat() {
		demVotes++;
	}
	
	public void voteRepublican() {
		repVotes++;
	}
	
	public void clear() {
		demVotes = 0;
		repVotes = 0;
	}
	
	public int demTally() {
		return demVotes;
	}
	
	public int repTally() {
		return repVotes;
	}
}
