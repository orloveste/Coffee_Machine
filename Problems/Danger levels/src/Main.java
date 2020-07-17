enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private final int i;

    DangerLevel(int i) {
        this.i = i;
    }

    public int getLevel() {
        return i;
    }
}