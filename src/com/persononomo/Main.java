package com.persononomo;

import com.persononomo.Occupation.*;


public class Main {

    public static void main(String[] args) {

	    Director CEO = new Director();
        CEO.setName("Nickolas");
        CEO.setAge(50);
        CEO.setGender("male");
        CEO.setCar("Mercedes");
        CEO.setParkingPlace(1);
        CEO.setKabinet(2);

        Architect chiefArchitect = new Architect(5);
        chiefArchitect.setName("Arnold");
        chiefArchitect.setAge(46);
        chiefArchitect.setGender("male");
        chiefArchitect.setKabinet(4);

        Architect architect_1 = new Architect(2);
        architect_1.setName("Fiona");
        architect_1.setAge(33);
        architect_1.setGender("female");
        architect_1.setKabinet(4);

        Architect architect_2 = new Architect();
        architect_2.setName("Alex");
        architect_2.setAge(24);
        architect_2.setGender("male");
        architect_2.setKabinet(4);

        Engineer engineer_1 = new Engineer();
        engineer_1.setName("Fred");
        engineer_1.setAge(30);
        engineer_1.setGender("male");
        engineer_1.setKabinet(5);

        Engineer engineer_2 = new Engineer();
        engineer_2.setName("Tomas");
        engineer_2.setAge(28);
        engineer_2.setGender("male");
        engineer_2.setKabinet(5);

        EngineerRemote engineer_3 = new EngineerRemote();
        engineer_3.setName("Linda");
        engineer_3.setAge(22);
        engineer_3.setGender("female");


        System.out.println("Occupation\t\t" + "Name\t\t" + "Age\t\t" + "Gender\t\t" + "Kabinet\t\t" + "Work_Type\t\t" + "Car\t\t" + "Parking_Place\t\t");
        System.out.println("Occupation\t\t" + CEO.getName() + "\t" + "Age\t\t" + "Gender\t\t" + "Kabinet\t\t" + "Work_Type\t\t" + "Car\t\t" + "Parking_Place\t\t");
        System.out.println("Occupation1111\t\t" + CEO.getName() + "\t" + "Age\t\t" + "Gender\t\t" + "Kabinet\t\t" + "Work_Type\t\t" + "Car\t\t" + "Parking_Place\t\t");

    }

}
