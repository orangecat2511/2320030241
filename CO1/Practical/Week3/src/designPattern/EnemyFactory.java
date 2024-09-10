package designPattern;

abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public static EnemyFactory getFactory(int level) {
        if (level < 3) {
            return new FirstEnemyFactory();
        } else if (level < 5) {
            return new SecondEnemyFactory();
        } else {
            return new ThirdEnemyFactory();
        }
    }
}

class FirstEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new FirstEnemy();
    }
}

class SecondEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new SecondEnemy();
    }
}

class ThirdEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new ThirdEnemy();
    }
}

