package uk.epl.player;

public class Defender extends Player {
    private int STRENGTH_POINT = 10;
    private String role = "Defender";

    public Defender(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }

    public String getRole(){
        return this.role;
    }

    public void setPosition(){
        this.position.x = 34;
        this.position.y = 75;
    }

    @Override
    public float getStamina(){
        return super.getStamina() + STRENGTH_POINT;
    }
}
