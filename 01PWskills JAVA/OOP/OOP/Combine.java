package OOP;

abstract class Bird {
    public abstract void eat();

    public abstract void fly();
}

abstract class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle fly at high height");
    }
}

abstract class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow fly at lower height");
    }
}

class GoldenEagle extends Eagle {
    public void eat() {
        System.out.println("hunt and eat on sea");
    }
}

class SerpentEagle extends Eagle {
    @Override
    public void eat() {
        System.out.println("hunt and eat on mountain");
    }
}

class VegSparrow extends Sparrow {
    public void eat() {
        System.out.println("eat grass and vegies");
    }
}

class NonvegSparrow extends Sparrow {
    @Override
    public void eat() {
        System.out.println("eat caterpiller and insects");
    }
}

class Sky {
    public void permit(Bird ref) {
        ref.eat();
        ref.fly();
        System.out.println();
    }
}

public class Combine {
    public static void main(String[] args) {
        GoldenEagle ge = new GoldenEagle();
        SerpentEagle se = new SerpentEagle();
        VegSparrow vs = new VegSparrow();
        NonvegSparrow ns = new NonvegSparrow();
        Sky s = new Sky();
        s.permit(ge);
        s.permit(se);
        s.permit(vs);
        s.permit(ns);

    }
}
