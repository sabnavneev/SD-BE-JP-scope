package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {

    public static void main(String[] args) {
        int totalsum = 0;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            totalsum = totalsum + random.nextInt();
        }
        System.out.println("De som van alle random-getallen is: " + totalsum);
    }
}

// Voeg de volgende code na de for-lus toe: System.out.println("De som van alle random-getallen is: " + totalsum);. De code heeft nu een foutmelding.
// Los deze foutmelding op en zorg ervoor dat de som van alle getallen correct wordt uitgeprint.
