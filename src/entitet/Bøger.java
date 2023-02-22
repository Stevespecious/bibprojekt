package entitet;

public class Bøger {
    private int idbøger;
    private String title;
    private String forfatter;

    public Bøger(int idbøger, String title, String forfatter) {
        this.idbøger = idbøger;
        this.title = title;
        this.forfatter = forfatter;
    }

    public int getIdbøger() {
        return idbøger;
    }

    public void setIdbøger(int idbøger) {
        this.idbøger = idbøger;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    @Override
    public String toString() {
        return "Bøger{" +
                "idbøger=" + idbøger +
                ", title='" + title + '\'' +
                ", forfatter='" + forfatter + '\'' +
                '}';
    }
}
