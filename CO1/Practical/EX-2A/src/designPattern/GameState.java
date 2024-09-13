package designPattern;

public class GameState {
    private static GameState instance;
    private int level = 0;
    private int score = 0;
    private int lives = 5;

    private final int MAX_LEVEL = 10; // Define a maximum level cap

    private GameState() {
        // Private constructor to prevent instantiation from other classes
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    // Returns true if the level was incremented, false if max level reached
    public boolean nextLevel() {
        if (level < MAX_LEVEL) {
            level++;
            return true;
        } else {
            System.out.println("You've reached the maximum level!");
            return false;
        }
    }

    public int getLevel() {
        return level;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public int getLives() {
        return lives;
    }

    public void loseLife() {
        lives--;
    }
}
