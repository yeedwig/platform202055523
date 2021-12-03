package uk.epl.player;
import java.util.List;
import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int jerseyNumber;
    private int[] abilities = new int[3];
    final int SPEED = 0; final int STAMINA = 1; final int PASSING = 2;
    private String role;

    public Player(String name, int jerseyNumber, int speed, int stamina, int passing){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.abilities[0] = speed;
        this.abilities[1] = stamina;
        this.abilities[2] = passing;
    }

    public Position position = new Position(0,0);

    public class Position{
        public int x;
        public int y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getJerseyNumber(){
        return this.jerseyNumber;
    }

    public Position getPosition(){
        return new Position(position.x, position.y);
    }

    public void setPosition(){
        this.position.x = 0;
        this.position.y = 0;
    }
    protected String getRole(){
        return this.role;
    }

    public void moveUp(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.y - move_delta);
        decreaseStamina();
    }

    public void moveDown(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.y + move_delta);
        decreaseStamina();
    }

    public void moveLeft(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.x - move_delta);
        decreaseStamina();
    }

    public void moveRight(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.x + move_delta);
        decreaseStamina();
    }

    public String toString(){
        return "\nPlayer Name='"+ this.name +", JerseyNumber=" + this.jerseyNumber + " Position (" + this.position.x + " , " + this.position.y + ") "
                + this.getRole() +" " + "SPEED=" + String.format("%.1f",this.getSpeed()) + ", , " + "STAMINA=" + String.format("%.1f",this.getStamina()) + ", , PASSING=" + String.format("%.1f",this.getPassing());
    }

    private void decreaseStamina(){
        abilities[STAMINA] = (int) (abilities[STAMINA] - 2);
    }

    private float getMoveDelta(){
        return 1 + getSpeed()/100 * getStamina()/100;
    }

    protected float getSpeed(){
        return (float)abilities[SPEED];
    }

    protected float getStamina(){
        return (float)abilities[STAMINA];
    }

    protected float getPassing(){
        return (float)abilities[PASSING];
    }

}
