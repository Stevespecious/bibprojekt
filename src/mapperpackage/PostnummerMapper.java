package mapperpackage;

import database.ConnectionConfiguration;
import entitet.Postnummer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class PostnummerMapper {
    protected static List<Postnummer> getPostnummerList() {
        List<Postnummer> postnummerList = new LinkedList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            PreparedStatement statement = connection.prepareStatement("select * from bibliotekOnsdag.postnummer");
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int postnummer = result.getInt("postnummer");
                String bynavn = result.getString("bynavn");

                Postnummer postnr = new Postnummer(postnummer, bynavn);

                System.out.println(postnr.toString());

                postnummerList.add(postnr);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return postnummerList;
    }
}
