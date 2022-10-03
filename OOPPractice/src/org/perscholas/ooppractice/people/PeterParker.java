package org.perscholas.ooppractice.people;

public class PeterParker extends Myself {
    public String secretIdentity;
    public String superPower;

    public PeterParker(String firstName, String lastName, int age, String favoriteFood, String secretIdentity, String superPower){
        super(firstName, lastName, age, favoriteFood);
        this.secretIdentity = secretIdentity;
        this.superPower = superPower;
    }

    public void changeDisguise() {
        System.out.println("I gotta go. mom is calling!");
    }

    public void quip(String nameOfEnemy){
        if(nameOfEnemy == "Green goblin") {
            System.out.println("calm down gobby");
        } else if(nameOfEnemy == "doc oc"){
            System.out.println("for an octobpus");
        } else if(nameOfEnemy =="shocker"){
            System.out.println("You couldn't pick a better name?");
        }else{
            System.out.println("you're just not worth knowing");
        }

    }

}
