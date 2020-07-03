class Car {

    int yearModel;
    String make;
    int speed/* = 0*/;

    void accelerate() {
        setSpeed(this.speed + 5);
    }
    void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    void brake() {
        if (this.speed >= 5) {
            setSpeed(this.speed - 5);
        }
    }

    /*public static void main(String[] args) {
        Car test = new Car();
        test.accelerate();
        System.out.println(test.speed);
        test.accelerate();
        System.out.println(test.speed);
        test.brake();
        System.out.println(test.speed);
        test.brake();
        System.out.println(test.speed);
        test.brake();
        System.out.println(test.speed);
    }*/
}