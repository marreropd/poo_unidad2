public class Disc extends Multimedia {
    String genre;

    public Disc(String title, String author, String duration, String genre) {
        super.Multimedia(title, author, duration);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
