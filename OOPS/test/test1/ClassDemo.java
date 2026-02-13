package test.test1;
// Base class Player
class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

// Cricketer class inheriting Player
class Cricketer extends Player {
    int runs;
    int wickets;

    Cricketer(String name, int age, int runs, int wickets) {
        super(name, age);
        this.runs = runs;
        this.wickets = wickets;
    }

    void display() {
        super.display(); // call parent display
        System.out.println("Sport : Cricket");
        System.out.println("Runs    : " + runs);
        System.out.println("Wickets : " + wickets);
        System.out.println();
    }
}

// Footballer class inheriting Player
class Footballer extends Player {
    int goals;
    int matches;

    Footballer(String name, int age, int goals, int matches) {
        super(name, age);
        this.goals = goals;
        this.matches = matches;
    }

    void display() {
        super.display(); // call parent display
        System.out.println("Sport   : Football");
        System.out.println("Goals   : " + goals);
        System.out.println("Matches : " + matches);
        System.out.println();
    }
}

// Main class ClassDemo
public class ClassDemo {
    public static void main(String[] args) {
        // Creating objects
        Cricketer c = new Cricketer("Virat Kohli", 36, 8000, 4);
        Footballer f = new Footballer("Lionel Messi", 38, 780, 900);

        // Print details
        c.display();
        f.display();
    }
}
