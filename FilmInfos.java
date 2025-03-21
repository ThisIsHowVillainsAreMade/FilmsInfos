public class FilmInfos {
    String Film = "Indiana Jones";
    Boolean isSeen = true;
    int year = 1981;
    double rating = 8.4;

    public void printFilmInfos() {
        System.out.println("Film: " + Film);
        System.out.println("isSeen: " + isSeen);
        System.out.println("year: " + year);
        System.out.println("rating: " + rating);
    }

    public String getFilm() {
        return Film;
    }

    public void setFilm(String film) {
        this.Film = film;
    }

    public boolean getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(boolean isSeen) {
        this.isSeen = isSeen;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void main(String[] args) {
        FilmInfos filmInfos = new FilmInfos();
        filmInfos.printFilmInfos();
    }
}