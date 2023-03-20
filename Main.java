package boksor;

public class Main {
    public static void main(String[] args) {
      Fighter sinan = new Fighter("Sinan" , 10 , 100, 90, 0);
      Fighter alper = new Fighter("Alper" , 10 , 95, 100, 0);
      Ring r = new Ring(sinan,alper , 90 , 100);
      if(r.firstStrike()){
        r.run(sinan,alper);}
        else{
            r.run(alper,sinan);
        }
    }
}