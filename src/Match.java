public class Match {
    Fighter f1;
    Fighter f2;
    Fighter start;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2= f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    void  run(){
        int raunt =1;
      if (isCheck()){
          while (this.f1.health>0 && this.f2.health>0){

              if (this.f1.isStart()){
                  System.out.println("======= RAUNT "+ (raunt++)+" =======" );
                  System.out.println("Ringde ilk başlayan "+this.f1.name);
                  this.f2.health =this.f1.hit(this.f2);

                  if (isWin()){
                      break;
                  }
                  System.out.println(this.f1.name+" Kalan Can :"+this.f1.health);
                  System.out.println(this.f2.name+" Kalan Can :"+this.f2.health);
              } else if (this.f2.isStart()) {
                  System.out.println("======= RAUNT "+ (raunt++)+" =======" );
                  System.out.println("Ringde ilk başlayan "+this.f2.name);
                  this.f1.health = this.f2.hit(this.f1);

                  if (isWin()){
                      break;
                  }
                  System.out.println(this.f1.name+" Kalan Can :"+this.f1.health);
                  System.out.println(this.f2.name+" Kalan Can :"+this.f2.health);
              }

          }
      }else {
          System.out.println("Oyuncukarın ağırlıkları Sklet kuralları ile uyuşmuyor.");
      }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+ " kazandı !");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name+ " kazandı !");
            return  true;
        }
        return false;
    }
}
