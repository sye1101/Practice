package Dice;

public class DiceGame {
	  private Die die1;
	  private Die die2;
	  private Player gamer;

	  public DiceGame(){
	    die1 = new Die();
	    die2 = new Die();
	    gamer = new Player("Kim Game");
	  }

	  public static void main(String[] args) {
	    DiceGame dicegame = new DiceGame();
	    dicegame.initialize();
	  }

	  public void initialize() {
	    boolean win;
	 
	    while(true){
	      win = gamer.play(die1, die2);
	      if(win) {
	        System.out.println("합이 7 이어서 승리");
	        break;
	      }
	      else {
	        System.out.println("합이 7이 아니어서 패배");
	      }
	    }
	  }
	}

