package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootBallPlayer>> footballLeague=new League<>("AFL");
        Team<FootBallPlayer> team1=new Team<>("Team1");
        Team<FootBallPlayer> oteam1=new Team<>("OTeam1");
        Team<FootBallPlayer> team4=new Team<>("team4");
        Team<FootBallPlayer> team5=new Team<>("team5");

        footballLeague.add(team1);
        footballLeague.add(oteam1);
        footballLeague.add(team4);
        footballLeague.add(team5);

        team4.matechResults(team5,1,0);
        team5.matechResults(team1,3,8);
        team1.matechResults(oteam1,2,1);
        team1.matechResults(team4,1,1);

        footballLeague.showLeagueTable();

    }
}
