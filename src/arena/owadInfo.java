package arena;
public class owadInfo {

    //podstawowe parametry owadów;
        String nazwa, opis;
        int hp, obrazenia, pancerz, szybkosc, szansaTrafieniaKrytycznego;

        public owadInfo(){

        }

        //podstawowy konstruktor dla tworzenia owada;
        public owadInfo(String nazwa, int hp, int obrazenia, int pancerz, int szybkosc, int szansaTrafieniaKrytycznego, String opis){
            this.nazwa = nazwa;
            this.hp = hp;
            this.obrazenia = obrazenia;
            this.pancerz = pancerz;
            this.szybkosc = szybkosc;
            this.szansaTrafieniaKrytycznego = szansaTrafieniaKrytycznego;
            this.opis = opis;

        }

        //zwracanie informacji o owadzie;
        public void zwrocDetaleOwada(){
            System.out.println("Detale dla " + nazwa);
            System.out.println("Punkty życia: " + hp);
            System.out.println("Zadawane obrażenia: " + obrazenia);
            System.out.println("Wartość pancerza: " + pancerz);
            System.out.println("Szybkość: " + szybkosc);
            System.out.println("Szansa na trafienie krytyczne: " + szansaTrafieniaKrytycznego + " %");
            System.out.println("Opis: " + opis);
            System.out.println();

        }
}
