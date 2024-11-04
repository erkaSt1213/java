package my_project;
import java.io
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.StringReader;

import javax.swing.*;
public class WriteFileFromHand {
    private static final FilterOutputStream out = null;

    public static void main(String args[]) throws IOException{
        String s =JOptionPane.showInputDialog("Та"+ "Файлд бичих өгөгдлөө оруулна уу:");
        Reader in = new StringReader(s);
        BufferedOutputStream("d:out.txt"));
        int charRead;
        while ((charRead=in.read()) != -1) {
            out.write(charRead);
         }
         out.close();
        }
} 