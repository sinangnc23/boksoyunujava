package boksor;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(Fighter f12, Fighter f21) {
        Fighter f1 = f12;
        Fighter f2 = f21;

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health <= 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }
    public boolean firstStrike(){
        int random_int = (int)Math.floor(Math.random() * (10 - 1 + 1) + 1);
        System.out.println("gelen sayı: "+random_int);
        if (random_int < 6)
            return true;
        else
        return false;
    }
}