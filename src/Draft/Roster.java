package Draft;

public class Roster {

    private Coach coach;
    private Player[] player;

    public Roster(Coach coach, Player[] player){
        this.coach = coach;
        this.player = player;
    }

    public Coach getCoach(){
        return coach;
    }

    public Player[] getPlayer(){
        return player;
    }
}
