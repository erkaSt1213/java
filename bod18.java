package uulen;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class bod18 {
       public static void main(String[] args) {
        try {
            // Robot классыг үүсгэнэ
            Robot robot = new Robot();

            // Дэлгэцний хэмжээ авах
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            // Дэлгэцээс зураг авах
            BufferedImage screenCapture = robot.createScreenCapture(screenRect);

            // Тайлбарыг файл руу хадгалах
            File file = new File("screen_capture.png");
            ImageIO.write(screenCapture, "png", file);

            System.out.println("Тайлан амжилттай хадгалагдлаа: " + file.getAbsolutePath());
        } catch (AWTException | IOException ex) {
            System.err.println(ex);
        }
    }
}