package com.company;

import database.ConnectionConfiguration;
import entitet.Låner;
import utilities.input;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConnectionConfiguration.getConnection();
        List<Låner> lånerList = new LinkedList<>();

        //try {
            //Connection connection = ConnectionConfiguration.getConnection();

                //PreparedStatement statement = connection.prepareStatement("select * from bibliotekOnsdag.låner");
                //ResultSet result = statement.executeQuery();

            //while (result.next()) {

                //int id = result.getInt("idlåner");
                //String navn = result.getString("navn");
                //String adresse = result.getString("adresse");
                //int postnummer = result.getInt("postnummer");

                //Låner låner = new Låner(id, navn, adresse, postnummer);

                //System.out.println(låner.toString());

                //lånerList.add(låner);
            //}

        //} catch (Exception e) {
            //e.printStackTrace();
        //}

        for(Låner låner : lånerList) {
            System.out.println(låner.toString());
        }

        while (true) {
            switch (input.getString("angiv dit ønske?")) {
                case "lån bog":
                    System.out.println("du ønsker at låne en bog");
                    break;
                case "stop":
                    break;
            }
            if (input.getString("q for quit").equalsIgnoreCase("q")) {
                break;
            }
        }
    }
}