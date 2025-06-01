
public class Universite {
    private List<Siniflik> sinifliklar;
    private List<Departman> departmanlar;
    private List<Ofis> ofisler;
    private List<Calisan> calisanlar;
}

public class Siniflik {
    // Detaylar yok
}

public class Departman {
    private List<Ofis> ofisler;
}

public class Ofis {
    
}

public abstract class Calisan {
    private Ofis ofis;
}

public class Profesor extends Calisan {
    
}

public class Memur extends Calisan {
    
}
