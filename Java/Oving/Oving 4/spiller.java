import java.util.Random;



public class spiller {

    private int SumPoeng;
    private int AntallKast;
    private Random terning;

    public spiller (int SumPoeng, int AntallKast){
        this.SumPoeng = SumPoeng;
        this.AntallKast = AntallKast;
        this.terning = new Random();


    }

public int getSumPoeng () {
    return SumPoeng;
}

public int getAntallKast () {
    return AntallKast;


}

public void setSumPoeng (int SumPoeng) {
    this.SumPoeng = SumPoeng;

}


public int Kastterning () {
    int terningkast = terning.nextInt (5)+1;
    AntallKast++;
    if (getSumPoeng() > 100){
        setSumPoeng(getSumPoeng() - terningkast);


    } else {
        setSumPoeng(getSumPoeng() + terningkast);
    }

    
    
    if (terningkast == 1) {
        SumPoeng = 0;


    }
    return SumPoeng;




}

public boolean erferdig(){
    if (SumPoeng == 100){
        return true;
    }   else {
        return false;
    }
}



}





















