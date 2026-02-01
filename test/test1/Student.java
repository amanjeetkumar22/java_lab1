package test.test1;
/*Design a class Student with: name , rollNo, marks. Include: Constructor, Method to display, Static
variable collegeName . Demonstrate object creation.*/
class Student {
    String name;
    int rollNo;
    int marks;
    static String collegeName = "KIIT";

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " " + rollNo + " " + marks + " " + collegeName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aman", 101, 85);
        Student s2 = new Student("Ravi", 102, 90);

        s1.display();
        s2.display();
    }
}
