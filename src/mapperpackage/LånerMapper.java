package mapperpackage;

import database.ConnectionConfiguration;
import entitet.Låner;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LånerMapper
{


    protected static List<Låner> getLånerList()
    {


        List<Låner> lånerList = new ArrayList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();


            PreparedStatement statement = connection.prepareStatement("SELECT * FROM BibliotekOnsdag.Låner ");

            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int id = result.getInt("idlåner");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int post = result.getInt("postnummer");

                Låner låner = new Låner(id, navn, adresse, post);
                lånerList.add(låner);

            }


        } catch (Exception e) {

            e.printStackTrace();

        }

        return lånerList;

    }


    protected    Låner opretLåner(Låner låner) throws SQLException
    {


        try {
            Connection connection = ConnectionConfiguration.getConnection();

            String sql = "INSERT  INTO BibliotekOnsdag.Låner (navn, adresse, postnr) VALUES (?,?,?)";

//            PreparedStatement statement = connection.prepareStatement("INSERT  INTO BibliotekOnsdag.Låner (navn, adresse, postnr)" + "VALUES (?,?,?)");
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, låner.getNavn());
            statement.setString(2, låner.getAdresse());
            statement.setInt(3, låner.getPostnummer());


            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            resultSet.next();


            låner.setIdlåner(resultSet.getInt(1));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return låner;


    }


}