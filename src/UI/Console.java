package UI;

import java.util.LinkedHashMap;
import java.util.Scanner;
import Commands.Command;
import Commands.Help;
import Objects.Analyzer;

public class Console {
    Analyzer command;
    public Console(){
        String input = new String(new Scanner(System.in).nextLine());
        command = new Analyzer(input);
        new commandManager(command);
    }
    private static class commandManager{
        private final LinkedHashMap<String, Command> commandsName;
        {
            commandsName = new LinkedHashMap<>();
            commandsName.put("help", new Help());
        }
        public commandManager(Analyzer command) {
            try{
                Command com = commandsName.get(command.getTask());
                com.run(command.getVal());
            }catch (Exception e){
                System.out.printf();
            }
        }
    }
}
