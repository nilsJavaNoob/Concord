/**
 * Created by user on 20.08.2016.
 */
public class Automat {

        int curent;// номинальный ток
        String target = "";
        String nomer = "";
        double cabel = 2.5;//сечение провода
        String room ="";//цех
        String tip ="";//однофазный или трёхфазный
        String firma ="";//изготовитель
        String box = "";//местонахождение автомата
        String remark = "";

    public String toString() {
       return "Автомат - " + nomer + "питает" + room;
    }

}

