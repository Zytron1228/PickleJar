import java.awt.*;
import java.net.URI;

public class Main {

    public static void main(String[] args) {
        print("Never Gonna Give You Up!\n");
        openWebpage(URI.create("https://youtu.be/pyoURHR-g4U"));
        print("Never Gonna Let You Down\n!");
        System.out.print("Never Gonna Run Around ");
        print("And Desert You!\n");
        print("Never Gonna Make You Cry!\n");
        print("Never Gonna Say Goodbye!\n");
        print("Never Gonna Tell A lie;\n");
        print("Or Hurt You!");
    }

    private static void print(String ln) {
        System.out.println(ln);
    }

    public static boolean openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}