public class Robot implements Competitors {
    private String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (maxRunDistance >= distance) {
            System.out.println(name + " успешно пробежал дистанцию");
            return true;
        } else {
            System.out.println(name + " сошел с дистанции");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println(name + " успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть стену");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
