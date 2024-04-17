package Commands;

import Objects.Print;
import static Data.MainCollection.data;
public class Update extends Command{
    private int pos;
    public void run(String[] arg){
        try{
            for (int i = 0; i < data.size(); i++){
                if(data.get(i).GetID() == Integer.parseInt(arg[0])){
                    pos = i;
                    break;
                }
            }
            data.get(pos).setName(arg[1]);
            data.get(pos).setCord(Long.parseLong(arg[2]), Integer.parseInt(arg[3]));
            data.get(pos).setNum(Integer.parseInt(arg[4]));
            data.get(pos).setAlbum(arg[5]);
            data.get(pos).setGenre(arg[6]);
            data.get(pos).setLabel(arg[7]);
            new Print().out("Sucsesfuly updated");
        }catch (Exception e){
            new Print().outErr("Field");
        }
    }
}
