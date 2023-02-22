package mapperpackage;

import database.ConnectionConfiguration;
import entitet.Låner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class LånerMapper {
    protected static List<Låner> getLånerList() {
        List<Låner> lånerList = new LinkedList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            PreparedStatement statement = connection.prepareStatement("select * from bibliotekOnsdag.låner");
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int id = result.getInt("idlåner");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int postnummer = result.getInt("postnummer");

                Låner låner = new Låner(id, navn, adresse, postnummer);

                lånerList.add(låner);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lånerList;
    }
}
