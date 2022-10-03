package org.perscholas.gladiator.gladiator;

import java.util.ArrayList;
import java.util.Arrays;

public class Arena {
    public String arenaName;
    public String arenaLocation;
    public Name[] colosseumGladiators; //created to call name array of your specific name -- "variable of class Name"
    public Name[] gladiatorsMax2;


    ///next block is to call a gladiator to the arena
    public Arena(String arenaName, String arenaLocation) {
        this.arenaName = arenaName.substring(0, 1).toUpperCase() + arenaName.substring(1);
        this.arenaLocation = arenaLocation;
        this.colosseumGladiators = new Name[0]; //anytime you initialize an array you have to give it a specific size. we basically said this is an empty array. gave a new array of "Name"class with a size of 0.
    }

    public void addGladiators(Name Champion) { // "Champion is a variable of type Name. Referencing something "later" ~variable
        if (this.colosseumGladiators.length <= 1) { /// is to extend it to never have more thant 2 gladiators in it at a time
            ArrayList<Name> Championslist = new ArrayList<Name>(Arrays.asList(this.colosseumGladiators)); //asList converts an array into an arraylist "is used to return a fixed-size list backed by the specified array"
            Championslist.add(Champion); //takes nameObj champion and then add it to my array list named Championslist. Now = convert back to array. ---- we added a champion obj into ChampionsList
            this.colosseumGladiators = Championslist.toArray(this.colosseumGladiators);// = reconverts champiansList back into an array again. it is now called colosseumGladiators.

            ///Next is to extend it to never have more thant 2 gladiators in it at a time
        }
    }

    public void fightNow() {
        if (this.colosseumGladiators[0].Weapon == "Spear") {
            if (this.colosseumGladiators[1].Weapon == "Club") {
                System.out.println(this.colosseumGladiators[0].firstName + "wins!");
            } else if (this.colosseumGladiators[1].Weapon == "Trident") {
                System.out.println(this.colosseumGladiators[1].firstName + "wins!");
            } else {
                System.out.println("both" + this.colosseumGladiators[0].firstName + this.colosseumGladiators[1].firstName + "dies!");
            }
        } else if (this.colosseumGladiators[0])
    }
}