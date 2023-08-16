import java.util.Scanner;

public class WhatIsClass {
/*
    * Since we know Java is an object oriented programmin language,
    * java thinks that everything in real world entity is an Object
    * and every object will have some properties (fields) and behaviour (methods)

    *What is Class?
    * It is a template or blueprint from which objects are created.
    * for example
    *   --> if your making an admission form for school/college, first you will need blue-print.
    *   --> In blue print, we will have common fields from which we can get the student information.
    *   --> I am creating a class/blueprint for student with few details.
 */
}

class Student {
    /*
     * We have used static variable schoolName --> it is associated with class, but not object.
     */
    static String schoolName;

    /*
        * One thing you can observe below variables, we have not used static keyword.
        * So all these variables are associated with Object, not with class
     */
    int rollNumber;
    String studentName;
    String fatherName;
    String motherName;
    long phoneNumber;
    String standard;
    String streetName;
    String mandal;
    String district;
    String state;
    int totalMarks;

    public double getPercentage() {
        return (totalMarks*100/600);
    }
}

class WhatIsObject {
    /*
    * It is a copy of blue-print which we can create using the class.
    * for example
    *   --> I am creating object of Student
    *   --> I am trying to retrieve details from user.
     */

    public static void main(String[] args) {
        Student.schoolName = "chaithanya";
        Student st = new Student(); // we can create object using new keyword.
        // In above st is a variable which store copy of Student (it means xerox of Student blueprint)
        st.studentName = "bhanu";
        st.motherName = "sruthi";
        st.fatherName = "suresh";
        st.totalMarks = 395;
        double percentage = st.getPercentage();
        System.out.println("percentage -> " + percentage);



        Student st1 = new Student(); // we can create object using new keyword.
        // In above st1 is a variable which store copy of Student (it means xerox of Student blueprint)
        Scanner sc = new Scanner(System.in); // to get data from user
        System.out.println("enter student name - ");
        st1.studentName = sc.next();
        System.out.println("enter father name - ");
        st1.fatherName = sc.next();
        System.out.println("enter mother name - ");
        st1.motherName = sc.next();
        System.out.println("enter standard/class - ");
        st1.standard = sc.next();
        /*System.out.println("enter Phone number - ");
        st1.phoneNumber = sc.nextLong();
        System.out.println("enter street name - ");
        st1.streetName = sc.next();
        System.out.println("enter mandal  - ");
        st1.mandal = sc.next();
        System.out.println("enter district name - ");
        st1.district = sc.next();
        System.out.println("enter state name - ");
        st1.state = sc.next();*/
        System.out.println("enter total marks - ");
        st1.totalMarks = sc.nextInt();

        System.out.println("percentage is --> " + st1.getPercentage());
    }
}