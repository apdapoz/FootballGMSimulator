package Draft;

public class Player {

    private String name;
    private int overall;
    private String position;

    public Player(String name, int overall, String position){
        this.name = name;
        this.overall = overall;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public int getOverall(){
        return overall;
    }

    public String getPosition(){
        return position;
    }
}
