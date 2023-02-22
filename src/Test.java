public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(11,11,2021);
        Date d2 = new Date(23,11,2022);
        Date d3 = new Date(15,11,2023);

        FilmStudio fs1 = new FilmStudio("Marvel Studios","America");
        FilmStudio fs2 = new FilmStudio("Universal Pictures","England");
        FilmStudio fs3 = new FilmStudio("VTV","VietNam");

        Film f1 = new Film("maria ozawa",1999,fs1,3000,d1);
        Film f2 = new Film("The God Father",2000,fs2,6000,d2);
        Film f3 = new Film("Harry Porter",1998,fs3,7000,d3);

        System.out.println("Comparing price: f1 is cheaper than f2 ? " + f1.compareTicketPrice(f2));
        System.out.println("f1 is manufatured by :" + f1.getStudio().getFilmStudioName());
        System.out.println("Ticket price after 10% sale is: " + f1.priceAfterSale(10));

    }
}
