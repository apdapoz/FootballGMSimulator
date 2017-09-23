package Draft;

public class Team{

    private String name;
    private Roster roster;


    //This object will have a professional team name and a Roster object
    public Team(String name, Roster roster){
        this.name = name;
        this.roster = roster;
    }

    public String getName(){
        return name;
    }

    public Roster getRoster(){
        return roster;
    }
}
