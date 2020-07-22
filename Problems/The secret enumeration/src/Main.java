public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret c : Secret.values()) {
            if (c.toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// At least two constants start with STAR
/*enum Secret {
    STAR, CRASH, START, MONS// ...

}*/
