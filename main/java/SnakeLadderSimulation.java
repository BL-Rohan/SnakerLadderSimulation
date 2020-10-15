import java.util.Random;

public class SnakeLadderSimulation {

    /*
     * Constant
     * */
    public static final int START_POSITION = 0;
    public static final int PLAYER_ONE = 1;
    public static final int END_POSITION = 100;

    /*
     * Variables
     * */
    int rollDiceValue;
    int optionsCheckValue;
    int position = START_POSITION;


    /*
     * @author  : ROHAN KADAM
     * @purpose : To RollDice For getting dice value.
     * @date    : 15/10/2020
     * */
    public void rollDice() {
        Random random = new Random();
        rollDiceValue = random.nextInt(6) + PLAYER_ONE;

    }
    /*
     * @author  : ROHAN KADAM
     * @purpose : To Check Options for no-play ,snake and ladder.
     * @date    : 15/10/2020
     * */
    public void checkOptions() {
        Random random = new Random();
        optionsCheckValue = random.nextInt(3) + PLAYER_ONE;
        if (optionsCheckValue == 1) {
            position = position + 0;
        }
        if (optionsCheckValue == 2) {
            position = position - rollDiceValue;
        }
        if (optionsCheckValue == 3) {
            position = position + rollDiceValue;
        }
    }

    public static void main(String[] args) {
        SnakeLadderSimulation snakeLadderSimulation = new SnakeLadderSimulation();
        snakeLadderSimulation.rollDice();
        snakeLadderSimulation.checkOptions();

    }
}
