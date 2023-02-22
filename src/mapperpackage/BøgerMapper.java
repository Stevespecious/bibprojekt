package mapperpackage;

import database.ConnectionConfiguration;
import entitet.Bøger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class BøgerMapper {
    protected static List<Bøger> getBøgerList() {

        List<Bøger> bøgerList = new LinkedList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            PreparedStatement statement = connection.prepareStatement("select * from bibliotekOnsdag.bøger");
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int idbøger = result.getInt("idbøger");
                String title = result.getString("title");
                String forfatter = result.getString("forfatter");

                Bøger bøger = new Bøger(idbøger, title, forfatter);

                System.out.println(bøger.toString());

                bøgerList.add(bøger);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bøgerList;
    }
}
