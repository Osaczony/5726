package arena;

import java.util.Scanner;

public class silnikWalki {


    owadInfo domyslnyTemplate = new owadInfo("JestemŻuk1", 1500, 100, 100, 100, 10, "Test");
    owadInfo domyslnyTemplate2 = new owadInfo("JestemŻuk2", 1000, 100, 100, 105, 10, "Test");
    owadInfo graczPierwszy = new owadInfo("Gracz1", 1000, 100, 100, 100, 10, "Test");
    owadInfo graczDrugi = new owadInfo("Gracz2", 1000, 100, 100, 100, 10, "Test");
    owadInfo Skarabeusz = new owadInfo("Skarabeusz", 2200, 380, 50, 35, 10, "Skarabeusz to zabójczy zbój. Zabije nawet pająka." );
    owadInfo Zuk = new owadInfo("Żuk", 1800, 500, 40, 70, 50, "Toczy kulkę gnoju, wprost do swego domku.");
    owadInfo Modliszka = new owadInfo("Modliszka", 2100, 750, 0, 90, 50, "Ma ostre szpony");


        //wczytywanie owada
        Scanner wyborOwadaZmienna = new Scanner(System.in);
        //obiekt dla licznika tur
        licznikTur licznikTurObiekt = new licznikTur();
        //obiekt dla sprawdzenia, któy owad jest szybszy
        ktoJestSzybszy ktoJestSzybszyObiekt = new ktoJestSzybszy();
        //obiekt dla obrażeń krytycznych
        //trafienieKrytyczne trafienieKrytyczneObiekt = new trafienieKrytyczne();



        //metoda ustaw owada
    void ustawOwada(){
        System.out.println("Proszę wybrać pierwszego owada (od 1 do 3)");
        int wybor = wyborOwadaZmienna.nextInt();
        switch (wybor){
            case 1:
                domyslnyTemplate = Skarabeusz;
                break;
            case 2:
                domyslnyTemplate = Zuk;
                break;
            case 3:
                domyslnyTemplate = Modliszka;
                break;
        }

    }

    void ustawOwada2(){
            domyslnyTemplate2 = Zuk;
    }

   //główny silnik walki
        public void walka(){

            ustawOwada();
            ustawOwada2();
            if (domyslnyTemplate.szybkosc >= domyslnyTemplate2.szybkosc){
                graczPierwszy = domyslnyTemplate;
                graczDrugi = domyslnyTemplate2;
            }
            else {
                graczPierwszy = domyslnyTemplate2;
                graczDrugi = domyslnyTemplate;
            }

            ktoJestSzybszyObiekt.ktoJestSzybszy();



            while (graczPierwszy.hp > 0 && graczDrugi.hp > 0){


                System.out.println("-------------------------------------------------");
                System.out.println("Aktualna tura: " + licznikTurObiekt.policzLiczbeTur());
                System.out.print(graczPierwszy.nazwa + " atakuje pierwszy zadając " + graczPierwszy.obrazenia + " obrażeń.");
                graczDrugi.hp = graczDrugi.hp - graczPierwszy.obrazenia;
                System.out.println(" Aktualna wartość życia " + graczDrugi.nazwa + " to " + graczDrugi.hp + ".");
                //zabezpieczenie aby nie dublować spadku życia dla obu obiektów;
                if (graczDrugi.hp <= 0){
                    break;
                }
                System.out.print(graczDrugi.nazwa + " atakuje drugi zadając " + graczDrugi.obrazenia + " obrażeń.");
                graczPierwszy.hp = graczPierwszy.hp - graczDrugi.obrazenia;
                System.out.println(" Aktualna wartość życia " + graczPierwszy.nazwa + " to " + graczPierwszy.hp + ".");
            }
        }

    }


