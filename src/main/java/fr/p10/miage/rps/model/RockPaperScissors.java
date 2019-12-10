package fr.p10.miage.rps.model;

public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public Result ResultPlay(RPSEnum p1, RPSEnum p2){
        if(p1==p2){return Result.TIE;}
        if(p1 == RPSEnum.PAPER && p2 == RPSEnum.SCISSORS || (p1 == RPSEnum.ROCK && p2 == RPSEnum.PAPER) || (p1 == RPSEnum.SCISSORS && p2 == RPSEnum.ROCK)){return Result.LOST;}
        return Result.WIN;
    }


}
