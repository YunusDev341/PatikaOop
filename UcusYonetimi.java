import java.util.List;

public class HavaYoluSirketi {
    private String sirketId;
    private List<Ucak> ucaklar;
    private List<Pilot> pilotlar;

    public HavaYoluSirketi(String sirketId, List<Ucak> ucaklar, List<Pilot> pilotlar) {
        this.sirketId = sirketId;
        this.ucaklar = ucaklar;
        this.pilotlar = pilotlar;
    }
    
    public String getSirketId() {
        return sirketId;
    }
}

public class UcakTipi {
    private String tipAdi;
    private int gerekliPilotSayisi;

    public UcakTipi(String tipAdi, int gerekliPilotSayisi) {
        this.tipAdi = tipAdi;
        this.gerekliPilotSayisi = gerekliPilotSayisi;
    }

    public String getTipAdi() {
        return tipAdi;
    }

    public int getGerekliPilotSayisi() {
        return gerekliPilotSayisi;
    }
}


enum UcakDurumu {
    CALISIR,
    ONARIMDA
}


public class Ucak {
    private UcakTipi tip;
    private UcakDurumu durum;
    private HavaYoluSirketi sirket;

    public Ucak(UcakTipi tip, UcakDurumu durum, HavaYoluSirketi sirket) {
        this.tip = tip;
        this.durum = durum;
    } 
}