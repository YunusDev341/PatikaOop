import java.util.List;


public class Film {
    private String filmAdi;
    private boolean mevcut; 

    public Film(String filmAdi, boolean mevcut) {
        this.filmAdi = filmAdi;
        this.mevcut = mevcut;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public boolean isMevcut() {
        return mevcut;
    }


    public void talepEt() {
        System.out.println(filmAdi + " filmi talep edildi.");
    }
}


public abstract class Kullanici {
    protected String isim;

    public Kullanici(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    
    public void filmSatinal(Film film) {
        if (film.isMevcut()) {
            System.out.println(isim + " filmi satın aldı: " + film.getFilmAdi());
        } else {
            System.out.println("Film mevcut değil, talep ediliyor...");
            film.talepEt();
        }
    }
}


public class NormalKullanici extends Kullanici {
    public NormalKullanici(String isim) {
        super(isim);
    }
}


public class AboneKullanici extends Kullanici {
    private int kredi;

    public AboneKullanici(String isim, int kredi) {
        super(isim);
        this.kredi = kredi;
    }

    public int getKredi() {
        return kredi;
    }

    public void krediSatinal(int miktar) {
        kredi += miktar;
        System.out.println(isim + " " + miktar + " kredi satın aldı. Toplam kredi: " + kredi);
    }


    public void filmKirala(Film film, int krediBedeli) {
        if (!film.isMevcut()) {
            System.out.println("Film mevcut değil, talep ediliyor...");
            film.talepEt();
            return;
        }

        if (kredi >= krediBedeli) {
            kredi -= krediBedeli;
            System.out.println(isim + " filmi kiraladı: " + film.getFilmAdi() + ", kalan kredi: " + kredi);
        } else {
            System.out.println("Yeterli kredi yok.");
        }
    }
}
