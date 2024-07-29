package org.example;

public class Park {
    private String name;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String name, int maxAttractions) {
        this.name = name;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String workingHours, double cost) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(name, workingHours, cost);
        } else {
            System.out.println("No more attractions can be added.");
        }
    }

    public void printAttractions() {
        System.out.println("Park: " + name);
        for (int i = 0; i < attractionCount; i++) {
            attractions[i].printInfo();
        }
    }

    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Mir Chudes", 3);

        park.addAttraction("Chyortovo Koleso", "10:00 - 18:00", 50.0);
        park.addAttraction("Karusel", "10:00 - 22:00", 30.0);
        park.addAttraction("Krivoye Zerkalo", "12:00 - 20:00", 40.0);

        park.printAttractions();
    }
}
