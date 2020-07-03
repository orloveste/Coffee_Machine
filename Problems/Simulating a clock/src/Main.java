class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (minutes < 59) {
            this.minutes++;
        } else if (minutes == 59) {
            this.minutes = 0;
            if (hours < 12) {
                this.hours++;
            } else if (hours == 12) {
                this.hours = 1;
            }
        }
    }

    /*public static void main(String[] args) {
        Clock test = new Clock();
        test.next();
        System.out.println(test.hours + ":" + test.minutes);
    }*/
}