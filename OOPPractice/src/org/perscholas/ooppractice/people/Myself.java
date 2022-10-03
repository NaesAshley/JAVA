package org.perscholas.ooppractice.people;

public class Myself {
    // practice constructure
    // making classes
    // since its not responsible for the entire thing you don't include the "public static : void thing"
    // EVERYTHING IN JAVA is a class!
    // JAVA is one of THE obj oriented -- generally either JAVA or C++ programming -- only METHODS not really function?
    public String firstName;
    public String lastName;
    public int age; //term "public" ia an access modifier
    public String favoriteFood;

    // with a class we have constructor
    public Myself(String firstName, String lastName, int age, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }
    public void greeting() {
        System.out.println("Hello, my name is" + this.firstName + "it is nice to meet you!");
    }

    public void goodbye() {
        System.out.println("Good")
    }

}
    /*
* export class MyComponent {*
*   spaceships: Ship[] = [];*
**
 */

/*
 class SpaceShip {
constructor(properties{
}*/
