package org.perscholas.ooppractice;

import org.perscholas.ooppractice.people.Myself;
import org.perscholas.ooppractice.people.PeterParker;

//create this because this is how you create your programs -- this is the method responsible to run the entire thing.
public class Main {
    public static void main(String[] args){
        Myself naes = new Myself("naes","devenecia",25,"pizza");//by typing "Myself" this it automatically does import since we created it in Myself folder
//        System.out.printlnt(naes.firstName);
//        System.out.printInt(naes.lastName);

        PeterParker peter = new PeterParker("peter", "parker",25,"pasta","person","spide power")


        peter.quip( "Green Goblin")  }
}
