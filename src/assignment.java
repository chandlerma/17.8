import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class assignment {

    public static void main(String[] args) throws IOException {

        File file = new File("src/text files/Exercise17_08.dat");

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            int count = (raf.length() != 0) ? raf.readInt() + 1 : 1;
            raf.seek(0);
            raf.writeInt(count);
            System.out.println("The count is " + count);
        }


    }
}