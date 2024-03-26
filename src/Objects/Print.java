package Objects;

public class Print {

    String helpInfo = "help - выводит список всех доступных команд";
    String errMasage = "Illegal argument";

    public Print(){
        System.out.printf(
            ""
        );
    }
    public void printErr(){
        System.err.printf(errMasage + "\n");
    }

}
