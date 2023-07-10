package boxingGame;

// The code simulates a fight between two fighters in a ring, where they take turns hitting each other until one fighter's health reaches zero.
// The outcome of the match is determined by the damage inflicted and the dodge probability of each fighter.
public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 0, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 0, 95, 100, 0);

        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}


