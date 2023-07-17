import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите путь до папки:");
        String input = new Scanner(System.in).nextLine();
        DecimalFormat dc = new DecimalFormat("#.#");
        double size = (double) (FileUtils.calculateFolderSize(input)) / 1024 / 1024 / 1024;
        System.out.println ("Размер папки: " + dc.format(size) + " Гб");
    }
}
