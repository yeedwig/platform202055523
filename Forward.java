package uk.epl.player;

public class Forward extends Player {
    private int ACCELERATION_POINT = 10;
    private String role = "Forward";

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }

    public String getRole(){
        return this.role;
    }

    public void setPosition(){
        this.position.x = 34;
        this.position.y = 25;
    }

    @Override
    public float getSpeed(){
        return super.getSpeed() + ACCELERATION_POINT;
    }
}
