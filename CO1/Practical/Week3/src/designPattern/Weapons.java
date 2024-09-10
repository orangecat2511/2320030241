package designPattern;

abstract class Weapons {
    public abstract void sword();
}

class FirstSword extends Weapons {
    @Override
    public void sword() {
        System.out.println("Level 1 Sword");
    }
}

class SecondSword extends Weapons {
    @Override
    public void sword() {
        System.out.println("Level 2 Sword");
    }
}

class ThirdSword extends Weapons {
    @Override
    public void sword() {
        System.out.println("Level 3 Sword");
    }
}
