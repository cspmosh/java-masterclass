import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {

    private String playerName;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(){

    }

    public Player(String playerName, int hitPoints, int strength, String weapon) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<>();
        values.add(0, playerName);
        values.add(1, ""+  hitPoints);
        values.add( 2, "" + strength);
        values.add(3, weapon);
        return values;
    }

    @Override
    public void restore(List<String> values) {
        if (values != null && values.size() > 0){
            this.playerName = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }
}
