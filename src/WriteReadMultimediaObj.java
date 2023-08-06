import java.io.*;
import java.util.ArrayList;

public class WriteReadMultimediaObj {
    private FileOutputStream fileOutputStream;
    private FileInputStream fileInputStream;
    private ObjectOutputStream write;
    private ObjectInputStream read;
    private String file;

    public WriteReadMultimediaObj(String file) {
        this.file = file;
    }

    public void writeObject(Gallery gallery) throws IOException {
        fileOutputStream = new FileOutputStream(file);
        write = new ObjectOutputStream(fileOutputStream);
        for (int i = 0; i < gallery.size(); i++) {
            write.writeObject(gallery.get(i));
        }
        write.close();
    }

    public ArrayList readObject(int numObjects) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList objectList = new ArrayList();
        fileInputStream = new FileInputStream(file);
        write = new ObjectOutputStream(fileOutputStream);
        for (int i = 0; i < numObjects; i++) {
            objectList.add(readObject(i));
        }
        write.close();
        return objectList;
    }
}
