public class Movie extends Multimedia {
    String mainActor;


    public Movie(String title, String author, String duration, String mainActor) {
        super.Multimedia(title, author, duration);
        this.mainActor = mainActor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mainActor='" + mainActor + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }
}
