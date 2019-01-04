package sess2;

public class VoteProblem {

	public static void main(String[] args) {
		//We have learnt Single Value storage Container
		//Multi Value storage container
		
		//Model - Store the data

		/*int demArizonaVotes = 200;
		int demFloridaVotes = 250;
		int demIndyVotes = 100;
		int demTexasVotes = 50;
		int demGerogiaVotes = 70;
		
		int repArizonaVotes = 150;
		int repFloridaVotes = 400;
		int repIndyVotes = 50;
		int repTexasVotes = 70;
		int repGerogiaVotes = 90;*/

		//int demVotes = demArizonaVotes+demFloridaVotes+ demGerogiaVotes+demIndyVotes+demTexasVotes;
		//int repVotes = repArizonaVotes+repFloridaVotes+repGerogiaVotes+repIndyVotes+repTexasVotes;
		
		//if(demVotes> repVotes){
		//	System.out.println("Democratics have won the elections");
		//}
		//System.out.println("Republics have won the elections");
		int demVotesCount =0;
		int repVotesCount =0;
		
		int [] repVotes ={10, 20, 450, 500, 300};
		int[] demVotes = { 20,50, 300, 320, 170};
		
		for (int votes: demVotes){
			demVotesCount = demVotesCount + votes;
		}
		
		for (int votes: repVotes){
			repVotesCount = repVotesCount + votes;
		}
		
		if(demVotesCount > repVotesCount){
			System.out.println("Democratic Party has won the Election By:"+(demVotesCount-repVotesCount)+ " Votes!!");
		}
		System.out.println("Democratic Party has won the Election By:"+(repVotesCount-demVotesCount)+ " Votes!!");
	}

}
