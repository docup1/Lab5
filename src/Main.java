import Objects.Analyzer;
import Objects.Parser;
import Objects.Print;
import UI.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Parser().init();
        new Print().printMass();
        String input;
        while (true){
            input = new String(new Scanner(System.in).nextLine());
            new Console(new Analyzer(input));
        }
    }
}