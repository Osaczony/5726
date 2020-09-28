package arena;

public class ktoJestSzybszy {

    owadInfo domyslnyTemplate = new owadInfo("JestemŻuk1", 1500, 100, 100, 100, 10, "Test");
    owadInfo domyslnyTemplate2 = new owadInfo("JestemŻuk2", 1000, 100, 100, 105, 10, "Test");

    void ktoJestSzybszy() {
        System.out.println("Szybkość " + domyslnyTemplate.nazwa + " wynosi: " + domyslnyTemplate.szybkosc + " | Szybkość " + domyslnyTemplate2.nazwa + " wynosi: " + domyslnyTemplate2.szybkosc);
        if (domyslnyTemplate.szybkosc >= domyslnyTemplate2.szybkosc) {
            System.out.println(domyslnyTemplate.nazwa + " jest szybszy, dlatego rozpoczyna walkę jako pierwszy.");
        }
        else{
            System.out.println(domyslnyTemplate2.nazwa + " jest szybszy, dlatego rozpoczyna walkę jako pierwszy.");
        }
    }

}
