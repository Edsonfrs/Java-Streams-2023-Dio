package EstudosStramAPI.teste;

import EstudosStramAPI.dominio.ListAnimes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste02 {

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

        List<String> titles = listOfAnimes.stream()
                .sorted(Comparator.comparing(ListAnimes::getTitle))
                .filter(la -> la.getPrice() <= 4)
                .limit(3)
                .map(ListAnimes::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);

    }

}
