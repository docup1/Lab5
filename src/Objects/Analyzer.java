package Objects;

public class Analyzer {

    String task;
    String position;
    char tag;
    int val = 0;

    public Analyzer(String comand){
        try {
            String[] words = comand.split(" ");
            if(words.length == 1){
                this.Seter(comand);
            }
            else {
                this.Seter(words[0], Integer.parseInt(words[1]));
            }
        }
        catch(Exception e){
            new Print().printErr();
        }
    }
    private void Seter(String task, int val){
        this.task = task;
        this.val = val;
    }
    private void Seter(String task){
        this.task = task;
    }
    public int getVal(){
        return this.val;
    }
    public String getTask(){
        return this.task;
    }
}
