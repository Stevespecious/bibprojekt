package entitet;

public class Forfatter {
    private int idforfatter;
    private String forfatternavn;

    public Forfatter(int idforfatter, String forfatternavn) {
        this.idforfatter = idforfatter;
        this.forfatternavn = forfatternavn;
    }

    public int getIdforfatter() {
        return idforfatter;
    }

    public void setIdforfatter(int idforfatter) {
        this.idforfatter = idforfatter;
    }

    public String getForfatternavn() {
        return forfatternavn;
    }

    public void setForfatternavn(String forfatternavn) {
        this.forfatternavn = forfatternavn;
    }

    @Override
    public String toString() {
        return "Forfatter{" +
                "idforfatter=" + idforfatter +
                ", forfatternavn='" + forfatternavn + '\'' +
                '}';
    }
}
