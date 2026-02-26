class Movie {
    String movieName;
    double rating;

    void setMovie(String name, double r) {
        movieName = name;
        rating = r;
    }

    void displayMovie() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating + " / 5");
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovie("Inception", 4.8);
        movie.displayMovie();
    }
}