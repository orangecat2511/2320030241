package designPattern;

abstract class WeaponsFactory {
    public abstract Weapons createWeapons();

    public static WeaponsFactory getFactory(int level) {
        if (level < 3) {
            return new FirstWeaponsFactory();
        } else if (level < 5) {
            return new SecondWeaponsFactory();
        } else {
            return new ThirdWeaponsFactory();
        }
    }
}

class FirstWeaponsFactory extends WeaponsFactory {
    @Override
    public Weapons createWeapons() {
        return new FirstSword();
    }
}

class SecondWeaponsFactory extends WeaponsFactory {
    @Override
    public Weapons createWeapons() {
        return new SecondSword();
    }
}

class ThirdWeaponsFactory extends WeaponsFactory {
    @Override
    public Weapons createWeapons() {
        return new ThirdSword();
    }
}
