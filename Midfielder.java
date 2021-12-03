package uk.epl.player;

public class Midfielder extends Player{
    private int PASSING_POINT = 10;
    private String role = "Midfielder";
    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }

    public String getRole(){
        return this.role;
    }

    public void setPosition(){
        this.position.x = 34;
        this.position.y = 50;
    }

    @Override
    public float getPassing(){
        return super.getPassing() + PASSING_POINT;
    }
}
