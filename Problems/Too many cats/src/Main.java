class Cat {

    // write static and instance variables
    public String name;
    public int age;
    public static int count = 0;

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        count++;

        // do not forget to check the number of cats
        if (count > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return count;
    }

   /* public static void main(String[] args) {
        Cat newCat = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
        Cat newCat2 = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
        Cat newCat3 = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
        Cat newCat23 = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
        Cat newCat4 = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
        Cat newCat24 = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
        Cat newCat247 = new Cat("zuza", 2);
        System.out.println(getNumberOfCats());
    }*/
}