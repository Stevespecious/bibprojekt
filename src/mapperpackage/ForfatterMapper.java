package mapperpackage;

import database.ConnectionConfiguration;
import entitet.Forfatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ForfatterMapper {
    protected static List<Forfatter> getForfatterList() {
        List<Forfatter> forfatterList = new LinkedList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            PreparedStatement statement = connection.prepareStatement("select * from bibliotekOnsdag.forfatter");
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int idforfatter = result.getInt("idforfatter");
                String forfatternavn = result.getString("forfatternavn");

                Forfatter forfatter = new Forfatter(idforfatter, forfatternavn);

                System.out.println(forfatter.toString());

                forfatterList.add(forfatter);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return forfatterList;
    }
}
