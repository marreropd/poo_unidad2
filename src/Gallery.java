import java.io.IOException;
import java.util.Iterator;

public class Gallery {

    private Multimedia[] listMultimedia;
    private int contador;
    private galleryMultimediaIterator iterator;
    private WriteReadMultimediaObj gestor;

    public Gallery(int maxSize) {
        listMultimedia = new Multimedia[maxSize];

        gestor = new WriteReadMultimediaObj("estanteria.dat");
        iterator = new galleryMultimediaIterator();
        contador = 0;
    }


    public int size() {
        return contador;
    }

    public boolean full() {
        return contador == listMultimedia.length;
    }

    public boolean add(Multimedia m) {
        if (full()) {
            return false;
        } else {
            listMultimedia[contador] = m;
            contador++;
            return true;
        }
    }

    public Multimedia get(int position) {
        if (position < 0 || position >= contador) {
            throw new IndexOutOfBoundsException();
        }
        return listMultimedia[position];
    }

    public int indexOf(Multimedia m) {
        for (int i = 0; i < listMultimedia.length; i++) {
            if (listMultimedia[i] == m) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String stringToReturn = "";
        for (int i = 0; i < contador; i++) {
            stringToReturn += "Item" + (i + 1) + ":" + " author: " + listMultimedia[i].getAuthor() + ", duration: " +
                    listMultimedia[i].getDuration() + " title: " + listMultimedia[i].getTitle() + "\n";
        }
        return stringToReturn;
    }
}

class galleryMultimediaIterator implements Iterator {
    private int index = 0;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}