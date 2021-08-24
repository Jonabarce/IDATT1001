public class Omregning {
public static void main (String [] args) {
    int time = 3600;
    int minutt = 60;
    int sekund = 1;
    double test_time = 0.5;
    double test_minutt = 34;
    double test_sekund = 16;
    double totalt = ((test_time*time)+(test_minutt*minutt)+(test_sekund));
    System.out.println (test_time + " timer," + test_minutt + " minutter og " + test_sekund + "sekunder, er det samme som");
    System.out.println (totalt + " sekunder ");

}

}
