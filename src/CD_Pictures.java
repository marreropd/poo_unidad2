public class CD_Pictures extends Multimedia {
    int numFotos;

    public CD_Pictures(String title, String author, String duration, int numFotos) {
        super.Multimedia(title, author, duration);
        this.numFotos = numFotos;
    }

    @Override
    public String toString() {
        return "CD_Pictures{" +
                "numFotos=" + numFotos +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public int getNumFotos() {
        return numFotos;
    }

    public void setNumFotos(int numFotos) {
        this.numFotos = numFotos;
    }
}
