public class CD_Videos extends Multimedia {
    int numVideos;

    public CD_Videos(String title, String author, String duration, int numVideos) {
        super.Multimedia(title, author, duration);
        this.numVideos = numVideos;
    }

    @Override
    public String toString() {
        return "CD_Videos{" +
                "numVideos=" + numVideos +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public int getNumVideos() {
        return numVideos;
    }

    public void setNumVideos(int numVideos) {
        this.numVideos = numVideos;
    }
}
