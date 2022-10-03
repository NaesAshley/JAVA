package org.perscholas.gladiator;

import org.perscholas.gladiator.gladiator.Name;
import org.perscholas.gladiator.gladiator.Arena;

public class Main {
    public static void main(String[] args) {
        Name Lamine = new Name("Lamine", "Spear");
        System.out.println(Lamine.firstName);
        System.out.println(Lamine.Weapon);

        Name Naes = new Name("naes", "Club");
        System.out.println(Naes.firstName);
        System.out.println(Naes.Weapon);

        Name Jordan = new Name("jordan", "Trident");
        System.out.println(Jordan.firstName);
        System.out.println(Jordan.Weapon);


        Arena Roma = new Arena("naestle", "Rome Italy");
        System.out.println(Roma.arenaName);
        System.out.println(Roma.arenaLocation);

        Roma.addGladiators(Lamine);
        System.out.println(Roma.colosseumGladiators[0].firstName);

        Roma.addGladiators(Naes);
        System.out.println(Roma.colosseumGladiators[1].firstName);

        Roma.addGladiators(Jordan);
        System.out.println(Roma.colosseumGladiators.length);

        Roma.fightNow();
        System.out.println();
    }
}
