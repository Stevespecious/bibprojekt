package mapperpackage;

import database.ConnectionConfiguration;
import entitet.Udlån;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class UdlånMapper {
    protected static List<Udlån> getUdlånList() {
        List<Udlån> udlånList = new LinkedList<>();

        try {
            Connection connection = ConnectionConfiguration.getConnection();

            PreparedStatement statement = connection.prepareStatement("select * from bibliotekOnsdag.udlån");
            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int idudlån = result.getInt("idudlån");
                int idbøger = result.getInt("idbøger");
                int idlåner = result.getInt("idlåner");

                Udlån udlån = new Udlån(idudlån, idbøger, idlåner);

                System.out.println(udlån.toString());

                udlånList.add(udlån);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return udlånList;
    }
}
