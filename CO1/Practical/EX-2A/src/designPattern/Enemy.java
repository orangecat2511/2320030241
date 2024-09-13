package designPattern;

abstract class Enemy {
    public abstract void attack();
}

class FirstEnemy extends Enemy {
    @Override
    public void attack() {
        System.out.println("This is the first enemy of the game");
    }
}

class SecondEnemy extends Enemy {
    @Override
    public void attack() {
        System.out.println("This is the second enemy");
    }
}

class ThirdEnemy extends Enemy {
    @Override
    public void attack() {
        System.out.println("This is the third enemy");
    }
}
