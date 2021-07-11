public class Cross {
    Competitors[] competitors = {
            new Human("Den", 5000, 2),
            new Cat("Barsik", 50, 1),
            new Robot("R2D2", 10000, 0)
    };

    Obstacle[] obstacles = {
            new Treadmill(3000),
            new Wall(1)
    };

    public void doIt() {
        for (Competitors c : competitors) {
            for (Obstacle o : obstacles) {
                if (!o.doIt(c)) break;
            }
        }
    }
}
