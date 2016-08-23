/**
 * Created by user on 20.08.2016.
 */
public class Automat {
        int current;// номинальный ток
        String target;
        String nomer;
        double cabel;//сечение провода
        String room;//цех
        String tip;//однофазный или трёхфазный
        String firma;//изготовитель
        String box;//местонахождение автомата
        String remark;
        String connType;

    public Automat(String nomer, String target, String remark, String connType,int current,double cabel,
                   String tip, String firma, String box){
        this.current = current;
        this.target = target;
        this.nomer = nomer;
        this.cabel = cabel;
        this.connType = connType;
        this.firma = firma;
        this.box = box;
        this.remark = remark;
        this.tip = tip;
    }

     public static void main(String[] args) {
        Automat a = new Automat("QF-20","мясной цех"," Питает строго куттер","розетка",16,4.00,"3-f",
                "ABK","ЩС-3") ;
         System.out.println(a.toString());
    }//endMain


    public String toString() {
       return "Автомат " + nomer+" " + target + remark + connType +
               current + cabel + tip + firma + box;
    }

}//endclass

