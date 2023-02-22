package entitet;

public class Udlån {
    private int idudlån;
    private int idbøger;
    private int idlåner;

    public Udlån(int idudlån, int idbøger, int idlåner) {
        this.idudlån = idudlån;
        this.idbøger = idbøger;
        this.idlåner = idlåner;
    }

    public int getIdudlån() {
        return idudlån;
    }

    public void setIdudlån(int idudlån) {
        this.idudlån = idudlån;
    }

    public int getIdbøger() {
        return idbøger;
    }

    public void setIdbøger(int idbøger) {
        this.idbøger = idbøger;
    }

    public int getIdlåner() {
        return idlåner;
    }

    public void setIdlåner(int idlåner) {
        this.idlåner = idlåner;
    }

    @Override
    public String toString() {
        return "Udlån{" +
                "idudlån=" + idudlån +
                ", idbøger=" + idbøger +
                ", idlåner=" + idlåner +
                '}';
    }
}
