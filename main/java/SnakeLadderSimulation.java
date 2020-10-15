import java.util.Random;

public class SnakeLadderSimulation {

    /*
     * Constant
     * */
    public static final int START_POSITION = 0;
    public static final int END_POSITION = 100;


    /*
     * Variables
     * */
    int rollDiceValue;
    int optionsCheckValue;
    int position = START_POSITION;
    int dice_count = START_POSITION;
    int player_1_position, player_2_position = 0;
    boolean playerSwitch = true;


    /*
     * @author  : ROHAN KADAM
     * @purpose : To RollDice For getting dice value.
     * @date    : 15/10/2020
     * */
    public void rollDice() {
        Random random = new Random();
        rollDiceValue = random.nextInt(6) + 1;
        dice_count = dice_count + 1;
        System.out.println("Dice Count:-  " + dice_count);


    }

    /*
     * @author  : ROHAN KADAM
     * @purpose : To Check Options for no-play ,snake and ladder.
     * @date    : 15/10/2020
     * */
    public void checkOptions() {
        Random random = new Random();
        optionsCheckValue = random.nextInt(3) + 1;
        rollDice();
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

    /*
     * @author  : ROHAN KADAM
     * @purpose : To play till the Player reaches the winning position 100.
     * @date    : 15/10/2020
     * */
    public void playerPlaysTillWinning() {

        while (position < END_POSITION) {
            twoPlayerPlaying();
        }
        if (player_1_position == END_POSITION) {
            System.out.println("Player *One* Wins" + player_1_position);
        }
        if (player_2_position == END_POSITION) {
            System.out.println("Player **Two** Wins" + player_2_position);
        }
    }

    /*
     * @author  : ROHAN KADAM
     * @purpose : To play for two player until one wins
     * @date    : 15/10/2020
     * */
    public void twoPlayerPlaying() {
        if (playerSwitch = true) {
            player_1_position = playingCondition();
            position = player_2_position;
            playerSwitch = false;
            System.out.println("Player 1 Position:-  "+player_1_position);
        }
        if (!playerSwitch) {
            player_2_position = playingCondition();
            position = player_1_position;
            playerSwitch = true;
            System.out.println("Player 2 Position:-  "+player_2_position);
        }

    }

    public int playingCondition() {
        checkOptions();
        System.out.println("Player Position:-  " + position);

        if (position < START_POSITION) {
            position = START_POSITION;

        }
        if (position > END_POSITION) {
            position = position - rollDiceValue;
        }
        return position;
    }


    public static void main(String[] args) {
        SnakeLadderSimulation snakeLadderSimulation = new SnakeLadderSimulation();
        snakeLadderSimulation.playerPlaysTillWinning();

    }
}
