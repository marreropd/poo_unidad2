abstract public class Multimedia {
    String title;
    String author;
    String duration;

    public void Multimedia(String title, String author, String duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Multimedia{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public boolean equals(Multimedia multimedia) {
        if (multimedia.author == this.author && multimedia.title == this.title) {
            return true;
        } else return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
