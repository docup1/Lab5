package Commands;

import Data.MainCollection;
import Data.MusicBand;
import Objects.Print;
import Objects.Writer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import static Data.MainCollection.data;
import static Data.MainCollection.notUsedID;

public class Add extends Command{
    MusicBand val;
    int id;
    public void run(String[] argument){
        try{
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            if(notUsedID.size() > 0){
                try {
                    id = notUsedID.get(0);
                    notUsedID.remove(0);
                }catch (Exception e){}
            }
            else id = data.size() + 1;
            val = new MusicBand(
                    id,
                    argument[0],
                    argument[1], Integer.parseInt(argument[2]),
                    dateFormat.format(date),
                    Integer.parseInt(argument[3]),
                    argument[4],
                    argument[5],
                    argument[6]
            );
            data.add(val);


            new Print().out("Sucsesfuly added");
        }catch (Exception e){
            new Print().outErr("Field");
        }
    }
}
