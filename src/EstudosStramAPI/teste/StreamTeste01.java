package EstudosStramAPI.teste;

import EstudosStramAPI.dominio.ListAnimes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste01 {

    private static List<ListAnimes> listOfAnimes = new ArrayList<>(List.of(
            new ListAnimes("Blade of the Immortal", 8.99),
            new ListAnimes("Rurouni Kenshin", 3.99),
            new ListAnimes("Hellsing", 5.99),
            new ListAnimes("Mobile Suit Gundam", 2.99),
            new ListAnimes("Neon Genesis Evangelion", 5.99),
            new ListAnimes("Petshop of Horrors", 5.99),
            new ListAnimes("Knights of Sidonia", 4)
    ));

    public static void main(String[] args) {

        // Ordenando por títulos
        listOfAnimes.sort(Comparator.comparing(ListAnimes::getTitle));

        // Recurar os títulos com preços abaixo de 4
        List<String> titles = new ArrayList<>();
        for (ListAnimes Anime : listOfAnimes) {
            if (Anime.getPrice() <= 4) {
                titles.add(Anime.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(listOfAnimes);
        System.out.println(titles);



    }


}
