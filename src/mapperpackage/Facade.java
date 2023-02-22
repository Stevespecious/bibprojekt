package mapperpackage;

import entitet.*;

import java.util.List;

public class Facade {
    public static List<Låner> hentLånere() {
        return LånerMapper.getLånerList();
    }
    public static List<Bøger> hentBøger() {
        return BøgerMapper.getBøgerList();
    }
    public static List<Forfatter> hentForfattere() {
        return ForfatterMapper.getForfatterList();
    }
    public static List<Postnummer> hentPostnummer() {
        return PostnummerMapper.getPostnummerList();
    }
    public static List<Udlån> hentUdlån() {
        return UdlånMapper.getUdlånList();
    }
}
