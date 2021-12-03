package uk.epl.game;
import java.util.ArrayList;
import java.util.List;
import uk.epl.player.*;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player player){
        player.position.x = 0;
        player.position.y = 0;
        players.add(player);
    }

    public void moveUp(int jerseynumber){
        for(Player i : players){
            if(i.getJerseyNumber() == jerseynumber){
                i.moveUp();
                break;
            }
        }
    }

    public void moveDown(int jerseynumber){
        for(Player i : players){
            if(i.getJerseyNumber() == jerseynumber){
                i.moveDown();
                break;
            }
        }
    }

    public void moveLeft(int jerseynumber){
        for(Player i : players){
            if(i.getJerseyNumber() == jerseynumber){
                i.moveLeft();
                break;
            }
        }
    }

    public void moveRight(int jerseynumber){
        for(Player i : players){
            if(i.getJerseyNumber() == jerseynumber){
                i.moveRight();
                break;
            }
        }
    }
    public void start(){
        for(Player i : players){
            i.setPosition();
        }
    }

    public void stop(){};

    public void info(){
        for(Player i : players){
            System.out.println(i);
        }
    }

}
