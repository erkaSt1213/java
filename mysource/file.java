import java.io.File;
import java.io.FileOutputstream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ByteBuffer;
import java.io.channels.FileChannel;
public class WriteAstring[{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String Phrase = new String("Garbage in, Garbage out\n");
        String dirname = "C:/Java";
        String filname = "charData.txt";
        File dir = new File(dirname);
        if(!dir.exists()) {
            if(!dir.mkdir()){
                System.out.println("Cannot create directory:"+dirname);
                System.exit(1);
            }
        }else if(!dir.isDirectory()) {
            System.err.println(dirname+"is not a directory");
            System.exit(1) ;
        }
File aFile =new File(dir, filname) ;
FileOutputStream outputFile = null;
        )
    }
}]