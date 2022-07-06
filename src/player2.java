


public class player2 extends player1{
        private int health;
        private boolean armor;


  public player2 (String name , String weapon , int health , boolean armor){
        super(name, weapon, health);
        this.health = health;
        this.armor = armor;
  }

   @Override
   public void damagedbyGun1(){
     if(armor){
        this.health -= 20;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("the player2 is hit by gun 1 and health is reduced by 20 New health is" + this.health);
     }
     if(!armor){
        this.health -= 30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("the player2 is hit by gun 1 and health is reduced by 30 New health is" + this.health);
     }
     if(this.health==0){
        System.out.println(getname() + "is dead");
     }
   }

   
   @Override
   public void damagedbyGun2(){
     if(armor){
        this.health -= 40;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("the player2 is hit by gun 1 and health is reduced by 20 New health is" + this.health);
     }
     if(!armor){
        this.health -= 50;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("the player2 is hit by gun 1 and health is reduced by 30 New health is" + this.health);
     }
     if(this.health==0){
        System.out.println(getname() + "is dead");
     }
   }
   
   @Override
   public void heal(){
    if(health <=0){
        System.out.println("the player is dead can not heal");
    }
    else{
        this.health = 100;
        System.out.println("new health : " + this.health);
    }
}


}
