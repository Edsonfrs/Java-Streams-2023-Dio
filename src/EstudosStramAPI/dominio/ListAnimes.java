package EstudosStramAPI.dominio;

public class ListAnimes {

    private String title;
    private double price;

    public ListAnimes(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "title: " + title + " - " + "price: " + price + "\n"
                ;
    }
}
