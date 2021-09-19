
public class Terning {
    public static void main (String[] args) {
    spiller a = new spiller(0, 0);
    spiller b = new spiller(0, 0);
    
    

    while (!a.erferdig() && !b.erferdig()){
        a.Kastterning();
        b.Kastterning();
        System.out.println ("Terning A:\nAntall kast: " + a.getAntallKast() + "\nSum poeng: " + a.getSumPoeng() + "\nTerning B:\nAntall kast: " + a.getAntallKast() + "\nSum poeng: " + b.getSumPoeng());





    }

    if (a.getSumPoeng() == 100){
        System.out.println (" A vant!!!!!");


    } else {
        System.out.println(" B vant!!!!! ");
    }
    






    }




}
