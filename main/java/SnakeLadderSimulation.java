import java.util.Random;

public class SnakeLadderSimulation {

    /*
    * Constant
    * */
    public static final int START_POSITION=0;
    public static final int PLAYER_ONE=1;
    public static final int END_POSITION=100;

    /*
    * Variables
    * */
    int rollDiceValue;


    public  void rollDice(){
        Random random = new Random();
        rollDiceValue= random.nextInt(6) +PLAYER_ONE ;

    }

    public static void main(String[] args) {
        SnakeLadderSimulation snakeLadderSimulation=new SnakeLadderSimulation();
          snakeLadderSimulation.rollDice();
    }
}
