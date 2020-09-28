package arena;

import java.util.Random;

public class trafienieKrytyczne extends silnikWalki{

    owadInfo domyslnyTemplate = new owadInfo("JestemŻuk1", 1500, 200, 100, 100, 10, "Test");




    Random losowanieKrytycznegoTrafienia = new Random();


    public int losowanieKrytycznePierwszegoGracza(){
        int wynikLosowania = losowanieKrytycznegoTrafienia.nextInt(101);
        return wynikLosowania;
    }

    public int losowanieKrytyczneDrugiegoGracza(){
        int wynikLosowania = losowanieKrytycznegoTrafienia.nextInt(101);
        return wynikLosowania;
    }
}
