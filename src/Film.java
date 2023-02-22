public class Film {
    private String filmName;
    private int productedYear;
    private FilmStudio studio;
    private double price;
    private Date openingDay;

//    constructor


    public Film(String filmName, int productedYear, FilmStudio studio, double price, Date openingDay) {
        this.filmName = filmName;
        this.productedYear = productedYear;
        this.studio = studio;
        this.price = price;
        this.openingDay = openingDay;
    }

//    set & get

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getProductedYear() {
        return productedYear;
    }

    public void setProductedYear(int productedYear) {
        this.productedYear = productedYear;
    }

    public FilmStudio getStudio() {
        return studio;
    }

    public void setStudio(FilmStudio studio) {
        this.studio = studio;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOpeningDay() {
        return openingDay;
    }

    public void setOpeningDay(Date openingDay) {
        this.openingDay = openingDay;
    }

//    methods

    public boolean compareTicketPrice(Film other){
        return this.price < other.price;
    }

    public FilmStudio getNameOfStudio(){
        return this.studio;
    }
    public double priceAfterSale(int x){
        return this.price = this.price - this.price * x/100;
}
}
