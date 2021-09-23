














public class Brøk {
    private int teller;
    private int nevner;


public Brøk (int teller, int nevner) {
    if (nevner == 0){
        throw new IllegalArgumentException(" Ugyldig verdi på nevneren ");
    }
    this.teller = teller;
    this.nevner = nevner;
    
}
    
public Brøk (int teller) {
    this.teller = teller;
    this.nevner = 1;

}

public int getteller() {
    return teller;
}

public int getnevner() {
     return nevner;
}

public void sum(int teller2, int nevner2) {
    this.teller = (this.teller*nevner2)+(teller2*this.nevner);
    this.nevner = this.nevner*nevner2;

    
}
public void sub(int teller2, int nevner2) {
    this.teller = (this.teller*nevner2)-(teller2*this.nevner);


}
public void multi(int teller2, int nevner2) {
    this.teller = this.teller*teller2;
    this.nevner = this.nevner*nevner2;

    
}
public void div(int teller2, int nevner2) {
    this.teller = this.teller*nevner2;
    this.nevner = this.nevner*teller2;

}
public String toString() {
    return this.teller + "/" + this.nevner;
}


}












