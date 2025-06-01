
public abstract class Hayvan {
    protected String turAdi;
    protected double agirlik;
    protected int yas;

    public Hayvan(String turAdi, double agirlik, int yas) {
        this.turAdi = turAdi;
        this.agirlik = agirlik;
        this.yas = yas;
    }

    public String getTurAdi() {
        return turAdi;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public int getYas() {
        return yas;
    }

    public abstract double getDosage();        
    public abstract String getFeedSchedule();    
}

public class At extends Hayvan {
    public At(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
     
        return agirlik * 0.1;  
    }

    @Override
    public String getFeedSchedule() {
        return "At için yem saati: 08:00 ve 18:00";
    }
}

public class Zebra extends Hayvan {
    public Zebra(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
    
        return agirlik * 0.12;
    }

    @Override
    public String getFeedSchedule() {
        return "Zebra için yem saati: 09:00 ve 19:00";
    }
}

// Kedigiller grubu
public class Kaplan extends Hayvan {
    public Kaplan(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
     
        return agirlik * 0.2;
    }

    @Override
    public String getFeedSchedule() {
        return "Kaplan için yem saati: 12:00";
    }
}

public class Aslan extends Hayvan {
    public Aslan(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return agirlik * 0.22;
    }

    @Override
    public String getFeedSchedule() {
        return "Aslan için yem saati: 12:00 ve 20:00";
    }
}


public class Sican extends Hayvan {
    public Sican(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return agirlik * 0.05;
    }

    @Override
    public String getFeedSchedule() {
        return "Sıçan için yem saati: 06:00, 14:00, 22:00";
    }
}

public class Kunduz extends Hayvan {
    public Kunduz(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return agirlik * 0.06;
    }

    @Override
    public String getFeedSchedule() {
        return "Kunduz için yem saati: 07:00 ve 19:00";
    }
}
