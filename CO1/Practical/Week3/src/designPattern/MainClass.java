package designPattern;

public class MainClass {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        
        while (gameState.getLives() > 0) {
            System.out.println("Level " + gameState.getLevel());
            
            EnemyFactory enemyFactory = EnemyFactory.getFactory(gameState.getLevel());
            Enemy enemy = enemyFactory.createEnemy();
            enemy.attack();
            
            WeaponsFactory weaponFactory = WeaponsFactory.getFactory(gameState.getLevel());
            Weapons weapon = weaponFactory.createWeapons();
            weapon.sword();
            
            gameState.addScore(100);
            
            if (!gameState.nextLevel()) {
                break; // Exit the loop if max level is reached
            }
        }
        
        System.out.println("Game Over! Final Score: " + gameState.getScore());
    }
}
