package test;

public class Main {
    public static void main(String[] args) {
        // Test constructor and toString()
        Trace2 ahTeck = new Trace2("Uraz Yavanoglu", "Maltepe Ankara Turkey");
        System.out.println(ahTeck); // toString()
        // Test Setters and Getters
        ahTeck.setAddress("Cankaya Ankara Turkey");
        System.out.println(ahTeck);
// run toString() to inspect the modified instance
        System.out.println(ahTeck.getName());
        System.out.println(ahTeck.getAddress());
        // Test addCourseGrade(), printGrades() and getAverageGrade()
        ahTeck.addCourseGrade("CENG101", 60);
        ahTeck.addCourseGrade("CENG102", 70);
        ahTeck.addCourseGrade("CENG103", 80);
        ahTeck.printGrades();
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());
        Trace2 ahTeck2 = new Trace2("Uraz Yavanoglu", "Maltepe Ankara Turkey");
        ahTeck2.addCourseGrade("CENG103", 80);
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade() - 20);
        ahTeck.setAddress("Ankara Turkey Turkey");
        System.out.println(ahTeck.getAddress());
        ahTeck2.addCourseGrade("CENG101", 60);
        ahTeck2.addCourseGrade("CENG102", 70);
        System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade() - 10);
        ahTeck2.printGrades();
    }
}