package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootBallPlayer joe=new FootBallPlayer("Joe");
        BaseBallPlayer pat=new BaseBallPlayer("Pat");
        SoccerPlayer bec=new SoccerPlayer("bec");
        Team<FootBallPlayer> team1=new Team<>("Team1");
        team1.addPlayer(joe);
//        team1.addPlayer(pat);
//        team1.addPlayer(bec);
        System.out.println(team1.numPlayers());

        Team<BaseBallPlayer> team2=new Team<>("Team2");
        team2.addPlayer(pat);

        Team<SoccerPlayer> team3=new Team<>("Team3");
        team3.addPlayer(bec);

        Team<FootBallPlayer> oteam1=new Team<>("OTeam1");
        FootBallPlayer banks=new FootBallPlayer("Joe");
        oteam1.addPlayer(banks);

        Team<FootBallPlayer> team4=new Team<>("team4");
        Team<FootBallPlayer> team5=new Team<>("team5");

        team4.matechResults(team5,1,0);
        team5.matechResults(team1,3,8);

        team1.matechResults(team5,2,1);
        team1.matechResults(team3,1,1);

        System.out.println("Ranking");
        System.out.println(team1.getName()+" : "+team1.ranking());
        System.out.println(team2.getName()+" : "+team2.ranking());
        System.out.println(team3.getName()+" : "+team3.ranking());
        System.out.println(team4.getName()+" : "+team4.ranking());
        System.out.println(team5.getName()+" : "+team5.ranking());

        System.out.println(team5.compareTo(team4));
    }
}
