public class FilmStudio {
    private String filmStudioName;
    private String country;

    public FilmStudio(String filmStudioName, String country) {
        this.filmStudioName = filmStudioName;
        this.country = country;
    }

    public String getFilmStudioName() {
        return filmStudioName;
    }

    public void setFilmStudioName(String filmStudioName) {
        this.filmStudioName = filmStudioName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
